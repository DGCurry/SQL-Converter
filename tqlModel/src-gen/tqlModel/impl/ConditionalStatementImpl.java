/**
 */
package tqlModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tqlModel.BooleanOperationExpression;
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
 *   <li>{@link tqlModel.impl.ConditionalStatementImpl#getBooleanoperationexpression <em>Booleanoperationexpression</em>}</li>
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
	 * The cached value of the '{@link #getIfBody() <em>If Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ifBody;

	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseBody;

	/**
	 * The cached value of the '{@link #getBooleanoperationexpression() <em>Booleanoperationexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanoperationexpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperationExpression booleanoperationexpression;

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
	public EList<Statement> getIfBody() {
		if (ifBody == null) {
			ifBody = new EObjectContainmentEList<Statement>(Statement.class, this,
					TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY);
		}
		return ifBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElseBody() {
		if (elseBody == null) {
			elseBody = new EObjectContainmentEList<Statement>(Statement.class, this,
					TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY);
		}
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationExpression getBooleanoperationexpression() {
		if (booleanoperationexpression != null && booleanoperationexpression.eIsProxy()) {
			InternalEObject oldBooleanoperationexpression = (InternalEObject) booleanoperationexpression;
			booleanoperationexpression = (BooleanOperationExpression) eResolveProxy(oldBooleanoperationexpression);
			if (booleanoperationexpression != oldBooleanoperationexpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION,
							oldBooleanoperationexpression, booleanoperationexpression));
			}
		}
		return booleanoperationexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationExpression basicGetBooleanoperationexpression() {
		return booleanoperationexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanoperationexpression(BooleanOperationExpression newBooleanoperationexpression) {
		BooleanOperationExpression oldBooleanoperationexpression = booleanoperationexpression;
		booleanoperationexpression = newBooleanoperationexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION, oldBooleanoperationexpression,
					booleanoperationexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			return ((InternalEList<?>) getIfBody()).basicRemove(otherEnd, msgs);
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			return ((InternalEList<?>) getElseBody()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			return getIfBody();
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			return getElseBody();
		case TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION:
			if (resolve)
				return getBooleanoperationexpression();
			return basicGetBooleanoperationexpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TqlModelPackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Expression) newValue);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__IF_BODY:
			getIfBody().clear();
			getIfBody().addAll((Collection<? extends Statement>) newValue);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			getElseBody().clear();
			getElseBody().addAll((Collection<? extends Statement>) newValue);
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION:
			setBooleanoperationexpression((BooleanOperationExpression) newValue);
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
			getIfBody().clear();
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			getElseBody().clear();
			return;
		case TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION:
			setBooleanoperationexpression((BooleanOperationExpression) null);
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
			return ifBody != null && !ifBody.isEmpty();
		case TqlModelPackage.CONDITIONAL_STATEMENT__ELSE_BODY:
			return elseBody != null && !elseBody.isEmpty();
		case TqlModelPackage.CONDITIONAL_STATEMENT__BOOLEANOPERATIONEXPRESSION:
			return booleanoperationexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStatementImpl
