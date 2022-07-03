/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.OperationExpression#getRight <em>Right</em>}</li>
 *   <li>{@link tqlModel.OperationExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getOperationExpression()
 * @model abstract="true"
 * @generated
 */
public interface OperationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see tqlModel.TqlModelPackage#getOperationExpression_Right()
	 * @model required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link tqlModel.OperationExpression#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see tqlModel.TqlModelPackage#getOperationExpression_Left()
	 * @model required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link tqlModel.OperationExpression#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

} // OperationExpression
