/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.ConditionalStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link tqlModel.ConditionalStatement#getIfBody <em>If Body</em>}</li>
 *   <li>{@link tqlModel.ConditionalStatement#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getConditionalStatement()
 * @model
 * @generated
 */
public interface ConditionalStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_Condition()
	 * @model required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link tqlModel.ConditionalStatement#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>If Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Body</em>' reference.
	 * @see #setIfBody(Statement)
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_IfBody()
	 * @model required="true"
	 * @generated
	 */
	Statement getIfBody();

	/**
	 * Sets the value of the '{@link tqlModel.ConditionalStatement#getIfBody <em>If Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Body</em>' reference.
	 * @see #getIfBody()
	 * @generated
	 */
	void setIfBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' reference.
	 * @see #setElseBody(Statement)
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_ElseBody()
	 * @model required="true"
	 * @generated
	 */
	Statement getElseBody();

	/**
	 * Sets the value of the '{@link tqlModel.ConditionalStatement#getElseBody <em>Else Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(Statement value);

} // ConditionalStatement
