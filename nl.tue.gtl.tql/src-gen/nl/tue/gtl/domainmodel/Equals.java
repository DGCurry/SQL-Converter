/**
 * generated by Xtext 2.27.0
 */
package nl.tue.gtl.domainmodel;

import nl.tue.gtl.tql.model.Expression;
import nl.tue.gtl.tql.model.Operator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.domainmodel.Equals#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.tue.gtl.domainmodel.Equals#getOperator <em>Operator</em>}</li>
 *   <li>{@link nl.tue.gtl.domainmodel.Equals#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getEquals()
 * @model
 * @generated
 */
public interface Equals extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getEquals_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link nl.tue.gtl.domainmodel.Equals#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link nl.tue.gtl.tql.model.Operator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see nl.tue.gtl.tql.model.Operator
   * @see #setOperator(Operator)
   * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getEquals_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link nl.tue.gtl.domainmodel.Equals#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see nl.tue.gtl.tql.model.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see nl.tue.gtl.domainmodel.DomainmodelPackage#getEquals_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link nl.tue.gtl.domainmodel.Equals#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Equals
