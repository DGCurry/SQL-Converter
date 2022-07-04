/**
 */
package nl.tue.gtl.tql.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.ParameterExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getParameterExpression()
 * @model
 * @generated
 */
public interface ParameterExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getParameterExpression_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.ParameterExpression#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterExpression
