/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.Mapping#getSource <em>Source</em>}</li>
 *   <li>{@link tqlModel.Mapping#getTarget <em>Target</em>}</li>
 *   <li>{@link tqlModel.Mapping#getFields <em>Fields</em>}</li>
 *   <li>{@link tqlModel.Mapping#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Target> getTarget();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link tqlModel.MappingField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<MappingField> getFields();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see tqlModel.TqlModelPackage#getMapping_Condition()
	 * @model
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link tqlModel.Mapping#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // Mapping
