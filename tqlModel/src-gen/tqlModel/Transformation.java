/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.Transformation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tqlModel.Transformation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link tqlModel.Transformation#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link tqlModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see tqlModel.TqlModelPackage#getTransformation_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #setReturnType(Type)
	 * @see tqlModel.TqlModelPackage#getTransformation_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link tqlModel.Transformation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Return Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Statement</em>' reference.
	 * @see #setReturnStatement(Statement)
	 * @see tqlModel.TqlModelPackage#getTransformation_ReturnStatement()
	 * @model required="true"
	 * @generated
	 */
	Statement getReturnStatement();

	/**
	 * Sets the value of the '{@link tqlModel.Transformation#getReturnStatement <em>Return Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Statement</em>' reference.
	 * @see #getReturnStatement()
	 * @generated
	 */
	void setReturnStatement(Statement value);

} // Transformation
