/**
 */
package tqlModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tqlModel.TqlModelFactory
 * @model kind="package"
 * @generated
 */
public interface TqlModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tqlModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tqlModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tqlModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TqlModelPackage eINSTANCE = tqlModel.impl.TqlModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tqlModel.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Statement
	 * @see tqlModel.impl.TqlModelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 18;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Expression
	 * @see tqlModel.impl.TqlModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.parameterExpressionImpl <em>parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.parameterExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getparameterExpression()
	 * @generated
	 */
	int PARAMETER_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.ConstantExpression
	 * @see tqlModel.impl.TqlModelPackageImpl#getConstantExpression()
	 * @generated
	 */
	int CONSTANT_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.StringConstantExpressionImpl <em>String Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.StringConstantExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getStringConstantExpression()
	 * @generated
	 */
	int STRING_CONSTANT_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_EXPRESSION__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_EXPRESSION_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.Parameter <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Parameter
	 * @see tqlModel.impl.TqlModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ParameterStatementImpl <em>Parameter Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ParameterStatementImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getParameterStatement()
	 * @generated
	 */
	int PARAMETER_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STATEMENT__STATEMENT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STATEMENT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STATEMENT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ReferenceStatementImpl <em>Reference Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ReferenceStatementImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getReferenceStatement()
	 * @generated
	 */
	int REFERENCE_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STATEMENT__COLUMNS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STATEMENT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STATEMENT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.BooleanConstantExpressionImpl <em>Boolean Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.BooleanConstantExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanConstantExpression()
	 * @generated
	 */
	int BOOLEAN_CONSTANT_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_EXPRESSION__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_EXPRESSION_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.IntegerConstantExpressionImpl <em>Integer Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.IntegerConstantExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getIntegerConstantExpression()
	 * @generated
	 */
	int INTEGER_CONSTANT_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_EXPRESSION__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_EXPRESSION_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.SourceImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.InExpressionImpl <em>In Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.InExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getInExpression()
	 * @generated
	 */
	int IN_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__STATEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__CONSTANT_SET = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ConditionalStatementImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__IF_BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__ELSE_BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ParseExpressionImpl <em>Parse Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ParseExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getParseExpression()
	 * @generated
	 */
	int PARSE_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_EXPRESSION__OUTPUT_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parse Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parse Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.FloatConstantExpressionImpl <em>Float Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.FloatConstantExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getFloatConstantExpression()
	 * @generated
	 */
	int FLOAT_CONSTANT_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_EXPRESSION__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_EXPRESSION_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TargetImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.MappingFieldImpl <em>Mapping Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingFieldImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMappingField()
	 * @generated
	 */
	int MAPPING_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Souce Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD__SOUCE_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Target Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD__TARGET_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD__TRANSFORMATIONS = 2;

	/**
	 * The number of structural features of the '<em>Mapping Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.BinaryOperationExpressionImpl <em>Binary Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.BinaryOperationExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryOperationExpression()
	 * @generated
	 */
	int BINARY_OPERATION_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__OPERATION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ColumnsImpl <em>Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ColumnsImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getColumns()
	 * @generated
	 */
	int COLUMNS = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TransformationImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 21;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Return Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RETURN_STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Type
	 * @see tqlModel.impl.TqlModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 22;

	/**
	 * The meta object id for the '{@link tqlModel.BinaryFunction <em>Binary Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.BinaryFunction
	 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryFunction()
	 * @generated
	 */
	int BINARY_FUNCTION = 23;

	/**
	 * Returns the meta object for class '{@link tqlModel.parameterExpression <em>parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>parameter Expression</em>'.
	 * @see tqlModel.parameterExpression
	 * @generated
	 */
	EClass getparameterExpression();

	/**
	 * Returns the meta object for class '{@link tqlModel.StringConstantExpression <em>String Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant Expression</em>'.
	 * @see tqlModel.StringConstantExpression
	 * @generated
	 */
	EClass getStringConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.StringConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tqlModel.StringConstantExpression#getValue()
	 * @see #getStringConstantExpression()
	 * @generated
	 */
	EAttribute getStringConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link tqlModel.ParameterStatement <em>Parameter Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Statement</em>'.
	 * @see tqlModel.ParameterStatement
	 * @generated
	 */
	EClass getParameterStatement();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ParameterStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see tqlModel.ParameterStatement#getStatement()
	 * @see #getParameterStatement()
	 * @generated
	 */
	EReference getParameterStatement_Statement();

	/**
	 * Returns the meta object for class '{@link tqlModel.ReferenceStatement <em>Reference Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Statement</em>'.
	 * @see tqlModel.ReferenceStatement
	 * @generated
	 */
	EClass getReferenceStatement();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ReferenceStatement#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columns</em>'.
	 * @see tqlModel.ReferenceStatement#getColumns()
	 * @see #getReferenceStatement()
	 * @generated
	 */
	EReference getReferenceStatement_Columns();

	/**
	 * Returns the meta object for class '{@link tqlModel.BooleanConstantExpression <em>Boolean Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant Expression</em>'.
	 * @see tqlModel.BooleanConstantExpression
	 * @generated
	 */
	EClass getBooleanConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.BooleanConstantExpression#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tqlModel.BooleanConstantExpression#isValue()
	 * @see #getBooleanConstantExpression()
	 * @generated
	 */
	EAttribute getBooleanConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link tqlModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see tqlModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link tqlModel.IntegerConstantExpression <em>Integer Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant Expression</em>'.
	 * @see tqlModel.IntegerConstantExpression
	 * @generated
	 */
	EClass getIntegerConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.IntegerConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tqlModel.IntegerConstantExpression#getValue()
	 * @see #getIntegerConstantExpression()
	 * @generated
	 */
	EAttribute getIntegerConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link tqlModel.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see tqlModel.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link tqlModel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see tqlModel.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.Mapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see tqlModel.Mapping#getSource()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.Mapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see tqlModel.Mapping#getTarget()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Target();

	/**
	 * Returns the meta object for the reference list '{@link tqlModel.Mapping#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see tqlModel.Mapping#getFields()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Fields();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.Mapping#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see tqlModel.Mapping#getCondition()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Condition();

	/**
	 * Returns the meta object for class '{@link tqlModel.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Expression</em>'.
	 * @see tqlModel.InExpression
	 * @generated
	 */
	EClass getInExpression();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.InExpression#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see tqlModel.InExpression#getStatement()
	 * @see #getInExpression()
	 * @generated
	 */
	EReference getInExpression_Statement();

	/**
	 * Returns the meta object for the reference list '{@link tqlModel.InExpression#getConstantSet <em>Constant Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant Set</em>'.
	 * @see tqlModel.InExpression#getConstantSet()
	 * @see #getInExpression()
	 * @generated
	 */
	EReference getInExpression_ConstantSet();

	/**
	 * Returns the meta object for class '{@link tqlModel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see tqlModel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tqlModel.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see tqlModel.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link tqlModel.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Statement</em>'.
	 * @see tqlModel.ConditionalStatement
	 * @generated
	 */
	EClass getConditionalStatement();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ConditionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see tqlModel.ConditionalStatement#getCondition()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Condition();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ConditionalStatement#getIfBody <em>If Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Body</em>'.
	 * @see tqlModel.ConditionalStatement#getIfBody()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_IfBody();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ConditionalStatement#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Body</em>'.
	 * @see tqlModel.ConditionalStatement#getElseBody()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_ElseBody();

	/**
	 * Returns the meta object for class '{@link tqlModel.ParseExpression <em>Parse Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parse Expression</em>'.
	 * @see tqlModel.ParseExpression
	 * @generated
	 */
	EClass getParseExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.ParseExpression#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see tqlModel.ParseExpression#getOutputType()
	 * @see #getParseExpression()
	 * @generated
	 */
	EAttribute getParseExpression_OutputType();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ParseExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see tqlModel.ParseExpression#getExpression()
	 * @see #getParseExpression()
	 * @generated
	 */
	EReference getParseExpression_Expression();

	/**
	 * Returns the meta object for class '{@link tqlModel.FloatConstantExpression <em>Float Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Constant Expression</em>'.
	 * @see tqlModel.FloatConstantExpression
	 * @generated
	 */
	EClass getFloatConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.FloatConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tqlModel.FloatConstantExpression#getValue()
	 * @see #getFloatConstantExpression()
	 * @generated
	 */
	EAttribute getFloatConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link tqlModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see tqlModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see tqlModel.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for class '{@link tqlModel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see tqlModel.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link tqlModel.MappingField <em>Mapping Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Field</em>'.
	 * @see tqlModel.MappingField
	 * @generated
	 */
	EClass getMappingField();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.MappingField#getSouceField <em>Souce Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Souce Field</em>'.
	 * @see tqlModel.MappingField#getSouceField()
	 * @see #getMappingField()
	 * @generated
	 */
	EReference getMappingField_SouceField();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.MappingField#getTargetField <em>Target Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Field</em>'.
	 * @see tqlModel.MappingField#getTargetField()
	 * @see #getMappingField()
	 * @generated
	 */
	EReference getMappingField_TargetField();

	/**
	 * Returns the meta object for the reference list '{@link tqlModel.MappingField#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see tqlModel.MappingField#getTransformations()
	 * @see #getMappingField()
	 * @generated
	 */
	EReference getMappingField_Transformations();

	/**
	 * Returns the meta object for class '{@link tqlModel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see tqlModel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link tqlModel.BinaryOperationExpression <em>Binary Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation Expression</em>'.
	 * @see tqlModel.BinaryOperationExpression
	 * @generated
	 */
	EClass getBinaryOperationExpression();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.BinaryOperationExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see tqlModel.BinaryOperationExpression#getLeft()
	 * @see #getBinaryOperationExpression()
	 * @generated
	 */
	EReference getBinaryOperationExpression_Left();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.BinaryOperationExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see tqlModel.BinaryOperationExpression#getRight()
	 * @see #getBinaryOperationExpression()
	 * @generated
	 */
	EReference getBinaryOperationExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.BinaryOperationExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see tqlModel.BinaryOperationExpression#getOperation()
	 * @see #getBinaryOperationExpression()
	 * @generated
	 */
	EAttribute getBinaryOperationExpression_Operation();

	/**
	 * Returns the meta object for class '{@link tqlModel.Columns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns</em>'.
	 * @see tqlModel.Columns
	 * @generated
	 */
	EClass getColumns();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Columns#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tqlModel.Columns#getType()
	 * @see #getColumns()
	 * @generated
	 */
	EAttribute getColumns_Type();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Columns#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tqlModel.Columns#getName()
	 * @see #getColumns()
	 * @generated
	 */
	EAttribute getColumns_Name();

	/**
	 * Returns the meta object for class '{@link tqlModel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see tqlModel.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference list '{@link tqlModel.Transformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see tqlModel.Transformation#getParameters()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Transformation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see tqlModel.Transformation#getReturnType()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.Transformation#getReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Statement</em>'.
	 * @see tqlModel.Transformation#getReturnStatement()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ReturnStatement();

	/**
	 * Returns the meta object for enum '{@link tqlModel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see tqlModel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link tqlModel.BinaryFunction <em>Binary Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Function</em>'.
	 * @see tqlModel.BinaryFunction
	 * @generated
	 */
	EEnum getBinaryFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TqlModelFactory getTqlModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tqlModel.impl.parameterExpressionImpl <em>parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.parameterExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getparameterExpression()
		 * @generated
		 */
		EClass PARAMETER_EXPRESSION = eINSTANCE.getparameterExpression();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.StringConstantExpressionImpl <em>String Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.StringConstantExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getStringConstantExpression()
		 * @generated
		 */
		EClass STRING_CONSTANT_EXPRESSION = eINSTANCE.getStringConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT_EXPRESSION__VALUE = eINSTANCE.getStringConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ParameterStatementImpl <em>Parameter Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ParameterStatementImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getParameterStatement()
		 * @generated
		 */
		EClass PARAMETER_STATEMENT = eINSTANCE.getParameterStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STATEMENT__STATEMENT = eINSTANCE.getParameterStatement_Statement();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ReferenceStatementImpl <em>Reference Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ReferenceStatementImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getReferenceStatement()
		 * @generated
		 */
		EClass REFERENCE_STATEMENT = eINSTANCE.getReferenceStatement();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_STATEMENT__COLUMNS = eINSTANCE.getReferenceStatement_Columns();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.BooleanConstantExpressionImpl <em>Boolean Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.BooleanConstantExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanConstantExpression()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT_EXPRESSION = eINSTANCE.getBooleanConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT_EXPRESSION__VALUE = eINSTANCE.getBooleanConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link tqlModel.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Expression
		 * @see tqlModel.impl.TqlModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.IntegerConstantExpressionImpl <em>Integer Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.IntegerConstantExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getIntegerConstantExpression()
		 * @generated
		 */
		EClass INTEGER_CONSTANT_EXPRESSION = eINSTANCE.getIntegerConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT_EXPRESSION__VALUE = eINSTANCE.getIntegerConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.SourceImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.MappingImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SOURCE = eINSTANCE.getMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TARGET = eINSTANCE.getMapping_Target();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__FIELDS = eINSTANCE.getMapping_Fields();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__CONDITION = eINSTANCE.getMapping_Condition();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.InExpressionImpl <em>In Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.InExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getInExpression()
		 * @generated
		 */
		EClass IN_EXPRESSION = eINSTANCE.getInExpression();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_EXPRESSION__STATEMENT = eINSTANCE.getInExpression_Statement();

		/**
		 * The meta object literal for the '<em><b>Constant Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_EXPRESSION__CONSTANT_SET = eINSTANCE.getInExpression_ConstantSet();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TableImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ConditionalStatementImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getConditionalStatement()
		 * @generated
		 */
		EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getConditionalStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>If Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__IF_BODY = eINSTANCE.getConditionalStatement_IfBody();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__ELSE_BODY = eINSTANCE.getConditionalStatement_ElseBody();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ParseExpressionImpl <em>Parse Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ParseExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getParseExpression()
		 * @generated
		 */
		EClass PARSE_EXPRESSION = eINSTANCE.getParseExpression();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSE_EXPRESSION__OUTPUT_TYPE = eINSTANCE.getParseExpression_OutputType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSE_EXPRESSION__EXPRESSION = eINSTANCE.getParseExpression_Expression();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.FloatConstantExpressionImpl <em>Float Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.FloatConstantExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getFloatConstantExpression()
		 * @generated
		 */
		EClass FLOAT_CONSTANT_EXPRESSION = eINSTANCE.getFloatConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_CONSTANT_EXPRESSION__VALUE = eINSTANCE.getFloatConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link tqlModel.Parameter <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Parameter
		 * @see tqlModel.impl.TqlModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.ConstantExpression
		 * @see tqlModel.impl.TqlModelPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TargetImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.MappingFieldImpl <em>Mapping Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.MappingFieldImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getMappingField()
		 * @generated
		 */
		EClass MAPPING_FIELD = eINSTANCE.getMappingField();

		/**
		 * The meta object literal for the '<em><b>Souce Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FIELD__SOUCE_FIELD = eINSTANCE.getMappingField_SouceField();

		/**
		 * The meta object literal for the '<em><b>Target Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FIELD__TARGET_FIELD = eINSTANCE.getMappingField_TargetField();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FIELD__TRANSFORMATIONS = eINSTANCE.getMappingField_Transformations();

		/**
		 * The meta object literal for the '{@link tqlModel.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Statement
		 * @see tqlModel.impl.TqlModelPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.BinaryOperationExpressionImpl <em>Binary Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.BinaryOperationExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryOperationExpression()
		 * @generated
		 */
		EClass BINARY_OPERATION_EXPRESSION = eINSTANCE.getBinaryOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION_EXPRESSION__LEFT = eINSTANCE.getBinaryOperationExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION_EXPRESSION__RIGHT = eINSTANCE.getBinaryOperationExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION_EXPRESSION__OPERATION = eINSTANCE.getBinaryOperationExpression_Operation();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ColumnsImpl <em>Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ColumnsImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getColumns()
		 * @generated
		 */
		EClass COLUMNS = eINSTANCE.getColumns();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS__TYPE = eINSTANCE.getColumns_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS__NAME = eINSTANCE.getColumns_Name();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TransformationImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__PARAMETERS = eINSTANCE.getTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__RETURN_TYPE = eINSTANCE.getTransformation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RETURN_STATEMENT = eINSTANCE.getTransformation_ReturnStatement();

		/**
		 * The meta object literal for the '{@link tqlModel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Type
		 * @see tqlModel.impl.TqlModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link tqlModel.BinaryFunction <em>Binary Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.BinaryFunction
		 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryFunction()
		 * @generated
		 */
		EEnum BINARY_FUNCTION = eINSTANCE.getBinaryFunction();

	}

} //TqlModelPackage
