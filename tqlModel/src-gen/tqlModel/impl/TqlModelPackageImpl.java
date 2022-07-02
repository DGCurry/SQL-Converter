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
import tqlModel.BooleanConstantExpression;
import tqlModel.Columns;
import tqlModel.ConditionalStatement;
import tqlModel.ConstantExpression;
import tqlModel.Expression;
import tqlModel.FloatConstantExpression;
import tqlModel.InExpression;
import tqlModel.IntegerConstantExpression;
import tqlModel.Mapping;
import tqlModel.MappingField;
import tqlModel.Parameter;
import tqlModel.ParameterStatement;
import tqlModel.ParseExpression;
import tqlModel.ReferenceStatement;
import tqlModel.Source;
import tqlModel.Statement;
import tqlModel.StringConstantExpression;
import tqlModel.Table;
import tqlModel.Target;
import tqlModel.TqlModelFactory;
import tqlModel.TqlModelPackage;
import tqlModel.Transformation;
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
	private EClass parameterStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceStatementEClass = null;

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
	private EClass sourceEClass = null;

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
	private EClass parameterEClass = null;

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
	private EClass targetEClass = null;

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
	private EClass columnsEClass = null;

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
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryFunctionEEnum = null;

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
	public EClass getParameterStatement() {
		return parameterStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterStatement_Statement() {
		return (EReference) parameterStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceStatement() {
		return referenceStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceStatement_Columns() {
		return (EReference) referenceStatementEClass.getEStructuralFeatures().get(0);
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
	public EClass getSource() {
		return sourceEClass;
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
	public EReference getMapping_Condition() {
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
	public EClass getParameter() {
		return parameterEClass;
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
	public EClass getTarget() {
		return targetEClass;
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
	public EReference getMappingField_Transformations() {
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
	public EReference getBinaryOperationExpression_Left() {
		return (EReference) binaryOperationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperationExpression_Right() {
		return (EReference) binaryOperationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryOperationExpression_Operation() {
		return (EAttribute) binaryOperationExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumns() {
		return columnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumns_Type() {
		return (EAttribute) columnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumns_Name() {
		return (EAttribute) columnsEClass.getEStructuralFeatures().get(1);
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
	public EReference getTransformation_Parameters() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_ReturnType() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ReturnStatement() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(2);
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

		stringConstantExpressionEClass = createEClass(STRING_CONSTANT_EXPRESSION);
		createEAttribute(stringConstantExpressionEClass, STRING_CONSTANT_EXPRESSION__VALUE);

		parameterStatementEClass = createEClass(PARAMETER_STATEMENT);
		createEReference(parameterStatementEClass, PARAMETER_STATEMENT__STATEMENT);

		referenceStatementEClass = createEClass(REFERENCE_STATEMENT);
		createEReference(referenceStatementEClass, REFERENCE_STATEMENT__COLUMNS);

		booleanConstantExpressionEClass = createEClass(BOOLEAN_CONSTANT_EXPRESSION);
		createEAttribute(booleanConstantExpressionEClass, BOOLEAN_CONSTANT_EXPRESSION__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		integerConstantExpressionEClass = createEClass(INTEGER_CONSTANT_EXPRESSION);
		createEAttribute(integerConstantExpressionEClass, INTEGER_CONSTANT_EXPRESSION__VALUE);

		sourceEClass = createEClass(SOURCE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__SOURCE);
		createEReference(mappingEClass, MAPPING__TARGET);
		createEReference(mappingEClass, MAPPING__FIELDS);
		createEReference(mappingEClass, MAPPING__CONDITION);

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

		parseExpressionEClass = createEClass(PARSE_EXPRESSION);
		createEAttribute(parseExpressionEClass, PARSE_EXPRESSION__OUTPUT_TYPE);
		createEReference(parseExpressionEClass, PARSE_EXPRESSION__EXPRESSION);

		floatConstantExpressionEClass = createEClass(FLOAT_CONSTANT_EXPRESSION);
		createEAttribute(floatConstantExpressionEClass, FLOAT_CONSTANT_EXPRESSION__VALUE);

		parameterEClass = createEClass(PARAMETER);

		constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);

		targetEClass = createEClass(TARGET);

		mappingFieldEClass = createEClass(MAPPING_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__SOUCE_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__TARGET_FIELD);
		createEReference(mappingFieldEClass, MAPPING_FIELD__TRANSFORMATIONS);

		statementEClass = createEClass(STATEMENT);

		binaryOperationExpressionEClass = createEClass(BINARY_OPERATION_EXPRESSION);
		createEReference(binaryOperationExpressionEClass, BINARY_OPERATION_EXPRESSION__LEFT);
		createEReference(binaryOperationExpressionEClass, BINARY_OPERATION_EXPRESSION__RIGHT);
		createEAttribute(binaryOperationExpressionEClass, BINARY_OPERATION_EXPRESSION__OPERATION);

		columnsEClass = createEClass(COLUMNS);
		createEAttribute(columnsEClass, COLUMNS__TYPE);
		createEAttribute(columnsEClass, COLUMNS__NAME);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__PARAMETERS);
		createEAttribute(transformationEClass, TRANSFORMATION__RETURN_TYPE);
		createEReference(transformationEClass, TRANSFORMATION__RETURN_STATEMENT);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		binaryFunctionEEnum = createEEnum(BINARY_FUNCTION);
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
		parameterStatementEClass.getESuperTypes().add(this.getParameter());
		referenceStatementEClass.getESuperTypes().add(this.getParameter());
		booleanConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		expressionEClass.getESuperTypes().add(this.getStatement());
		integerConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		sourceEClass.getESuperTypes().add(this.getTable());
		inExpressionEClass.getESuperTypes().add(this.getExpression());
		conditionalStatementEClass.getESuperTypes().add(this.getStatement());
		parseExpressionEClass.getESuperTypes().add(this.getExpression());
		floatConstantExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		constantExpressionEClass.getESuperTypes().add(this.getExpression());
		targetEClass.getESuperTypes().add(this.getTable());
		binaryOperationExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterExpressionEClass, parameterExpression.class, "parameterExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringConstantExpressionEClass, StringConstantExpression.class, "StringConstantExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstantExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				StringConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterStatementEClass, ParameterStatement.class, "ParameterStatement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterStatement_Statement(), this.getExpression(), null, "statement", null, 0, 1,
				ParameterStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceStatementEClass, ReferenceStatement.class, "ReferenceStatement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceStatement_Columns(), this.getColumns(), null, "columns", null, 0, 1,
				ReferenceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Source(), this.getSource(), null, "source", null, 0, -1, Mapping.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMapping_Target(), this.getTarget(), null, "target", null, 0, -1, Mapping.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMapping_Fields(), this.getMappingField(), null, "fields", null, 1, -1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Condition(), this.getExpression(), null, "condition", null, 0, 1, Mapping.class,
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
		initEReference(getTable_Columns(), this.getColumns(), null, "columns", null, 1, -1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_IfBody(), this.getStatement(), null, "ifBody", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStatement_ElseBody(), this.getStatement(), null, "elseBody", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingFieldEClass, MappingField.class, "MappingField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingField_SouceField(), this.getColumns(), null, "souceField", null, 1, 1,
				MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingField_TargetField(), this.getColumns(), null, "targetField", null, 1, 1,
				MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingField_Transformations(), this.getTransformation(), null, "transformations", null, 0,
				-1, MappingField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationExpressionEClass, BinaryOperationExpression.class, "BinaryOperationExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperationExpression_Left(), this.getExpression(), null, "left", null, 1, 1,
				BinaryOperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperationExpression_Right(), this.getExpression(), null, "right", null, 1, 1,
				BinaryOperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryOperationExpression_Operation(), this.getBinaryFunction(), "operation", null, 0, 1,
				BinaryOperationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnsEClass, Columns.class, "Columns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumns_Type(), this.getType(), "type", null, 1, 1, Columns.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumns_Name(), ecorePackage.getEString(), "name", null, 1, 1, Columns.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_ReturnType(), this.getType(), "returnType", null, 0, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ReturnStatement(), this.getStatement(), null, "returnStatement", null, 1, 1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.EQUAL);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.NOTEQUAL);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.SMALLER);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.GREATER);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.OR);
		addEEnumLiteral(binaryFunctionEEnum, BinaryFunction.AND);

		// Create resource
		createResource(eNS_URI);
	}

} //TqlModelPackageImpl
