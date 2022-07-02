/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.ParameterStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getParameterStatement()
 * @model
 * @generated
 */
public interface ParameterStatement extends Parameter {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Expression)
	 * @see tqlModel.TqlModelPackage#getParameterStatement_Statement()
	 * @model
	 * @generated
	 */
	Expression getStatement();

	/**
	 * Sets the value of the '{@link tqlModel.ParameterStatement#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Expression value);

} // ParameterStatement
