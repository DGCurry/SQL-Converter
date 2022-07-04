/**
 */
package nl.tue.gtl.tql.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getBinaryOperatorExpression()
 * @model
 * @generated
 */
public interface BinaryOperatorExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.gtl.tql.model.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Operator
	 * @see #setOperator(Operator)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getBinaryOperatorExpression_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getBinaryOperatorExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getBinaryOperatorExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // BinaryOperatorExpression
