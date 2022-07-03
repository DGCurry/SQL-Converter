/**
 */
package tqlModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tqlModel.*;

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
 * @see tqlModel.TqlModelPackage
 * @generated
 */
public class TqlModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TqlModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TqlModelSwitch() {
		if (modelPackage == null) {
			modelPackage = TqlModelPackage.eINSTANCE;
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
		case TqlModelPackage.PARAMETER_EXPRESSION: {
			parameterExpression parameterExpression = (parameterExpression) theEObject;
			T result = caseparameterExpression(parameterExpression);
			if (result == null)
				result = caseExpression(parameterExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.STRING_CONSTANT_EXPRESSION: {
			StringConstantExpression stringConstantExpression = (StringConstantExpression) theEObject;
			T result = caseStringConstantExpression(stringConstantExpression);
			if (result == null)
				result = caseConstantExpression(stringConstantExpression);
			if (result == null)
				result = caseExpression(stringConstantExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.BOOLEAN_CONSTANT_EXPRESSION: {
			BooleanConstantExpression booleanConstantExpression = (BooleanConstantExpression) theEObject;
			T result = caseBooleanConstantExpression(booleanConstantExpression);
			if (result == null)
				result = caseConstantExpression(booleanConstantExpression);
			if (result == null)
				result = caseExpression(booleanConstantExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.INTEGER_CONSTANT_EXPRESSION: {
			IntegerConstantExpression integerConstantExpression = (IntegerConstantExpression) theEObject;
			T result = caseIntegerConstantExpression(integerConstantExpression);
			if (result == null)
				result = caseConstantExpression(integerConstantExpression);
			if (result == null)
				result = caseExpression(integerConstantExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.MAPPING_SOURCE_TABLE: {
			MappingSourceTable mappingSourceTable = (MappingSourceTable) theEObject;
			T result = caseMappingSourceTable(mappingSourceTable);
			if (result == null)
				result = caseTable(mappingSourceTable);
			if (result == null)
				result = caseBlock(mappingSourceTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.MAPPING: {
			Mapping mapping = (Mapping) theEObject;
			T result = caseMapping(mapping);
			if (result == null)
				result = caseBlock(mapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.IN_EXPRESSION: {
			InExpression inExpression = (InExpression) theEObject;
			T result = caseInExpression(inExpression);
			if (result == null)
				result = caseExpression(inExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = caseBlock(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.CONDITIONAL_STATEMENT: {
			ConditionalStatement conditionalStatement = (ConditionalStatement) theEObject;
			T result = caseConditionalStatement(conditionalStatement);
			if (result == null)
				result = caseStatement(conditionalStatement);
			if (result == null)
				result = caseExpression(conditionalStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.PARSE_EXPRESSION: {
			ParseExpression parseExpression = (ParseExpression) theEObject;
			T result = caseParseExpression(parseExpression);
			if (result == null)
				result = caseExpression(parseExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.FLOAT_CONSTANT_EXPRESSION: {
			FloatConstantExpression floatConstantExpression = (FloatConstantExpression) theEObject;
			T result = caseFloatConstantExpression(floatConstantExpression);
			if (result == null)
				result = caseConstantExpression(floatConstantExpression);
			if (result == null)
				result = caseExpression(floatConstantExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.CONSTANT_EXPRESSION: {
			ConstantExpression constantExpression = (ConstantExpression) theEObject;
			T result = caseConstantExpression(constantExpression);
			if (result == null)
				result = caseExpression(constantExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.MAPPING_TARGET_TABLE: {
			MappingTargetTable mappingTargetTable = (MappingTargetTable) theEObject;
			T result = caseMappingTargetTable(mappingTargetTable);
			if (result == null)
				result = caseTable(mappingTargetTable);
			if (result == null)
				result = caseBlock(mappingTargetTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.MAPPING_FIELD: {
			MappingField mappingField = (MappingField) theEObject;
			T result = caseMappingField(mappingField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = caseExpression(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.BINARY_OPERATION_EXPRESSION: {
			BinaryOperationExpression binaryOperationExpression = (BinaryOperationExpression) theEObject;
			T result = caseBinaryOperationExpression(binaryOperationExpression);
			if (result == null)
				result = caseOperationExpression(binaryOperationExpression);
			if (result == null)
				result = caseExpression(binaryOperationExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.TABLE_FIELD: {
			TableField tableField = (TableField) theEObject;
			T result = caseTableField(tableField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.TRANSFORMATION: {
			Transformation transformation = (Transformation) theEObject;
			T result = caseTransformation(transformation);
			if (result == null)
				result = caseBlock(transformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.BOOLEAN_OPERATION_EXPRESSION: {
			BooleanOperationExpression booleanOperationExpression = (BooleanOperationExpression) theEObject;
			T result = caseBooleanOperationExpression(booleanOperationExpression);
			if (result == null)
				result = caseOperationExpression(booleanOperationExpression);
			if (result == null)
				result = caseExpression(booleanOperationExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.TRANSFORMATION_CALL: {
			TransformationCall transformationCall = (TransformationCall) theEObject;
			T result = caseTransformationCall(transformationCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TqlModelPackage.OPERATION_EXPRESSION: {
			OperationExpression operationExpression = (OperationExpression) theEObject;
			T result = caseOperationExpression(operationExpression);
			if (result == null)
				result = caseExpression(operationExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparameterExpression(parameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstantExpression(StringConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstantExpression(BooleanConstantExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstantExpression(IntegerConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Source Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Source Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSourceTable(MappingSourceTable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>In Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInExpression(InExpression object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStatement(ConditionalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parse Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parse Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParseExpression(ParseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatConstantExpression(FloatConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExpression(ConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Target Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Target Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingTargetTable(MappingTargetTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingField(MappingField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperationExpression(BinaryOperationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableField(TableField object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperationExpression(BooleanOperationExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationExpression(OperationExpression object) {
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

} //TqlModelSwitch
