/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.Mapping#getFields <em>Fields</em>}</li>
 *   <li>{@link tqlModel.Mapping#getSourcetable <em>Sourcetable</em>}</li>
 *   <li>{@link tqlModel.Mapping#getTargettable <em>Targettable</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Block {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.MappingField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingField> getFields();

	/**
	 * Returns the value of the '<em><b>Sourcetable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcetable</em>' reference.
	 * @see #setSourcetable(SourceTable)
	 * @see tqlModel.TqlModelPackage#getMapping_Sourcetable()
	 * @model required="true"
	 * @generated
	 */
	SourceTable getSourcetable();

	/**
	 * Sets the value of the '{@link tqlModel.Mapping#getSourcetable <em>Sourcetable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcetable</em>' reference.
	 * @see #getSourcetable()
	 * @generated
	 */
	void setSourcetable(SourceTable value);

	/**
	 * Returns the value of the '<em><b>Targettable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targettable</em>' reference.
	 * @see #setTargettable(TargetTable)
	 * @see tqlModel.TqlModelPackage#getMapping_Targettable()
	 * @model required="true"
	 * @generated
	 */
	TargetTable getTargettable();

	/**
	 * Sets the value of the '{@link tqlModel.Mapping#getTargettable <em>Targettable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targettable</em>' reference.
	 * @see #getTargettable()
	 * @generated
	 */
	void setTargettable(TargetTable value);

} // Mapping
