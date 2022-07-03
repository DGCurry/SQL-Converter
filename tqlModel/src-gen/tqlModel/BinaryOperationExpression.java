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
 *   <li>{@link tqlModel.BinaryOperationExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getBinaryOperationExpression()
 * @model
 * @generated
 */
public interface BinaryOperationExpression extends OperationExpression {
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
