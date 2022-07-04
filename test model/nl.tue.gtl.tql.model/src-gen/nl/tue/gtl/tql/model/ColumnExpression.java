/**
 */
package nl.tue.gtl.tql.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.ColumnExpression#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getColumnExpression()
 * @model
 * @generated
 */
public interface ColumnExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getColumnExpression_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.ColumnExpression#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // ColumnExpression
