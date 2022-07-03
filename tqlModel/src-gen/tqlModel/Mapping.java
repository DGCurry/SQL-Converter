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
 *   <li>{@link tqlModel.Mapping#getSource <em>Source</em>}</li>
 *   <li>{@link tqlModel.Mapping#getTarget <em>Target</em>}</li>
 *   <li>{@link tqlModel.Mapping#getFields <em>Fields</em>}</li>
 *   <li>{@link tqlModel.Mapping#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Block {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.MappingSourceTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingSourceTable> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.MappingTargetTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getMapping_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingTargetTable> getTarget();

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
	 * Returns the value of the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference.
	 * @see #setWhen(BooleanOperationExpression)
	 * @see tqlModel.TqlModelPackage#getMapping_When()
	 * @model
	 * @generated
	 */
	BooleanOperationExpression getWhen();

	/**
	 * Sets the value of the '{@link tqlModel.Mapping#getWhen <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(BooleanOperationExpression value);

} // Mapping
