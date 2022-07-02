/**
 */
package tqlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.ReferenceStatement#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getReferenceStatement()
 * @model
 * @generated
 */
public interface ReferenceStatement extends Parameter {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference.
	 * @see #setColumns(Columns)
	 * @see tqlModel.TqlModelPackage#getReferenceStatement_Columns()
	 * @model
	 * @generated
	 */
	Columns getColumns();

	/**
	 * Sets the value of the '{@link tqlModel.ReferenceStatement#getColumns <em>Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Columns value);

} // ReferenceStatement
