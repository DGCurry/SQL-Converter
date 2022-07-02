/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.FloatConstantExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getFloatConstantExpression()
 * @model
 * @generated
 */
public interface FloatConstantExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see tqlModel.TqlModelPackage#getFloatConstantExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link tqlModel.FloatConstantExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FloatConstantExpression
