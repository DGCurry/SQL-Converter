/**
 */
package nl.tue.gtl.tql.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.SetConstant#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.tql.model.ModelPackage#getSetConstant()
 * @model
 * @generated
 */
public interface SetConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.gtl.tql.model.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see nl.tue.gtl.tql.model.ModelPackage#getSetConstant_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getValues();

} // SetConstant
