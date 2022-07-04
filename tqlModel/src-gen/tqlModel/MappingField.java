/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.MappingField#getSouceField <em>Souce Field</em>}</li>
 *   <li>{@link tqlModel.MappingField#getTargetField <em>Target Field</em>}</li>
 *   <li>{@link tqlModel.MappingField#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getMappingField()
 * @model
 * @generated
 */
public interface MappingField extends EObject {
	/**
	 * Returns the value of the '<em><b>Souce Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souce Field</em>' reference.
	 * @see #setSouceField(TableField)
	 * @see tqlModel.TqlModelPackage#getMappingField_SouceField()
	 * @model required="true"
	 * @generated
	 */
	TableField getSouceField();

	/**
	 * Sets the value of the '{@link tqlModel.MappingField#getSouceField <em>Souce Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Souce Field</em>' reference.
	 * @see #getSouceField()
	 * @generated
	 */
	void setSouceField(TableField value);

	/**
	 * Returns the value of the '<em><b>Target Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Field</em>' reference.
	 * @see #setTargetField(TableField)
	 * @see tqlModel.TqlModelPackage#getMappingField_TargetField()
	 * @model required="true"
	 * @generated
	 */
	TableField getTargetField();

	/**
	 * Sets the value of the '{@link tqlModel.MappingField#getTargetField <em>Target Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Field</em>' reference.
	 * @see #getTargetField()
	 * @generated
	 */
	void setTargetField(TableField value);

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.TransformationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMappingField_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationCall> getCalls();

} // MappingField
