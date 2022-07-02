/**
 */
package tqlModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tqlModel.Columns;
import tqlModel.ReferenceStatement;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.ReferenceStatementImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceStatementImpl extends MinimalEObjectImpl.Container implements ReferenceStatement {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected Columns columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.REFERENCE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns getColumns() {
		if (columns != null && columns.eIsProxy()) {
			InternalEObject oldColumns = (InternalEObject) columns;
			columns = (Columns) eResolveProxy(oldColumns);
			if (columns != oldColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.REFERENCE_STATEMENT__COLUMNS, oldColumns, columns));
			}
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns basicGetColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(Columns newColumns) {
		Columns oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.REFERENCE_STATEMENT__COLUMNS,
					oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.REFERENCE_STATEMENT__COLUMNS:
			if (resolve)
				return getColumns();
			return basicGetColumns();
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
		case TqlModelPackage.REFERENCE_STATEMENT__COLUMNS:
			setColumns((Columns) newValue);
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
		case TqlModelPackage.REFERENCE_STATEMENT__COLUMNS:
			setColumns((Columns) null);
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
		case TqlModelPackage.REFERENCE_STATEMENT__COLUMNS:
			return columns != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceStatementImpl
