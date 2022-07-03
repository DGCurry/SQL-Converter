/**
 */
package tqlModel;

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
 *   <li>{@link tqlModel.TransformationCall#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link tqlModel.TransformationCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getTransformationCall()
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
	 * @see tqlModel.TqlModelPackage#getTransformationCall_Transformation()
	 * @model required="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link tqlModel.TransformationCall#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link tqlModel.TableField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see tqlModel.TqlModelPackage#getTransformationCall_Parameters()
	 * @model
	 * @generated
	 */
	EList<TableField> getParameters();

} // TransformationCall
