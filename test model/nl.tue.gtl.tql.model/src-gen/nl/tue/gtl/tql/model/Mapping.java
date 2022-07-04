/**
 */
package nl.tue.gtl.tql.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.Mapping#getMappedColumns <em>Mapped Columns</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.Mapping#getSource <em>Source</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.Mapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Block {
	/**
	 * Returns the value of the '<em><b>Mapped Columns</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.gtl.tql.model.MappedColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Columns</em>' containment reference list.
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMapping_MappedColumns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MappedColumn> getMappedColumns();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SourceTable)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMapping_Source()
	 * @model required="true"
	 * @generated
	 */
	SourceTable getSource();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.Mapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceTable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TargetTable)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMapping_Target()
	 * @model required="true"
	 * @generated
	 */
	TargetTable getTarget();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.Mapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetTable value);

} // Mapping
