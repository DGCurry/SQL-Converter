/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parse Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.ParseExpression#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link tqlModel.ParseExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getParseExpression()
 * @model
 * @generated
 */
public interface ParseExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #setOutputType(Type)
	 * @see tqlModel.TqlModelPackage#getParseExpression_OutputType()
	 * @model
	 * @generated
	 */
	Type getOutputType();

	/**
	 * Sets the value of the '{@link tqlModel.ParseExpression#getOutputType <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(Type value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see tqlModel.TqlModelPackage#getParseExpression_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link tqlModel.ParseExpression#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ParseExpression
