/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.InExpression#getStatement <em>Statement</em>}</li>
 *   <li>{@link tqlModel.InExpression#getConstantSet <em>Constant Set</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getInExpression()
 * @model
 * @generated
 */
public interface InExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Expression)
	 * @see tqlModel.TqlModelPackage#getInExpression_Statement()
	 * @model
	 * @generated
	 */
	Expression getStatement();

	/**
	 * Sets the value of the '{@link tqlModel.InExpression#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Expression value);

	/**
	 * Returns the value of the '<em><b>Constant Set</b></em>' reference list.
	 * The list contents are of type {@link tqlModel.ConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set</em>' reference list.
	 * @see tqlModel.TqlModelPackage#getInExpression_ConstantSet()
	 * @model required="true"
	 * @generated
	 */
	EList<ConstantExpression> getConstantSet();

} // InExpression
