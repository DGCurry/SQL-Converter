/**
 */
package tqlModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tqlModel.Expression;
import tqlModel.ParameterStatement;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.ParameterStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterStatementImpl extends MinimalEObjectImpl.Container implements ParameterStatement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.PARAMETER_STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.PARAMETER_STATEMENT__STATEMENT, oldStatement, statement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.PARAMETER_STATEMENT__STATEMENT,
					oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.PARAMETER_STATEMENT__STATEMENT:
			if (resolve)
				return getStatement();
			return basicGetStatement();
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
		case TqlModelPackage.PARAMETER_STATEMENT__STATEMENT:
			setStatement((Expression) newValue);
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
		case TqlModelPackage.PARAMETER_STATEMENT__STATEMENT:
			setStatement((Expression) null);
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
		case TqlModelPackage.PARAMETER_STATEMENT__STATEMENT:
			return statement != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterStatementImpl
