/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link tqlModel.ConditionalStatement#getBooleanoperationexpression <em>Booleanoperationexpression</em>}</li>
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
	 * Returns the value of the '<em><b>If Body</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Body</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_IfBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getIfBody();

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_ElseBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getElseBody();

	/**
	 * Returns the value of the '<em><b>Booleanoperationexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanoperationexpression</em>' reference.
	 * @see #setBooleanoperationexpression(BooleanOperationExpression)
	 * @see tqlModel.TqlModelPackage#getConditionalStatement_Booleanoperationexpression()
	 * @model required="true"
	 * @generated
	 */
	BooleanOperationExpression getBooleanoperationexpression();

	/**
	 * Sets the value of the '{@link tqlModel.ConditionalStatement#getBooleanoperationexpression <em>Booleanoperationexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanoperationexpression</em>' reference.
	 * @see #getBooleanoperationexpression()
	 * @generated
	 */
	void setBooleanoperationexpression(BooleanOperationExpression value);

} // ConditionalStatement
