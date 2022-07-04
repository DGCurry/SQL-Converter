/**
 * generated by Xtext 2.27.0
 */
package nl.tue.gtl.domainmodel;

import nl.tue.gtl.tql.model.Block;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.domainmodel.TQL#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getTQL()
 * @model
 * @generated
 */
public interface TQL extends EObject
{
  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link nl.tue.gtl.tql.model.Block}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getTQL_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<Block> getBlocks();

} // TQL
