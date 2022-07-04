/**
 */
package nl.tue.gtl.tql.model;

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
 * @see nl.tue.gtl.tql.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = nl.tue.gtl.tql.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Block <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Block
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Table <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Table
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ColumnImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.SourceTableImpl <em>Source Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.SourceTableImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getSourceTable()
	 * @generated
	 */
	int SOURCE_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Source Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TABLE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.TargetTableImpl <em>Target Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.TargetTableImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTargetTable()
	 * @generated
	 */
	int TARGET_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The number of structural features of the '<em>Target Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TABLE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.MappingImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Mapped Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPED_COLUMNS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.MappedColumnImpl <em>Mapped Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.MappedColumnImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getMappedColumn()
	 * @generated
	 */
	int MAPPED_COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_COLUMN__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_COLUMN__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Transformation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_COLUMN__TRANSFORMATION_CALLS = 2;

	/**
	 * The number of structural features of the '<em>Mapped Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapped Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.TransformationImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PARAMETERS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IN_TYPE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUT_TYPE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__BODY = BLOCK_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ParameterImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.TransformationCallImpl <em>Transformation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.TransformationCallImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTransformationCall()
	 * @generated
	 */
	int TRANSFORMATION_CALL = 9;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL__CALL_PARAMETERS = 1;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.CallParameter <em>Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.CallParameter
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getCallParameter()
	 * @generated
	 */
	int CALL_PARAMETER = 10;

	/**
	 * The number of structural features of the '<em>Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Expression
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 21;

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
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Constant <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Constant
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 11;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.StringConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.IntegerConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.FloatConstantImpl <em>Float Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.FloatConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getFloatConstant()
	 * @generated
	 */
	int FLOAT_CONSTANT = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.DateConstantImpl <em>Date Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.DateConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getDateConstant()
	 * @generated
	 */
	int DATE_CONSTANT = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.NullConstantImpl <em>Null Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.NullConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getNullConstant()
	 * @generated
	 */
	int NULL_CONSTANT = 16;

	/**
	 * The number of structural features of the '<em>Null Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.SetConstantImpl <em>Set Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.SetConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getSetConstant()
	 * @generated
	 */
	int SET_CONSTANT = 17;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTANT__VALUES = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ConstantCallParameterImpl <em>Constant Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ConstantCallParameterImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getConstantCallParameter()
	 * @generated
	 */
	int CONSTANT_CALL_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL_PARAMETER__PARAMETER = CALL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL_PARAMETER_FEATURE_COUNT = CALL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL_PARAMETER_OPERATION_COUNT = CALL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ReferenceCallParameterImpl <em>Reference Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ReferenceCallParameterImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getReferenceCallParameter()
	 * @generated
	 */
	int REFERENCE_CALL_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CALL_PARAMETER__REFERENCE = CALL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CALL_PARAMETER_FEATURE_COUNT = CALL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CALL_PARAMETER_OPERATION_COUNT = CALL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.BooleanConstantImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ParameterExpressionImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getParameterExpression()
	 * @generated
	 */
	int PARAMETER_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION__PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.ColumnExpressionImpl <em>Column Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.ColumnExpressionImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getColumnExpression()
	 * @generated
	 */
	int COLUMN_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXPRESSION__COLUMN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Column Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.impl.BinaryOperatorExpressionImpl
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBinaryOperatorExpression()
	 * @generated
	 */
	int BINARY_OPERATOR_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Type
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 25;

	/**
	 * The meta object id for the '{@link nl.tue.gtl.tql.model.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.gtl.tql.model.Operator
	 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 26;

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see nl.tue.gtl.tql.model.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.gtl.tql.model.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see nl.tue.gtl.tql.model.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see nl.tue.gtl.tql.model.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.gtl.tql.model.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nl.tue.gtl.tql.model.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see nl.tue.gtl.tql.model.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.SourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Table</em>'.
	 * @see nl.tue.gtl.tql.model.SourceTable
	 * @generated
	 */
	EClass getSourceTable();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.TargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Table</em>'.
	 * @see nl.tue.gtl.tql.model.TargetTable
	 * @generated
	 */
	EClass getTargetTable();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see nl.tue.gtl.tql.model.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.Mapping#getMappedColumns <em>Mapped Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Columns</em>'.
	 * @see nl.tue.gtl.tql.model.Mapping#getMappedColumns()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MappedColumns();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.Mapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see nl.tue.gtl.tql.model.Mapping#getSource()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.Mapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nl.tue.gtl.tql.model.Mapping#getTarget()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Target();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.MappedColumn <em>Mapped Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Column</em>'.
	 * @see nl.tue.gtl.tql.model.MappedColumn
	 * @generated
	 */
	EClass getMappedColumn();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.MappedColumn#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see nl.tue.gtl.tql.model.MappedColumn#getSource()
	 * @see #getMappedColumn()
	 * @generated
	 */
	EReference getMappedColumn_Source();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.MappedColumn#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nl.tue.gtl.tql.model.MappedColumn#getTarget()
	 * @see #getMappedColumn()
	 * @generated
	 */
	EReference getMappedColumn_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.MappedColumn#getTransformationCalls <em>Transformation Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Calls</em>'.
	 * @see nl.tue.gtl.tql.model.MappedColumn#getTransformationCalls()
	 * @see #getMappedColumn()
	 * @generated
	 */
	EReference getMappedColumn_TransformationCalls();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.Transformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation#getParameters()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Transformation#getInType <em>In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Type</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation#getInType()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_InType();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Transformation#getOutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Type</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation#getOutType()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_OutType();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.gtl.tql.model.Transformation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see nl.tue.gtl.tql.model.Transformation#getBody()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Body();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.gtl.tql.model.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nl.tue.gtl.tql.model.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.TransformationCall <em>Transformation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Call</em>'.
	 * @see nl.tue.gtl.tql.model.TransformationCall
	 * @generated
	 */
	EClass getTransformationCall();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.TransformationCall#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see nl.tue.gtl.tql.model.TransformationCall#getTransformation()
	 * @see #getTransformationCall()
	 * @generated
	 */
	EReference getTransformationCall_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.TransformationCall#getCallParameters <em>Call Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call Parameters</em>'.
	 * @see nl.tue.gtl.tql.model.TransformationCall#getCallParameters()
	 * @see #getTransformationCall()
	 * @generated
	 */
	EReference getTransformationCall_CallParameters();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.CallParameter <em>Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.CallParameter
	 * @generated
	 */
	EClass getCallParameter();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see nl.tue.gtl.tql.model.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see nl.tue.gtl.tql.model.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.gtl.tql.model.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see nl.tue.gtl.tql.model.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.gtl.tql.model.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.FloatConstant <em>Float Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Constant</em>'.
	 * @see nl.tue.gtl.tql.model.FloatConstant
	 * @generated
	 */
	EClass getFloatConstant();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.FloatConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.gtl.tql.model.FloatConstant#getValue()
	 * @see #getFloatConstant()
	 * @generated
	 */
	EAttribute getFloatConstant_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.DateConstant <em>Date Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Constant</em>'.
	 * @see nl.tue.gtl.tql.model.DateConstant
	 * @generated
	 */
	EClass getDateConstant();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.DateConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.gtl.tql.model.DateConstant#getValue()
	 * @see #getDateConstant()
	 * @generated
	 */
	EAttribute getDateConstant_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.NullConstant <em>Null Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Constant</em>'.
	 * @see nl.tue.gtl.tql.model.NullConstant
	 * @generated
	 */
	EClass getNullConstant();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.SetConstant <em>Set Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Constant</em>'.
	 * @see nl.tue.gtl.tql.model.SetConstant
	 * @generated
	 */
	EClass getSetConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.gtl.tql.model.SetConstant#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see nl.tue.gtl.tql.model.SetConstant#getValues()
	 * @see #getSetConstant()
	 * @generated
	 */
	EReference getSetConstant_Values();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.ConstantCallParameter <em>Constant Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Call Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.ConstantCallParameter
	 * @generated
	 */
	EClass getConstantCallParameter();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.gtl.tql.model.ConstantCallParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.ConstantCallParameter#getParameter()
	 * @see #getConstantCallParameter()
	 * @generated
	 */
	EReference getConstantCallParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.ReferenceCallParameter <em>Reference Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Call Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.ReferenceCallParameter
	 * @generated
	 */
	EClass getReferenceCallParameter();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.ReferenceCallParameter#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see nl.tue.gtl.tql.model.ReferenceCallParameter#getReference()
	 * @see #getReferenceCallParameter()
	 * @generated
	 */
	EReference getReferenceCallParameter_Reference();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see nl.tue.gtl.tql.model.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.gtl.tql.model.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see nl.tue.gtl.tql.model.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.ParameterExpression <em>Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Expression</em>'.
	 * @see nl.tue.gtl.tql.model.ParameterExpression
	 * @generated
	 */
	EClass getParameterExpression();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.ParameterExpression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see nl.tue.gtl.tql.model.ParameterExpression#getParameter()
	 * @see #getParameterExpression()
	 * @generated
	 */
	EReference getParameterExpression_Parameter();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.ColumnExpression <em>Column Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Expression</em>'.
	 * @see nl.tue.gtl.tql.model.ColumnExpression
	 * @generated
	 */
	EClass getColumnExpression();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.gtl.tql.model.ColumnExpression#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see nl.tue.gtl.tql.model.ColumnExpression#getColumn()
	 * @see #getColumnExpression()
	 * @generated
	 */
	EReference getColumnExpression_Column();

	/**
	 * Returns the meta object for class '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator Expression</em>'.
	 * @see nl.tue.gtl.tql.model.BinaryOperatorExpression
	 * @generated
	 */
	EClass getBinaryOperatorExpression();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see nl.tue.gtl.tql.model.BinaryOperatorExpression#getOperator()
	 * @see #getBinaryOperatorExpression()
	 * @generated
	 */
	EAttribute getBinaryOperatorExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see nl.tue.gtl.tql.model.BinaryOperatorExpression#getLeft()
	 * @see #getBinaryOperatorExpression()
	 * @generated
	 */
	EReference getBinaryOperatorExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see nl.tue.gtl.tql.model.BinaryOperatorExpression#getRight()
	 * @see #getBinaryOperatorExpression()
	 * @generated
	 */
	EReference getBinaryOperatorExpression_Right();

	/**
	 * Returns the meta object for enum '{@link nl.tue.gtl.tql.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see nl.tue.gtl.tql.model.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link nl.tue.gtl.tql.model.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see nl.tue.gtl.tql.model.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Table <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Table
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTable()
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
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ColumnImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Block <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Block
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.SourceTableImpl <em>Source Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.SourceTableImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getSourceTable()
		 * @generated
		 */
		EClass SOURCE_TABLE = eINSTANCE.getSourceTable();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.TargetTableImpl <em>Target Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.TargetTableImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTargetTable()
		 * @generated
		 */
		EClass TARGET_TABLE = eINSTANCE.getTargetTable();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.MappingImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPED_COLUMNS = eINSTANCE.getMapping_MappedColumns();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SOURCE = eINSTANCE.getMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TARGET = eINSTANCE.getMapping_Target();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.MappedColumnImpl <em>Mapped Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.MappedColumnImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getMappedColumn()
		 * @generated
		 */
		EClass MAPPED_COLUMN = eINSTANCE.getMappedColumn();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_COLUMN__SOURCE = eINSTANCE.getMappedColumn_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_COLUMN__TARGET = eINSTANCE.getMappedColumn_Target();

		/**
		 * The meta object literal for the '<em><b>Transformation Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_COLUMN__TRANSFORMATION_CALLS = eINSTANCE.getMappedColumn_TransformationCalls();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.TransformationImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__PARAMETERS = eINSTANCE.getTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>In Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__IN_TYPE = eINSTANCE.getTransformation_InType();

		/**
		 * The meta object literal for the '<em><b>Out Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__OUT_TYPE = eINSTANCE.getTransformation_OutType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__BODY = eINSTANCE.getTransformation_Body();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ParameterImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.TransformationCallImpl <em>Transformation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.TransformationCallImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getTransformationCall()
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
		 * The meta object literal for the '<em><b>Call Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CALL__CALL_PARAMETERS = eINSTANCE.getTransformationCall_CallParameters();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.CallParameter <em>Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.CallParameter
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getCallParameter()
		 * @generated
		 */
		EClass CALL_PARAMETER = eINSTANCE.getCallParameter();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Constant <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Constant
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.StringConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.IntegerConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.FloatConstantImpl <em>Float Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.FloatConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getFloatConstant()
		 * @generated
		 */
		EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_CONSTANT__VALUE = eINSTANCE.getFloatConstant_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.DateConstantImpl <em>Date Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.DateConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getDateConstant()
		 * @generated
		 */
		EClass DATE_CONSTANT = eINSTANCE.getDateConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_CONSTANT__VALUE = eINSTANCE.getDateConstant_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.NullConstantImpl <em>Null Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.NullConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getNullConstant()
		 * @generated
		 */
		EClass NULL_CONSTANT = eINSTANCE.getNullConstant();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.SetConstantImpl <em>Set Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.SetConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getSetConstant()
		 * @generated
		 */
		EClass SET_CONSTANT = eINSTANCE.getSetConstant();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CONSTANT__VALUES = eINSTANCE.getSetConstant_Values();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ConstantCallParameterImpl <em>Constant Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ConstantCallParameterImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getConstantCallParameter()
		 * @generated
		 */
		EClass CONSTANT_CALL_PARAMETER = eINSTANCE.getConstantCallParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_CALL_PARAMETER__PARAMETER = eINSTANCE.getConstantCallParameter_Parameter();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ReferenceCallParameterImpl <em>Reference Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ReferenceCallParameterImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getReferenceCallParameter()
		 * @generated
		 */
		EClass REFERENCE_CALL_PARAMETER = eINSTANCE.getReferenceCallParameter();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CALL_PARAMETER__REFERENCE = eINSTANCE.getReferenceCallParameter_Reference();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.BooleanConstantImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Expression
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ParameterExpressionImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getParameterExpression()
		 * @generated
		 */
		EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXPRESSION__PARAMETER = eINSTANCE.getParameterExpression_Parameter();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.ColumnExpressionImpl <em>Column Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.ColumnExpressionImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getColumnExpression()
		 * @generated
		 */
		EClass COLUMN_EXPRESSION = eINSTANCE.getColumnExpression();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_EXPRESSION__COLUMN = eINSTANCE.getColumnExpression_Column();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.impl.BinaryOperatorExpressionImpl
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getBinaryOperatorExpression()
		 * @generated
		 */
		EClass BINARY_OPERATOR_EXPRESSION = eINSTANCE.getBinaryOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getBinaryOperatorExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_EXPRESSION__LEFT = eINSTANCE.getBinaryOperatorExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_EXPRESSION__RIGHT = eINSTANCE.getBinaryOperatorExpression_Right();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Type
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link nl.tue.gtl.tql.model.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.gtl.tql.model.Operator
		 * @see nl.tue.gtl.tql.model.impl.ModelPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ModelPackage
