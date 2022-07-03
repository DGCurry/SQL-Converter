/**
 */
package tqlModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tqlModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TqlModelFactoryImpl extends EFactoryImpl implements TqlModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TqlModelFactory init() {
		try {
			TqlModelFactory theTqlModelFactory = (TqlModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(TqlModelPackage.eNS_URI);
			if (theTqlModelFactory != null) {
				return theTqlModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TqlModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TqlModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TqlModelPackage.PARAMETER_EXPRESSION:
			return createparameterExpression();
		case TqlModelPackage.STRING_CONSTANT_EXPRESSION:
			return createStringConstantExpression();
		case TqlModelPackage.BOOLEAN_CONSTANT_EXPRESSION:
			return createBooleanConstantExpression();
		case TqlModelPackage.INTEGER_CONSTANT_EXPRESSION:
			return createIntegerConstantExpression();
		case TqlModelPackage.MAPPING_SOURCE_TABLE:
			return createMappingSourceTable();
		case TqlModelPackage.MAPPING:
			return createMapping();
		case TqlModelPackage.IN_EXPRESSION:
			return createInExpression();
		case TqlModelPackage.TABLE:
			return createTable();
		case TqlModelPackage.CONDITIONAL_STATEMENT:
			return createConditionalStatement();
		case TqlModelPackage.PARSE_EXPRESSION:
			return createParseExpression();
		case TqlModelPackage.FLOAT_CONSTANT_EXPRESSION:
			return createFloatConstantExpression();
		case TqlModelPackage.MAPPING_TARGET_TABLE:
			return createMappingTargetTable();
		case TqlModelPackage.MAPPING_FIELD:
			return createMappingField();
		case TqlModelPackage.BINARY_OPERATION_EXPRESSION:
			return createBinaryOperationExpression();
		case TqlModelPackage.TABLE_FIELD:
			return createTableField();
		case TqlModelPackage.TRANSFORMATION:
			return createTransformation();
		case TqlModelPackage.BOOLEAN_OPERATION_EXPRESSION:
			return createBooleanOperationExpression();
		case TqlModelPackage.PARAMETER:
			return createParameter();
		case TqlModelPackage.TRANSFORMATION_CALL:
			return createTransformationCall();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TqlModelPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case TqlModelPackage.BINARY_FUNCTION:
			return createBinaryFunctionFromString(eDataType, initialValue);
		case TqlModelPackage.BOOLEAN_FUNCTION:
			return createBooleanFunctionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TqlModelPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case TqlModelPackage.BINARY_FUNCTION:
			return convertBinaryFunctionToString(eDataType, instanceValue);
		case TqlModelPackage.BOOLEAN_FUNCTION:
			return convertBooleanFunctionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parameterExpression createparameterExpression() {
		parameterExpressionImpl parameterExpression = new parameterExpressionImpl();
		return parameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstantExpression createStringConstantExpression() {
		StringConstantExpressionImpl stringConstantExpression = new StringConstantExpressionImpl();
		return stringConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstantExpression createBooleanConstantExpression() {
		BooleanConstantExpressionImpl booleanConstantExpression = new BooleanConstantExpressionImpl();
		return booleanConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstantExpression createIntegerConstantExpression() {
		IntegerConstantExpressionImpl integerConstantExpression = new IntegerConstantExpressionImpl();
		return integerConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSourceTable createMappingSourceTable() {
		MappingSourceTableImpl mappingSourceTable = new MappingSourceTableImpl();
		return mappingSourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InExpression createInExpression() {
		InExpressionImpl inExpression = new InExpressionImpl();
		return inExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStatement createConditionalStatement() {
		ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
		return conditionalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseExpression createParseExpression() {
		ParseExpressionImpl parseExpression = new ParseExpressionImpl();
		return parseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatConstantExpression createFloatConstantExpression() {
		FloatConstantExpressionImpl floatConstantExpression = new FloatConstantExpressionImpl();
		return floatConstantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTargetTable createMappingTargetTable() {
		MappingTargetTableImpl mappingTargetTable = new MappingTargetTableImpl();
		return mappingTargetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingField createMappingField() {
		MappingFieldImpl mappingField = new MappingFieldImpl();
		return mappingField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperationExpression createBinaryOperationExpression() {
		BinaryOperationExpressionImpl binaryOperationExpression = new BinaryOperationExpressionImpl();
		return binaryOperationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableField createTableField() {
		TableFieldImpl tableField = new TableFieldImpl();
		return tableField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationExpression createBooleanOperationExpression() {
		BooleanOperationExpressionImpl booleanOperationExpression = new BooleanOperationExpressionImpl();
		return booleanOperationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationCall createTransformationCall() {
		TransformationCallImpl transformationCall = new TransformationCallImpl();
		return transformationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFunction createBinaryFunctionFromString(EDataType eDataType, String initialValue) {
		BinaryFunction result = BinaryFunction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFunction createBooleanFunctionFromString(EDataType eDataType, String initialValue) {
		BooleanFunction result = BooleanFunction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TqlModelPackage getTqlModelPackage() {
		return (TqlModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TqlModelPackage getPackage() {
		return TqlModelPackage.eINSTANCE;
	}

} //TqlModelFactoryImpl
