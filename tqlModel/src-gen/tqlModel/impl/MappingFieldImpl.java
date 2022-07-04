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

import tqlModel.MappingField;
import tqlModel.TableField;
import tqlModel.TqlModelPackage;
import tqlModel.TransformationCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.MappingFieldImpl#getSouceField <em>Souce Field</em>}</li>
 *   <li>{@link tqlModel.impl.MappingFieldImpl#getTargetField <em>Target Field</em>}</li>
 *   <li>{@link tqlModel.impl.MappingFieldImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingFieldImpl extends MinimalEObjectImpl.Container implements MappingField {
	/**
	 * The cached value of the '{@link #getSouceField() <em>Souce Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouceField()
	 * @generated
	 * @ordered
	 */
	protected TableField souceField;

	/**
	 * The cached value of the '{@link #getTargetField() <em>Target Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetField()
	 * @generated
	 * @ordered
	 */
	protected TableField targetField;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationCall> calls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.MAPPING_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableField getSouceField() {
		if (souceField != null && souceField.eIsProxy()) {
			InternalEObject oldSouceField = (InternalEObject) souceField;
			souceField = (TableField) eResolveProxy(oldSouceField);
			if (souceField != oldSouceField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD, oldSouceField, souceField));
			}
		}
		return souceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableField basicGetSouceField() {
		return souceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouceField(TableField newSouceField) {
		TableField oldSouceField = souceField;
		souceField = newSouceField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD,
					oldSouceField, souceField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableField getTargetField() {
		if (targetField != null && targetField.eIsProxy()) {
			InternalEObject oldTargetField = (InternalEObject) targetField;
			targetField = (TableField) eResolveProxy(oldTargetField);
			if (targetField != oldTargetField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.MAPPING_FIELD__TARGET_FIELD, oldTargetField, targetField));
			}
		}
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableField basicGetTargetField() {
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetField(TableField newTargetField) {
		TableField oldTargetField = targetField;
		targetField = newTargetField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.MAPPING_FIELD__TARGET_FIELD,
					oldTargetField, targetField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationCall> getCalls() {
		if (calls == null) {
			calls = new EObjectContainmentEList<TransformationCall>(TransformationCall.class, this,
					TqlModelPackage.MAPPING_FIELD__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TqlModelPackage.MAPPING_FIELD__CALLS:
			return ((InternalEList<?>) getCalls()).basicRemove(otherEnd, msgs);
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
		case TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD:
			if (resolve)
				return getSouceField();
			return basicGetSouceField();
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			if (resolve)
				return getTargetField();
			return basicGetTargetField();
		case TqlModelPackage.MAPPING_FIELD__CALLS:
			return getCalls();
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
		case TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD:
			setSouceField((TableField) newValue);
			return;
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			setTargetField((TableField) newValue);
			return;
		case TqlModelPackage.MAPPING_FIELD__CALLS:
			getCalls().clear();
			getCalls().addAll((Collection<? extends TransformationCall>) newValue);
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
		case TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD:
			setSouceField((TableField) null);
			return;
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			setTargetField((TableField) null);
			return;
		case TqlModelPackage.MAPPING_FIELD__CALLS:
			getCalls().clear();
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
		case TqlModelPackage.MAPPING_FIELD__SOUCE_FIELD:
			return souceField != null;
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			return targetField != null;
		case TqlModelPackage.MAPPING_FIELD__CALLS:
			return calls != null && !calls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingFieldImpl
