/**
 */
package nl.tue.gtl.tql.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.TransformationCall#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.TransformationCall#getCallParameters <em>Call Parameters</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformationCall()
 * @model
 * @generated
 */
public interface TransformationCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Transformation)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformationCall_Transformation()
	 * @model required="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.TransformationCall#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Call Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.gtl.tql.model.CallParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Parameters</em>' containment reference list.
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformationCall_CallParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallParameter> getCallParameters();

} // TransformationCall
