/**
 */
package nl.tue.gtl.tql.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.ReferenceCallParameter#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getReferenceCallParameter()
 * @model
 * @generated
 */
public interface ReferenceCallParameter extends CallParameter {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Column)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getReferenceCallParameter_Reference()
	 * @model required="true"
	 * @generated
	 */
	Column getReference();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.ReferenceCallParameter#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Column value);

} // ReferenceCallParameter
