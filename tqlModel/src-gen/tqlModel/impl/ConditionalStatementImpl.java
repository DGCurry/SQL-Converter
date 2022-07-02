/**
 */
package tqlModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tqlModel.ConditionalStatement;
import tqlModel.Expression;
import tqlModel.Statement;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.ConditionalStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link tqlModel.impl.ConditionalStatementImpl#getIfBody <em>If Body</em>}</li>
 *   <li>{@link tqlModel.impl.ConditionalStatementImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStatementImpl extends MinimalEObjectImpl.Container implements ConditionalStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getIfBody() <em>If Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBody()
	 * @generated
	 * @ordered
	 */
	protected Statement ifBody;

	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected Statement elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.CONDITIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (Expression) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getIfBody() {
		if (ifBody != null && ifBody.eIsProxy()) {
			InternalEObject oldIfBody = (InternalEObject) ifBody;
			ifBody = (Statement) eResolveProxy(oldIfBody);
			if (ifBody != oldIfBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY, oldIfBody, ifBody));
			}
		}
		return ifBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetIfBody() {
		return ifBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBody(Statement newIfBody) {
		Statement oldIfBody = ifBody;
		ifBody = newIfBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY,
					oldIfBody, ifBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseBody() {
		if (elseBody != null && elseBody.eIsProxy()) {
			InternalEObject oldElseBody = (InternalEObject) elseBody;
			elseBody = (Statement) eResolveProxy(oldElseBody);
			if (elseBody != oldElseBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY, oldElseBody, elseBody));
			}
		}
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetElseBody() {
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBody(Statement newElseBody) {
		Statement oldElseBody = elseBody;
		elseBody = newElseBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY,
					oldElseBody, elseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			if (resolve)
				return getIfBody();
			return basicGetIfBody();
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			if (resolve)
				return getElseBody();
			return basicGetElseBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Expression) newValue);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			setIfBody((Statement) newValue);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			setElseBody((Statement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Expression) null);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			setIfBody((Statement) null);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			setElseBody((Statement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION:
			return condition != null;
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			return ifBody != null;
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			return elseBody != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStatementImpl
