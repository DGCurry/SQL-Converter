/**
 */
package nl.tue.gtl.tql.model.util;

import nl.tue.gtl.tql.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.tue.gtl.tql.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModelPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = caseBlock(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.COLUMN: {
			Column column = (Column) theEObject;
			T result = caseColumn(column);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.SOURCE_TABLE: {
			SourceTable sourceTable = (SourceTable) theEObject;
			T result = caseSourceTable(sourceTable);
			if (result == null)
				result = caseTable(sourceTable);
			if (result == null)
				result = caseBlock(sourceTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TARGET_TABLE: {
			TargetTable targetTable = (TargetTable) theEObject;
			T result = caseTargetTable(targetTable);
			if (result == null)
				result = caseTable(targetTable);
			if (result == null)
				result = caseBlock(targetTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MAPPING: {
			Mapping mapping = (Mapping) theEObject;
			T result = caseMapping(mapping);
			if (result == null)
				result = caseBlock(mapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MAPPED_COLUMN: {
			MappedColumn mappedColumn = (MappedColumn) theEObject;
			T result = caseMappedColumn(mappedColumn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TRANSFORMATION: {
			Transformation transformation = (Transformation) theEObject;
			T result = caseTransformation(transformation);
			if (result == null)
				result = caseBlock(transformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TRANSFORMATION_CALL: {
			TransformationCall transformationCall = (TransformationCall) theEObject;
			T result = caseTransformationCall(transformationCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CALL_PARAMETER: {
			CallParameter callParameter = (CallParameter) theEObject;
			T result = caseCallParameter(callParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONSTANT: {
			Constant constant = (Constant) theEObject;
			T result = caseConstant(constant);
			if (result == null)
				result = caseExpression(constant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.STRING_CONSTANT: {
			StringConstant stringConstant = (StringConstant) theEObject;
			T result = caseStringConstant(stringConstant);
			if (result == null)
				result = caseConstant(stringConstant);
			if (result == null)
				result = caseExpression(stringConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.INTEGER_CONSTANT: {
			IntegerConstant integerConstant = (IntegerConstant) theEObject;
			T result = caseIntegerConstant(integerConstant);
			if (result == null)
				result = caseConstant(integerConstant);
			if (result == null)
				result = caseExpression(integerConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.FLOAT_CONSTANT: {
			FloatConstant floatConstant = (FloatConstant) theEObject;
			T result = caseFloatConstant(floatConstant);
			if (result == null)
				result = caseConstant(floatConstant);
			if (result == null)
				result = caseExpression(floatConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.DATE_CONSTANT: {
			DateConstant dateConstant = (DateConstant) theEObject;
			T result = caseDateConstant(dateConstant);
			if (result == null)
				result = caseConstant(dateConstant);
			if (result == null)
				result = caseExpression(dateConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.NULL_CONSTANT: {
			NullConstant nullConstant = (NullConstant) theEObject;
			T result = caseNullConstant(nullConstant);
			if (result == null)
				result = caseConstant(nullConstant);
			if (result == null)
				result = caseExpression(nullConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.SET_CONSTANT: {
			SetConstant setConstant = (SetConstant) theEObject;
			T result = caseSetConstant(setConstant);
			if (result == null)
				result = caseConstant(setConstant);
			if (result == null)
				result = caseExpression(setConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONSTANT_CALL_PARAMETER: {
			ConstantCallParameter constantCallParameter = (ConstantCallParameter) theEObject;
			T result = caseConstantCallParameter(constantCallParameter);
			if (result == null)
				result = caseCallParameter(constantCallParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.REFERENCE_CALL_PARAMETER: {
			ReferenceCallParameter referenceCallParameter = (ReferenceCallParameter) theEObject;
			T result = caseReferenceCallParameter(referenceCallParameter);
			if (result == null)
				result = caseCallParameter(referenceCallParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.BOOLEAN_CONSTANT: {
			BooleanConstant booleanConstant = (BooleanConstant) theEObject;
			T result = caseBooleanConstant(booleanConstant);
			if (result == null)
				result = caseConstant(booleanConstant);
			if (result == null)
				result = caseExpression(booleanConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PARAMETER_EXPRESSION: {
			ParameterExpression parameterExpression = (ParameterExpression) theEObject;
			T result = caseParameterExpression(parameterExpression);
			if (result == null)
				result = caseExpression(parameterExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.COLUMN_EXPRESSION: {
			ColumnExpression columnExpression = (ColumnExpression) theEObject;
			T result = caseColumnExpression(columnExpression);
			if (result == null)
				result = caseExpression(columnExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.BINARY_OPERATOR_EXPRESSION: {
			BinaryOperatorExpression binaryOperatorExpression = (BinaryOperatorExpression) theEObject;
			T result = caseBinaryOperatorExpression(binaryOperatorExpression);
			if (result == null)
				result = caseExpression(binaryOperatorExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.SELF_EXPRESSION: {
			SelfExpression selfExpression = (SelfExpression) theEObject;
			T result = caseSelfExpression(selfExpression);
			if (result == null)
				result = caseExpression(selfExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceTable(SourceTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetTable(TargetTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapped Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapped Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappedColumn(MappedColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationCall(TransformationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallParameter(CallParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatConstant(FloatConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateConstant(DateConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullConstant(NullConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConstant(SetConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Call Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantCallParameter(ConstantCallParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Call Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceCallParameter(ReferenceCallParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterExpression(ParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnExpression(ColumnExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperatorExpression(BinaryOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfExpression(SelfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
