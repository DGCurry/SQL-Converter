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
	 * The meta object id for the '{@link tqlModel.Block <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Block
	 * @see tqlModel.impl.TqlModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 4;

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
	 * The meta object id for the '{@link tqlModel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FIELDS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sourcetable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCETABLE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targettable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGETTABLE = BLOCK_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link tqlModel.Table <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Table
	 * @see tqlModel.impl.TqlModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

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
	 * The meta object id for the '{@link tqlModel.impl.MappingFieldImpl <em>Mapping Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.MappingFieldImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getMappingField()
	 * @generated
	 */
	int MAPPING_FIELD = 2;

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
	 * The meta object id for the '{@link tqlModel.impl.TableFieldImpl <em>Table Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TableFieldImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTableField()
	 * @generated
	 */
	int TABLE_FIELD = 3;

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
	 * The meta object id for the '{@link tqlModel.impl.TransformationCallImpl <em>Transformation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TransformationCallImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTransformationCall()
	 * @generated
	 */
	int TRANSFORMATION_CALL = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Transformation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transformation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tqlModel.impl.SourceTableImpl <em>Source Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.SourceTableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getSourceTable()
	 * @generated
	 */
	int SOURCE_TABLE = 6;

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
	 * The meta object id for the '{@link tqlModel.impl.TargetTableImpl <em>Target Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.impl.TargetTableImpl
	 * @see tqlModel.impl.TqlModelPackageImpl#getTargetTable()
	 * @generated
	 */
	int TARGET_TABLE = 7;

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
	 * The meta object id for the '{@link tqlModel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.Type
	 * @see tqlModel.impl.TqlModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The meta object id for the '{@link tqlModel.BinaryFunction <em>Binary Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.BinaryFunction
	 * @see tqlModel.impl.TqlModelPackageImpl#getBinaryFunction()
	 * @generated
	 */
	int BINARY_FUNCTION = 9;

	/**
	 * The meta object id for the '{@link tqlModel.BooleanFunction <em>Boolean Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tqlModel.BooleanFunction
	 * @see tqlModel.impl.TqlModelPackageImpl#getBooleanFunction()
	 * @generated
	 */
	int BOOLEAN_FUNCTION = 10;

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
	 * Returns the meta object for the containment reference list '{@link tqlModel.Mapping#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see tqlModel.Mapping#getFields()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Fields();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.Mapping#getSourcetable <em>Sourcetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sourcetable</em>'.
	 * @see tqlModel.Mapping#getSourcetable()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Sourcetable();

	/**
	 * Returns the meta object for the reference '{@link tqlModel.Mapping#getTargettable <em>Targettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targettable</em>'.
	 * @see tqlModel.Mapping#getTargettable()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Targettable();

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
	 * Returns the meta object for class '{@link tqlModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see tqlModel.Block
	 * @generated
	 */
	EClass getBlock();

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
	 * Returns the meta object for class '{@link tqlModel.SourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Table</em>'.
	 * @see tqlModel.SourceTable
	 * @generated
	 */
	EClass getSourceTable();

	/**
	 * Returns the meta object for class '{@link tqlModel.TargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Table</em>'.
	 * @see tqlModel.TargetTable
	 * @generated
	 */
	EClass getTargetTable();

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
		 * The meta object literal for the '{@link tqlModel.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.MappingImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__FIELDS = eINSTANCE.getMapping_Fields();

		/**
		 * The meta object literal for the '<em><b>Sourcetable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SOURCETABLE = eINSTANCE.getMapping_Sourcetable();

		/**
		 * The meta object literal for the '<em><b>Targettable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TARGETTABLE = eINSTANCE.getMapping_Targettable();

		/**
		 * The meta object literal for the '{@link tqlModel.Table <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Table
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
		 * The meta object literal for the '{@link tqlModel.Block <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.Block
		 * @see tqlModel.impl.TqlModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CALL__PARAMETERS = eINSTANCE.getTransformationCall_Parameters();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.SourceTableImpl <em>Source Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.SourceTableImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getSourceTable()
		 * @generated
		 */
		EClass SOURCE_TABLE = eINSTANCE.getSourceTable();

		/**
		 * The meta object literal for the '{@link tqlModel.impl.TargetTableImpl <em>Target Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tqlModel.impl.TargetTableImpl
		 * @see tqlModel.impl.TqlModelPackageImpl#getTargetTable()
		 * @generated
		 */
		EClass TARGET_TABLE = eINSTANCE.getTargetTable();

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
