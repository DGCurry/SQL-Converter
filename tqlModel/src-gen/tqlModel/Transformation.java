/**
 */
package tqlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.Transformation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link tqlModel.Transformation#getSelfType <em>Self Type</em>}</li>
 *   <li>{@link tqlModel.Transformation#getLabel <em>Label</em>}</li>
 *   <li>{@link tqlModel.Transformation#getReturnStatement <em>Return Statement</em>}</li>
 *   <li>{@link tqlModel.Transformation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see tqlModel.TqlModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Block {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #setReturnType(Type)
	 * @see tqlModel.TqlModelPackage#getTransformation_ReturnType()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Self Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tqlModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #setSelfType(Type)
	 * @see tqlModel.TqlModelPackage#getTransformation_SelfType()
	 * @model required="true"
	 * @generated
	 */
	Type getSelfType();

	/**
	 * Sets the value of the '{@link tqlModel.Transformation#getSelfType <em>Self Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Type</em>' attribute.
	 * @see tqlModel.Type
	 * @see #getSelfType()
	 * @generated
	 */
	void setSelfType(Type value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see tqlModel.TqlModelPackage#getTransformation_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link tqlModel.Transformation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Return Statement</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Statement</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getTransformation_ReturnStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getReturnStatement();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link tqlModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see tqlModel.TqlModelPackage#getTransformation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Transformation
