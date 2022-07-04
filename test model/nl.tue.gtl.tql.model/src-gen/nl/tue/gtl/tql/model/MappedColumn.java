/**
 */
package nl.tue.gtl.tql.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.MappedColumn#getSource <em>Source</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.MappedColumn#getTarget <em>Target</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.MappedColumn#getTransformationCalls <em>Transformation Calls</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getMappedColumn()
 * @model
 * @generated
 */
public interface MappedColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Column)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMappedColumn_Source()
	 * @model required="true"
	 * @generated
	 */
	Column getSource();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.MappedColumn#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Column value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Column)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMappedColumn_Target()
	 * @model required="true"
	 * @generated
	 */
	Column getTarget();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.MappedColumn#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Column value);

	/**
	 * Returns the value of the '<em><b>Transformation Calls</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.gtl.tql.model.TransformationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Calls</em>' containment reference list.
	 * @see nl.tue.gtl.tql.model.ModelPackage#getMappedColumn_TransformationCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationCall> getTransformationCalls();

} // MappedColumn
