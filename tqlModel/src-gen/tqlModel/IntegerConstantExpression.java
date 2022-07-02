/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.IntegerConstantExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getIntegerConstantExpression()
 * @model
 * @generated
 */
public interface IntegerConstantExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see tqlModel.TqlModelPackage#getIntegerConstantExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link tqlModel.IntegerConstantExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerConstantExpression
