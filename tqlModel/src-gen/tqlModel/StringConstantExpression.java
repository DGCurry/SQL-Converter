/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.StringConstantExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getStringConstantExpression()
 * @model
 * @generated
 */
public interface StringConstantExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see tqlModel.TqlModelPackage#getStringConstantExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link tqlModel.StringConstantExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringConstantExpression
