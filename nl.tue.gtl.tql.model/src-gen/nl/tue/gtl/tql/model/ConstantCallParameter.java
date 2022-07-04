/**
 */
package nl.tue.gtl.tql.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.ConstantCallParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getConstantCallParameter()
 * @model
 * @generated
 */
public interface ConstantCallParameter extends CallParameter {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Constant)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getConstantCallParameter_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getParameter();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.ConstantCallParameter#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Constant value);

} // ConstantCallParameter
