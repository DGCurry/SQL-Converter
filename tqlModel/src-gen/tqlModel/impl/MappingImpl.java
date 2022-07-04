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

import tqlModel.Mapping;
import tqlModel.MappingField;
import tqlModel.SourceTable;
import tqlModel.TargetTable;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.MappingImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link tqlModel.impl.MappingImpl#getSourcetable <em>Sourcetable</em>}</li>
 *   <li>{@link tqlModel.impl.MappingImpl#getTargettable <em>Targettable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingField> fields;

	/**
	 * The cached value of the '{@link #getSourcetable() <em>Sourcetable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcetable()
	 * @generated
	 * @ordered
	 */
	protected SourceTable sourcetable;

	/**
	 * The cached value of the '{@link #getTargettable() <em>Targettable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargettable()
	 * @generated
	 * @ordered
	 */
	protected TargetTable targettable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<MappingField>(MappingField.class, this,
					TqlModelPackage.MAPPING__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTable getSourcetable() {
		if (sourcetable != null && sourcetable.eIsProxy()) {
			InternalEObject oldSourcetable = (InternalEObject) sourcetable;
			sourcetable = (SourceTable) eResolveProxy(oldSourcetable);
			if (sourcetable != oldSourcetable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TqlModelPackage.MAPPING__SOURCETABLE,
							oldSourcetable, sourcetable));
			}
		}
		return sourcetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTable basicGetSourcetable() {
		return sourcetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcetable(SourceTable newSourcetable) {
		SourceTable oldSourcetable = sourcetable;
		sourcetable = newSourcetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.MAPPING__SOURCETABLE, oldSourcetable,
					sourcetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTable getTargettable() {
		if (targettable != null && targettable.eIsProxy()) {
			InternalEObject oldTargettable = (InternalEObject) targettable;
			targettable = (TargetTable) eResolveProxy(oldTargettable);
			if (targettable != oldTargettable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TqlModelPackage.MAPPING__TARGETTABLE,
							oldTargettable, targettable));
			}
		}
		return targettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTable basicGetTargettable() {
		return targettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargettable(TargetTable newTargettable) {
		TargetTable oldTargettable = targettable;
		targettable = newTargettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.MAPPING__TARGETTABLE, oldTargettable,
					targettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TqlModelPackage.MAPPING__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
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
		case TqlModelPackage.MAPPING__FIELDS:
			return getFields();
		case TqlModelPackage.MAPPING__SOURCETABLE:
			if (resolve)
				return getSourcetable();
			return basicGetSourcetable();
		case TqlModelPackage.MAPPING__TARGETTABLE:
			if (resolve)
				return getTargettable();
			return basicGetTargettable();
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
		case TqlModelPackage.MAPPING__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends MappingField>) newValue);
			return;
		case TqlModelPackage.MAPPING__SOURCETABLE:
			setSourcetable((SourceTable) newValue);
			return;
		case TqlModelPackage.MAPPING__TARGETTABLE:
			setTargettable((TargetTable) newValue);
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
		case TqlModelPackage.MAPPING__FIELDS:
			getFields().clear();
			return;
		case TqlModelPackage.MAPPING__SOURCETABLE:
			setSourcetable((SourceTable) null);
			return;
		case TqlModelPackage.MAPPING__TARGETTABLE:
			setTargettable((TargetTable) null);
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
		case TqlModelPackage.MAPPING__FIELDS:
			return fields != null && !fields.isEmpty();
		case TqlModelPackage.MAPPING__SOURCETABLE:
			return sourcetable != null;
		case TqlModelPackage.MAPPING__TARGETTABLE:
			return targettable != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
