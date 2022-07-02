/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.BinaryOperationExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link tqlModel.BinaryOperationExpression#getRight <em>Right</em>}</li>
 *   <li>{@link tqlModel.BinaryOperationExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getBinaryOperationExpression()
 * @model
 * @generated
 */
public interface BinaryOperationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see tqlModel.TqlModelPackage#getBinaryOperationExpression_Left()
	 * @model required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link tqlModel.BinaryOperationExpression#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see tqlModel.TqlModelPackage#getBinaryOperationExpression_Right()
	 * @model required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link tqlModel.BinaryOperationExpression#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.BinaryFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see tqlModel.BinaryFunction
	 * @see #setOperation(BinaryFunction)
	 * @see tqlModel.TqlModelPackage#getBinaryOperationExpression_Operation()
	 * @model
	 * @generated
	 */
	BinaryFunction getOperation();

	/**
	 * Sets the value of the '{@link tqlModel.BinaryOperationExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see tqlModel.BinaryFunction
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BinaryFunction value);

} // BinaryOperationExpression
