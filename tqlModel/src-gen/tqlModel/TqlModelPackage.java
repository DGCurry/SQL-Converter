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
	 * The meta object id for the '{@link tqlModel.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Expression
	 * @see tqlModel.impl.TqlModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION__PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

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
	int CONSTANT_EXPRESSION = 12;

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
	 * The meta object id for the '{@link tqlModel.impl.BooleanConstantExpressionImpl <em>Boolean Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.BooleanConstantExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanConstantExpression()
	 * @generated
	 */
	int BOOLEAN_CONSTANT_EXPRESSION = 2;

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
	int INTEGER_CONSTANT_EXPRESSION = 4;

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
	 * The meta object id for the '{@link tqlModel.Block <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Block
	 * @see tqlModel.impl.TqlModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 19;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.MappingSourceTableImpl <em>Mapping Source Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingSourceTableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMappingSourceTable()
	 * @generated
	 */
	int MAPPING_SOURCE_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SOURCE_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SOURCE_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Mapping Source Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SOURCE_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping Source Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SOURCE_TABLE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FIELDS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__WHEN = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.InExpressionImpl <em>In Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.InExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getInExpression()
	 * @generated
	 */
	int IN_EXPRESSION = 7;

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
	 * The meta object id for the '{@link tqlModel.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Statement
	 * @see tqlModel.impl.TqlModelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 15;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ConditionalStatementImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__IF_BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__ELSE_BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Booleanoperationexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

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
	int PARSE_EXPRESSION = 10;

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
	int FLOAT_CONSTANT_EXPRESSION = 11;

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
	 * The meta object id for the '{@link tqlModel.impl.MappingTargetTableImpl <em>Mapping Target Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingTargetTableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMappingTargetTable()
	 * @generated
	 */
	int MAPPING_TARGET_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TARGET_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TARGET_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Mapping Target Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TARGET_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping Target Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TARGET_TABLE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.MappingFieldImpl <em>Mapping Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingFieldImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMappingField()
	 * @generated
	 */
	int MAPPING_FIELD = 14;

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
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FIELD__CALLS = 2;

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
	 * The meta object id for the '{@link tqlModel.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.OperationExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getOperationExpression()
	 * @generated
	 */
	int OPERATION_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.BinaryOperationExpressionImpl <em>Binary Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.BinaryOperationExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryOperationExpression()
	 * @generated
	 */
	int BINARY_OPERATION_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__RIGHT = OPERATION_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__LEFT = OPERATION_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION__OPERATION = OPERATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION_FEATURE_COUNT = OPERATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_EXPRESSION_OPERATION_COUNT = OPERATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TableFieldImpl <em>Table Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TableFieldImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTableField()
	 * @generated
	 */
	int TABLE_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FIELD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Table Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TransformationImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 18;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RETURN_TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SELF_TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LABEL = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RETURN_STATEMENT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PARAMETER = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.BooleanOperationExpressionImpl <em>Boolean Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.BooleanOperationExpressionImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanOperationExpression()
	 * @generated
	 */
	int BOOLEAN_OPERATION_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_EXPRESSION__RIGHT = OPERATION_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_EXPRESSION__LEFT = OPERATION_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_EXPRESSION__OPERATION = OPERATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_EXPRESSION_FEATURE_COUNT = OPERATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_EXPRESSION_OPERATION_COUNT = OPERATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.ParameterImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.TransformationCallImpl <em>Transformation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TransformationCallImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTransformationCall()
	 * @generated
	 */
	int TRANSFORMATION_CALL = 22;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Transformation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transformation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Type
	 * @see tqlModel.impl.TqlModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 24;

	/**
	 * The meta object id for the '{@link tqlModel.BinaryFunction <em>Binary Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.BinaryFunction
	 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryFunction()
	 * @generated
	 */
	int BINARY_FUNCTION = 25;

	/**
	 * The meta object id for the '{@link tqlModel.BooleanFunction <em>Boolean Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.BooleanFunction
	 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanFunction()
	 * @generated
	 */
	int BOOLEAN_FUNCTION = 26;

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
	 * Returns the meta object for the reference '{@link tqlModel.parameterExpression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tqlModel.parameterExpression#getParameter()
	 * @see #getparameterExpression()
	 * @generated
	 */
	EReference getparameterExpression_Parameter();

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
	 * Returns the meta object for class '{@link tqlModel.MappingSourceTable <em>Mapping Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Source Table</em>'.
	 * @see tqlModel.MappingSourceTable
	 * @generated
	 */
	EClass getMappingSourceTable();

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
	 * Returns the meta object for the reference '{@link tqlModel.Mapping#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see tqlModel.Mapping#getWhen()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_When();

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
	 * Returns the meta object for the containment reference list '{@link tqlModel.ConditionalStatement#getIfBody <em>If Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Body</em>'.
	 * @see tqlModel.ConditionalStatement#getIfBody()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_IfBody();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.ConditionalStatement#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Body</em>'.
	 * @see tqlModel.ConditionalStatement#getElseBody()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_ElseBody();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.ConditionalStatement#getBooleanoperationexpression <em>Booleanoperationexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booleanoperationexpression</em>'.
	 * @see tqlModel.ConditionalStatement#getBooleanoperationexpression()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Booleanoperationexpression();

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
	 * Returns the meta object for class '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see tqlModel.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for class '{@link tqlModel.MappingTargetTable <em>Mapping Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Target Table</em>'.
	 * @see tqlModel.MappingTargetTable
	 * @generated
	 */
	EClass getMappingTargetTable();

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
	 * Returns the meta object for the containment reference list '{@link tqlModel.MappingField#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see tqlModel.MappingField#getCalls()
	 * @see #getMappingField()
	 * @generated
	 */
	EReference getMappingField_Calls();

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
	 * Returns the meta object for class '{@link tqlModel.TableField <em>Table Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Field</em>'.
	 * @see tqlModel.TableField
	 * @generated
	 */
	EClass getTableField();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.TableField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tqlModel.TableField#getType()
	 * @see #getTableField()
	 * @generated
	 */
	EAttribute getTableField_Type();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.TableField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tqlModel.TableField#getName()
	 * @see #getTableField()
	 * @generated
	 */
	EAttribute getTableField_Name();

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
	 * Returns the meta object for the attribute '{@link tqlModel.Transformation#getSelfType <em>Self Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Type</em>'.
	 * @see tqlModel.Transformation#getSelfType()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_SelfType();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Transformation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see tqlModel.Transformation#getLabel()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.Transformation#getReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Statement</em>'.
	 * @see tqlModel.Transformation#getReturnStatement()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ReturnStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link tqlModel.Transformation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see tqlModel.Transformation#getParameter()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Parameter();

	/**
	 * Returns the meta object for class '{@link tqlModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see tqlModel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link tqlModel.BooleanOperationExpression <em>Boolean Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation Expression</em>'.
	 * @see tqlModel.BooleanOperationExpression
	 * @generated
	 */
	EClass getBooleanOperationExpression();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.BooleanOperationExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see tqlModel.BooleanOperationExpression#getOperation()
	 * @see #getBooleanOperationExpression()
	 * @generated
	 */
	EAttribute getBooleanOperationExpression_Operation();

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
	 * Returns the meta object for the attribute '{@link tqlModel.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see tqlModel.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link tqlModel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tqlModel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link tqlModel.TransformationCall <em>Transformation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Call</em>'.
	 * @see tqlModel.TransformationCall
	 * @generated
	 */
	EClass getTransformationCall();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.TransformationCall#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see tqlModel.TransformationCall#getTransformation()
	 * @see #getTransformationCall()
	 * @generated
	 */
	EReference getTransformationCall_Transformation();

	/**
	 * Returns the meta object for the reference list '{@link tqlModel.TransformationCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see tqlModel.TransformationCall#getParameters()
	 * @see #getTransformationCall()
	 * @generated
	 */
	EReference getTransformationCall_Parameters();

	/**
	 * Returns the meta object for class '{@link tqlModel.OperationExpression <em>Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Expression</em>'.
	 * @see tqlModel.OperationExpression
	 * @generated
	 */
	EClass getOperationExpression();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.OperationExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see tqlModel.OperationExpression#getRight()
	 * @see #getOperationExpression()
	 * @generated
	 */
	EReference getOperationExpression_Right();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.OperationExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see tqlModel.OperationExpression#getLeft()
	 * @see #getOperationExpression()
	 * @generated
	 */
	EReference getOperationExpression_Left();

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
	 * Returns the meta object for enum '{@link tqlModel.BooleanFunction <em>Boolean Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Function</em>'.
	 * @see tqlModel.BooleanFunction
	 * @generated
	 */
	EEnum getBooleanFunction();

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
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXPRESSION__PARAMETER = eINSTANCE.getparameterExpression_Parameter();

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
		 * The meta object literal for the '{@link tqlModel.impl.MappingSourceTableImpl <em>Mapping Source Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.MappingSourceTableImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getMappingSourceTable()
		 * @generated
		 */
		EClass MAPPING_SOURCE_TABLE = eINSTANCE.getMappingSourceTable();

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
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__WHEN = eINSTANCE.getMapping_When();

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
		 * The meta object literal for the '<em><b>If Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__IF_BODY = eINSTANCE.getConditionalStatement_IfBody();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__ELSE_BODY = eINSTANCE.getConditionalStatement_ElseBody();

		/**
		 * The meta object literal for the '<em><b>Booleanoperationexpression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION = eINSTANCE
				.getConditionalStatement_Booleanoperationexpression();

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
		 * The meta object literal for the '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.ConstantExpression
		 * @see tqlModel.impl.TqlModelPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.MappingTargetTableImpl <em>Mapping Target Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.MappingTargetTableImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getMappingTargetTable()
		 * @generated
		 */
		EClass MAPPING_TARGET_TABLE = eINSTANCE.getMappingTargetTable();

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
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FIELD__CALLS = eINSTANCE.getMappingField_Calls();

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
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION_EXPRESSION__OPERATION = eINSTANCE.getBinaryOperationExpression_Operation();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TableFieldImpl <em>Table Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TableFieldImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTableField()
		 * @generated
		 */
		EClass TABLE_FIELD = eINSTANCE.getTableField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_FIELD__TYPE = eINSTANCE.getTableField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_FIELD__NAME = eINSTANCE.getTableField_Name();

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
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__RETURN_TYPE = eINSTANCE.getTransformation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Self Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SELF_TYPE = eINSTANCE.getTransformation_SelfType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__LABEL = eINSTANCE.getTransformation_Label();

		/**
		 * The meta object literal for the '<em><b>Return Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RETURN_STATEMENT = eINSTANCE.getTransformation_ReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__PARAMETER = eINSTANCE.getTransformation_Parameter();

		/**
		 * The meta object literal for the '{@link tqlModel.Block <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Block
		 * @see tqlModel.impl.TqlModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.BooleanOperationExpressionImpl <em>Boolean Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.BooleanOperationExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanOperationExpression()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION_EXPRESSION = eINSTANCE.getBooleanOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_OPERATION_EXPRESSION__OPERATION = eINSTANCE.getBooleanOperationExpression_Operation();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.ParameterImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LABEL = eINSTANCE.getParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TransformationCallImpl <em>Transformation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TransformationCallImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTransformationCall()
		 * @generated
		 */
		EClass TRANSFORMATION_CALL = eINSTANCE.getTransformationCall();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CALL__TRANSFORMATION = eINSTANCE.getTransformationCall_Transformation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CALL__PARAMETERS = eINSTANCE.getTransformationCall_Parameters();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.OperationExpressionImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getOperationExpression()
		 * @generated
		 */
		EClass OPERATION_EXPRESSION = eINSTANCE.getOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXPRESSION__RIGHT = eINSTANCE.getOperationExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXPRESSION__LEFT = eINSTANCE.getOperationExpression_Left();

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

		/**
		 * The meta object literal for the '{@link tqlModel.BooleanFunction <em>Boolean Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.BooleanFunction
		 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanFunction()
		 * @generated
		 */
		EEnum BOOLEAN_FUNCTION = eINSTANCE.getBooleanFunction();

	}

} //TqlModelPackage
