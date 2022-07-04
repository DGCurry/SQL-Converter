/**
 */
package nl.tue.gtl.tql.model;

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
 *   <li>{@link nl.tue.gtl.tql.model.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.Transformation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.Transformation#getInType <em>In Type</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.Transformation#getOutType <em>Out Type</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Block {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.gtl.tql.model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>In Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.gtl.tql.model.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Type</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Type
	 * @see #setInType(Type)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformation_InType()
	 * @model
	 * @generated
	 */
	Type getInType();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.Transformation#getInType <em>In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Type</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Type
	 * @see #getInType()
	 * @generated
	 */
	void setInType(Type value);

	/**
	 * Returns the value of the '<em><b>Out Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.gtl.tql.model.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Type</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Type
	 * @see #setOutType(Type)
	 * @see nl.tue.gtl.tql.model.ModelPackage#getTransformation_OutType()
	 * @model
	 * @generated
	 */
	Type getOutType();

	/**
	 * Sets the value of the '{@link nl.tue.gtl.tql.model.Transformation#getOutType <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Type</em>' attribute.
	 * @see nl.tue.gtl.tql.model.Type
	 * @see #getOutType()
	 * @generated
	 */
	void setOutType(Type value);

} // Transformation
