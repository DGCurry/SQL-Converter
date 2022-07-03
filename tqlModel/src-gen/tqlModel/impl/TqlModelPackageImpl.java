/**
 */
package tqlModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tqlModel.BinaryFunction;
import tqlModel.BinaryOperationExpression;
import tqlModel.Block;
import tqlModel.BooleanConstantExpression;
import tqlModel.BooleanFunction;
import tqlModel.BooleanOperationExpression;
import tqlModel.ConditionalStatement;
import tqlModel.ConstantExpression;
import tqlModel.Expression;
import tqlModel.FloatConstantExpression;
import tqlModel.InExpression;
import tqlModel.IntegerConstantExpression;
import tqlModel.Mapping;
import tqlModel.MappingField;
import tqlModel.MappingSourceTable;
import tqlModel.MappingTargetTable;
import tqlModel.OperationExpression;
import tqlModel.Parameter;
import tqlModel.ParseExpression;
import tqlModel.Statement;
import tqlModel.StringConstantExpression;
import tqlModel.Table;
import tqlModel.TableField;
import tqlModel.TqlModelFactory;
import tqlModel.TqlModelPackage;
import tqlModel.Transformation;
import tqlModel.TransformationCall;
import tqlModel.Type;
import tqlModel.parameterExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TqlModelPackageImpl extends EPackageImpl implements TqlModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingSourceTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatConstantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingTargetTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanFunctionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tqlModel.TqlModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TqlModelPackageImpl() {
		super(eNS_URI, TqlModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TqlModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TqlModelPackage init() {
		if (isInited)
			return (TqlModelPackage) EPackage.Registry.INSTANCE.getEPackage(TqlModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTqlModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TqlModelPackageImpl theTqlModelPackage = registeredTqlModelPackage instanceof TqlModelPackageImpl
				? (TqlModelPackageImpl) registeredTqlModelPackage
				: new TqlModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTqlModelPackage.createPackageContents();

		// Initialize created meta-data
		theTqlModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTqlModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TqlModelPackage.eNS_URI, theTqlModelPackage);
		return theTqlModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparameterExpression() {
		return parameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparameterExpression_Parameter() {
		return (EReference) parameterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstantExpression() {
		return stringConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstantExpression_Value() {
		return (EAttribute) stringConstantExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstantExpression() {
		return booleanConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstantExpression_Value() {
		return (EAttribute) booleanConstantExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstantExpression() {
		return integerConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstantExpression_Value() {
		return (EAttribute) integerConstantExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingSourceTable() {
		return mappingSourceTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Source() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Target() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Fields() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_When() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInExpression() {
		return inExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInExpression_Statement() {
		return (EReference) inExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInExpression_ConstantSet() {
		return (EReference) inExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStatement() {
		return conditionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_Condition() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_IfBody() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_ElseBody() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_Booleanoperationexpression() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParseExpression() {
		return parseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseExpression_OutputType() {
		return (EAttribute) parseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParseExpression_Expression() {
		return (EReference) parseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatConstantExpression() {
		return floatConstantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatConstantExpression_Value() {
		return (EAttribute) floatConstantExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression() {
		return constantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingTargetTable() {
		return mappingTargetTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingField() {
		return mappingFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingField_SouceField() {
		return (EReference) mappingFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingField_TargetField() {
		return (EReference) mappingFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingField_Calls() {
		return (EReference) mappingFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperationExpression() {
		return binaryOperationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryOperationExpression_Operation() {
		return (EAttribute) binaryOperationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableField() {
		return tableFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableField_Type() {
		return (EAttribute) tableFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableField_Name() {
		return (EAttribute) tableFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_ReturnType() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_SelfType() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Label() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ReturnStatement() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Parameter() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperationExpression() {
		return booleanOperationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanOperationExpression_Operation() {
		return (EAttribute) booleanOperationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Label() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationCall() {
		return transformationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationCall_Transformation() {
		return (EReference) transformationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationCall_Parameters() {
		return (EReference) transformationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationExpression() {
		return operationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationExpression_Right() {
		return (EReference) operationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationExpression_Left() {
		return (EReference) operationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryFunction() {
		return binaryFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanFunction() {
		return booleanFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TqlModelFactory getTqlModelFactory() {
		return (TqlModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);
		createEReference(parameterExpressionEClass, PARAMETER_EXPRESSION__PARAMETER);

		stringConstantExpressionEClass = createEClass(STRING_CONSTANT_EXPRESSION);
		createEAttribute(stringConstantExpressionEClass, STRING_CONSTANT_EXPRESSION__VALUE);

		booleanConstantExpressionEClass = createEClass(BOOLEAN_CONSTANT_EXPRESSION);
		createEAttribute(booleanConstantExpressionEClass, BOOLEAN_CONSTANT_EXPRESSION__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		integerConstantExpressionEClass = createEClass(INTEGER_CONSTANT_EXPRESSION);
		createEAttribute(integerConstantExpressionEClass, INTEGER_CONSTANT_EXPRESSION__VALUE);

		mappingSourceTableEClass = createEClass(MAPPING_SOURCE_TABLE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__SOURCE);
		createEReference(mappingEClass, MAPPING__TARGET);
		createEReference(mappingEClass, MAPPING__FIELDS);
		createEReference(mappingEClass, MAPPING__WHEN);

		inExpressionEClass = createEClass(IN_EXPRESSION);
		createEReference(inExpressionEClass, IN_EXPRESSION__STATEMENT);
		createEReference(inExpressionEClass, IN_EXPRESSION__CONSTANT_SET);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__COLUMNS);

		conditionalStatementEClass = createEClass(CONDITIONAL_STATEMENT);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__CONDITION);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__IF_BODY);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__ELSE_BODY);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION);

		parseExpressionEClass = createEClass(PARSE_EXPRESSION);
		createEAttribute(parseExpressionEClass, PARSE_EXPRESSION__OUTPUT_TYPE);
		createEReference(parseExpressionEClass, PARSE_EXPRESSION__EXPRESSION);

		floatConstantExpressionEClass = createEClass(FLOAT_CONSTANT_EXPRESSION);
		createEAttribute(floatConstantExpressionEClass, FLOAT_CONSTANT_EXPRESSION__VALUE);

		constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);

		mappingTargetTableEClass = createEClass(MAPPING_TARGET_TABLE);

		mappingFieldEClass = createEClass(MAPPING_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__SOUCE_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__TARGET_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__CALLS);

		statementEClass = createEClass(STATEMENT);

		binaryOperationExpressionEClass = createEClass(BINARY_OPERATION_EXPRESSION);
		createEAttribute(binaryOperationExpressionEClass, BINARY_OPERATION_EXPRESSION__OPERATION);

		tableFieldEClass = createEClass(TABLE_FIELD);
		createEAttribute(tableFieldEClass, TABLE_FIELD__TYPE);
		createEAttribute(tableFieldEClass, TABLE_FIELD__NAME);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__RETURN_TYPE);
		createEAttribute(transformationEClass, TRANSFORMATION__SELF_TYPE);
		createEAttribute(transformationEClass, TRANSFORMATION__LABEL);
		createEReference(transformationEClass, TRANSFORMATION__RETURN_STATEMENT);
		createEReference(transformationEClass, TRANSFORMATION__PARAMETER);

		blockEClass = createEClass(BLOCK);

		booleanOperationExpressionEClass = createEClass(BOOLEAN_OPERATION_EXPRESSION);
		createEAttribute(booleanOperationExpressionEClass, BOOLEAN_OPERATION_EXPRESSION__OPERATION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__LABEL);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		transformationCallEClass = createEClass(TRANSFORMATION_CALL);
		createEReference(transformationCallEClass, TRANSFORMATION_CALL__TRANSFORMATION);
		createEReference(transformationCallEClass, TRANSFORMATION_CALL__PARAMETERS);

		operationExpressionEClass = createEClass(OPERATION_EXPRESSION);
		createEReference(operationExpressionEClass, OPERATION_EXPRESSION__RIGHT);
		createEReference(operationExpressionEClass, OPERATION_EXPRESSION__LEFT);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		binaryFunctionEEnum = createEEnum(BINARY_FUNCTION);
		booleanFunctionEEnum = createEEnum(BOOLEAN_FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterExpressionEClass.getESuperTypes().add(this.getExpression());
		stringConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		booleanConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		integerConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		mappingSourceTableEClass.getESuperTypes().add(this.getTable());
		mappingEClass.getESuperTypes().add(this.getBlock());
		inExpressionEClass.getESuperTypes().add(this.getExpression());
		tableEClass.getESuperTypes().add(this.getBlock());
		conditionalStatementEClass.getESuperTypes().add(this.getStatement());
		parseExpressionEClass.getESuperTypes().add(this.getExpression());
		floatConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		constantExpressionEClass.getESuperTypes().add(this.getExpression());
		mappingTargetTableEClass.getESuperTypes().add(this.getTable());
		statementEClass.getESuperTypes().add(this.getExpression());
		binaryOperationExpressionEClass.getESuperTypes().add(this.getOperationExpression());
		transformationEClass.getESuperTypes().add(this.getBlock());
		booleanOperationExpressionEClass.getESuperTypes().add(this.getOperationExpression());
		operationExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterExpressionEClass, parameterExpression.class, "parameterExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getparameterExpression_Parameter(), this.getParameter(), null, "parameter", null, 1, 1,
				parameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantExpressionEClass, StringConstantExpression.class, "StringConstantExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstantExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				StringConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConstantExpressionEClass, BooleanConstantExpression.class, "BooleanConstantExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstantExpression_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1,
				BooleanConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerConstantExpressionEClass, IntegerConstantExpression.class, "IntegerConstantExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstantExpression_Value(), ecorePackage.getEInt(), "value", null, 1, 1,
				IntegerConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingSourceTableEClass, MappingSourceTable.class, "MappingSourceTable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Source(), this.getMappingSourceTable(), null, "source", null, 0, -1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Target(), this.getMappingTargetTable(), null, "target", null, 0, -1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Fields(), this.getMappingField(), null, "fields", null, 1, -1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_When(), this.getBooleanOperationExpression(), null, "when", null, 0, 1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inExpressionEClass, InExpression.class, "InExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInExpression_Statement(), this.getExpression(), null, "statement", null, 0, 1,
				InExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInExpression_ConstantSet(), this.getConstantExpression(), null, "constantSet", null, 1, -1,
				InExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getTableField(), null, "columns", null, 1, -1, Table.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_IfBody(), this.getStatement(), null, "ifBody", null, 1, -1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_ElseBody(), this.getStatement(), null, "elseBody", null, 1, -1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_Booleanoperationexpression(), this.getBooleanOperationExpression(), null,
				"booleanoperationexpression", null, 1, 1, ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parseExpressionEClass, ParseExpression.class, "ParseExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParseExpression_OutputType(), this.getType(), "outputType", null, 0, 1, ParseExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParseExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				ParseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatConstantExpressionEClass, FloatConstantExpression.class, "FloatConstantExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatConstantExpression_Value(), ecorePackage.getEFloat(), "value", null, 1, 1,
				FloatConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingTargetTableEClass, MappingTargetTable.class, "MappingTargetTable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingFieldEClass, MappingField.class, "MappingField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingField_SouceField(), this.getTableField(), null, "souceField", null, 1, 1,
				MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingField_TargetField(), this.getTableField(), null, "targetField", null, 1, 1,
				MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingField_Calls(), this.getTransformationCall(), null, "calls", null, 0, -1,
				MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationExpressionEClass, BinaryOperationExpression.class, "BinaryOperationExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryOperationExpression_Operation(), this.getBinaryFunction(), "operation", null, 0, 1,
				BinaryOperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableFieldEClass, TableField.class, "TableField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableField_Type(), this.getType(), "type", null, 1, 1, TableField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableField_Name(), ecorePackage.getEString(), "name", null, 1, 1, TableField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_ReturnType(), this.getType(), "returnType", null, 1, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_SelfType(), this.getType(), "selfType", null, 1, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ReturnStatement(), this.getExpression(), null, "returnStatement", null, 1, -1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Parameter(), this.getParameter(), null, "parameter", null, 0, -1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperationExpressionEClass, BooleanOperationExpression.class, "BooleanOperationExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanOperationExpression_Operation(), this.getBooleanFunction(), "operation", null, 0, 1,
				BooleanOperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getType(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationCallEClass, TransformationCall.class, "TransformationCall", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationCall_Transformation(), this.getTransformation(), null, "transformation", null,
				1, 1, TransformationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationCall_Parameters(), this.getTableField(), null, "parameters", null, 0, -1,
				TransformationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationExpressionEClass, OperationExpression.class, "OperationExpression", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationExpression_Right(), this.getExpression(), null, "right", null, 1, 1,
				OperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationExpression_Left(), this.getExpression(), null, "left", null, 1, 1,
				OperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.FLOATS);
		addEEnumLiteral(typeEEnum, Type.SETS);
		addEEnumLiteral(typeEEnum, Type.DATE_TIME);
		addEEnumLiteral(typeEEnum, Type.NULL);
		addEEnumLiteral(typeEEnum, Type.BOOL);

		initEEnum(binaryFunctionEEnum, BinaryFunction.class, "BinaryFunction");
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.MULT);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.SUM);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.DIVIDE);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.CONCAT);

		initEEnum(booleanFunctionEEnum, BooleanFunction.class, "BooleanFunction");
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.EQUAL);
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.NOTEQUAL);
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.SMALLER);
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.GREATER);
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.OR);
		addEEnumLiteral(booleanFunctionEEnum, BooleanFunction.AND);

		// Create resource
		createResource(eNS_URI);
	}

} //TqlModelPackageImpl
