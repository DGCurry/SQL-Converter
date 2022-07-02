/**
 */
package tqlModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tqlModel.ConstantExpression;
import tqlModel.Expression;
import tqlModel.InExpression;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.InExpressionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link tqlModel.impl.InExpressionImpl#getConstantSet <em>Constant Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InExpressionImpl extends MinimalEObjectImpl.Container implements InExpression {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Expression statement;

	/**
	 * The cached value of the '{@link #getConstantSet() <em>Constant Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantExpression> constantSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.IN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStatement() {
		if (statement != null && statement.eIsProxy()) {
			InternalEObject oldStatement = (InternalEObject) statement;
			statement = (Expression) eResolveProxy(oldStatement);
			if (statement != oldStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TqlModelPackage.IN_EXPRESSION__STATEMENT,
							oldStatement, statement));
			}
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(Expression newStatement) {
		Expression oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.IN_EXPRESSION__STATEMENT,
					oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantExpression> getConstantSet() {
		if (constantSet == null) {
			constantSet = new EObjectResolvingEList<ConstantExpression>(ConstantExpression.class, this,
					TqlModelPackage.IN_EXPRESSION__CONSTANT_SET);
		}
		return constantSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.IN_EXPRESSION__STATEMENT:
			if (resolve)
				return getStatement();
			return basicGetStatement();
		case TqlModelPackage.IN_EXPRESSION__CONSTANT_SET:
			return getConstantSet();
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
		case TqlModelPackage.IN_EXPRESSION__STATEMENT:
			setStatement((Expression) newValue);
			return;
		case TqlModelPackage.IN_EXPRESSION__CONSTANT_SET:
			getConstantSet().clear();
			getConstantSet().addAll((Collection<? extends ConstantExpression>) newValue);
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
		case TqlModelPackage.IN_EXPRESSION__STATEMENT:
			setStatement((Expression) null);
			return;
		case TqlModelPackage.IN_EXPRESSION__CONSTANT_SET:
			getConstantSet().clear();
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
		case TqlModelPackage.IN_EXPRESSION__STATEMENT:
			return statement != null;
		case TqlModelPackage.IN_EXPRESSION__CONSTANT_SET:
			return constantSet != null && !constantSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InExpressionImpl
