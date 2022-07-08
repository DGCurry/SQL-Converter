/*
 * generated by Xtext 2.27.0
 */
package nl.tue.gtl.validation;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import nl.tue.gtl.tql.model.*;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class TQLValidator extends AbstractTQLValidator {
		
	/* +++ ERROR STRINGS MAPPING +++ */
	private static final String INVALID_ASSIGNMENT_TYPE = "Invalid assignment type of target field";
	private static final String INVALID_IN_TYPE = "Invalid input type for mapping";
	
	/* +++ ERROR STRINGS FOR TRANSFORMATION +++ */
	private static final String INVALID_PARAMETER_SIZE = "Invalid transformation call, size does not compare";
	private static final String INVALID_PARAMETER_TYPE = "Invalid transformation call, type does not compare";

	public static final String INVALID_NAME = "invalidName";
	    
	
	/**
	 * Switch statement for expressions
	 * @param expression Expression to decide against
	 * @return ExpressionDecorator with the expression to decide loaded in
	 */
	private ExpressionDecorator switchExpression(Object expression) {
		return new ExpressionDecorator(expression);
	}
	
	/**
	 * Nested class that checks the subtype of an expression
	 * Used as a sort of switch statement
	 * @author Diederik Geertzen
	 *
	 */
	private class ExpressionDecorator {
		private Object expression;
		private Type foundType;
		
		public ExpressionDecorator(Object constant) {
			this.expression = constant;
		}
		
		/**
		 * For a constant expression, we decide whether the expression is of given Type
		 * @param c
		 * @param assignType
		 * @return
		 */
		public ExpressionDecorator checkExpressionType(Class c, Type assignType) {
			if (c.isAssignableFrom(expression.getClass())) {
				this.foundType = assignType;
			}
			return this;
		}		
		
		/**
		 * For a binary operator, we decide the most common Type. 
		 * If it has no common Type, found Type will be set to null.
		 * @param b The binary operator left and right are part of
		 * @param left The type found in the left argument of the binary operator
		 * @param right The type found in the left argument of the binary operator
		 * @return this
		 */
		public ExpressionDecorator checkExpressionType(BinaryOperatorExpression b, Type left, Type right) {
			System.out.println("getting type " + b + " " + left + " " + right);
			if (b == null || left == null || right == null) return this;
			if (Arrays.asList(Operator.ADD, Operator.SUBTRACT, Operator.DIVIDE, Operator.MULTIPLY).contains(b.getOperator())) {
				if (left.equals(Type.FLOAT) || right.equals(Type.FLOAT)) {
					this.foundType = Type.FLOAT;
				} else if (left.equals(Type.INTEGER) && right.equals(Type.INTEGER)) {
					this.foundType = Type.INTEGER;
				} else {
					this.foundType = null;
				}
			} else if (Arrays.asList(Operator.AND, Operator.OR).contains(b.getOperator())) {
				if (left.equals(Type.BOOLEAN) || right.equals(Type.BOOLEAN)) {
					this.foundType = Type.BOOLEAN;
				} else {
					this.foundType = null;
				}
			} else if (Arrays.asList(Operator.LESS, Operator.GREATER).contains(b.getOperator())) {
				if (Arrays.asList(Type.FLOAT, Type.INTEGER).contains(left) && Arrays.asList(Type.FLOAT, Type.INTEGER).contains(right)) {
					this.foundType = Type.BOOLEAN;
				} else {
					this.foundType = null;
				}
			} else if (Arrays.asList(Operator.EQUALS, Operator.NOT_EQUALS).contains(b.getOperator())) {
				if (left.equals(Type.FLOAT)) {
					this.foundType = (right.equals(Type.FLOAT) || right.equals(Type.INTEGER)) ? Type.FLOAT : null;
				} else if (right.equals(Type.FLOAT)) {
					this.foundType = (left.equals(Type.FLOAT) || left.equals(Type.INTEGER)) ? Type.FLOAT : null;
				} else if (right.equals(left)) {
					this.foundType = right;
				} else {
					this.foundType = null;
				}
			}
			return this;
		}	
	}
	
    @Check(CheckType.FAST)
    private void checkCallParameters(TransformationCall tc) {
    	// check if callParameters correspond with the transformation parameters
    	EList<CallParameter> cp = tc.getCallParameters();
    	EList<Parameter> p  = tc.getTransformation().getParameters();
		if (cp.size() != p.size()) { // amount of parameters does not match
			error("ERROR: " + INVALID_PARAMETER_SIZE + " :: Expected " + p.size() + " parameter(s), got " + cp.size(), null);
		}
    	for (int i = 0; i < cp.size(); i++) {
    		if (cp.get(i) instanceof ReferenceCallParameter) { // either parameter is a ReferenceCallParameter
    			if (((ReferenceCallParameter) cp.get(i)).getReference().getType() != p.get(i).getType()) {
        			error("ERROR: " + INVALID_PARAMETER_TYPE + " :: Expected " + p.get(i).getType() + ", got " + ((ReferenceCallParameter) cp.get(i)).getReference().getType() , null);
    			}
    		} else { // or a ConstantCallParameter (type must be decided)
//    			System.err.println(decideExpressionType(((ConstantCallParameter)cp.get(i)).getParameter()));
    		}
    	}
    }
    
    @Check(CheckType.FAST)
    private Type decideExpressionType(Expression expression) {
    	Type type =  switchExpression(expression)
        .checkExpressionType(BooleanConstant.class, Type.BOOLEAN) // CONSTANTS
        .checkExpressionType(FloatConstant.class, Type.FLOAT)
        .checkExpressionType(StringConstant.class, Type.STRING)
        .checkExpressionType(IntegerConstant.class, Type.INTEGER)
        .checkExpressionType(NullConstant.class, Type.NULL)
    	.checkExpressionType(
    			(expression instanceof BinaryOperatorExpression) ? (BinaryOperatorExpression)expression : null, 
    			(expression instanceof BinaryOperatorExpression) ? decideExpressionType(((BinaryOperatorExpression)expression).getLeft()) : null, 
				(expression instanceof BinaryOperatorExpression) ? decideExpressionType(((BinaryOperatorExpression)expression).getRight()) : null) // FUNCTION, recursive check
    	.foundType;
    	System.err.println(expression + " " + type);
    	return type;
    }
    

    
	/**
	 * Fast check of the Mapping function. 
	 * Check if SourceTable and TargetTable existed on compilation
	 * @param mapping
	 */
	@Check(CheckType.FAST)
	private void checkMapping(MappedColumn mc) {
		checkTypesCompatibleTransformationChain((List<TransformationCall>)mc.getTransformationCalls(), mc.getSource().getType());
		
		if (mc.getTarget().getType() != mc.getTransformationCalls().get(mc.getTransformationCalls().size() - 1).getTransformation().getOutType()) {
			System.out.println("Expected type " + mc.getTarget().getType() + ", got " + mc.getTransformationCalls().get(mc.getTransformationCalls().size() - 1).getTransformation().getOutType());
			 error("ERROR: " + INVALID_ASSIGNMENT_TYPE, null);
		}
	}
	
	private void checkTypesCompatibleTransformationChain(List<TransformationCall> tc, Type currentType) {
		if (tc.size() == 0) return; // 
		if (currentType == tc.get(0).getTransformation().getInType()) {
			checkTypesCompatibleTransformationChain((List<TransformationCall>) tc.subList(1, tc.size()), tc.get(0).getTransformation().getInType());
		} else {
			 error("ERROR: " + INVALID_IN_TYPE + " :: Expected " + tc.get(0).getTransformation().getInType() + ", got " + currentType + " for " + tc.get(0).getTransformation().getName(), null);
				checkTypesCompatibleTransformationChain((List<TransformationCall>) tc.subList(1, tc.size()), tc.get(0).getTransformation().getInType());
		}
	}
}
