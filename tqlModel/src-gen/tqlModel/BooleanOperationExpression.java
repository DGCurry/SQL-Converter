/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.BooleanOperationExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getBooleanOperationExpression()
 * @model
 * @generated
 */
public interface BooleanOperationExpression extends OperationExpression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.BooleanFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see tqlModel.BooleanFunction
	 * @see #setOperation(BooleanFunction)
	 * @see tqlModel.TqlModelPackage#getBooleanOperationExpression_Operation()
	 * @model
	 * @generated
	 */
	BooleanFunction getOperation();

	/**
	 * Sets the value of the '{@link tqlModel.BooleanOperationExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see tqlModel.BooleanFunction
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BooleanFunction value);

} // BooleanOperationExpression
