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

import tqlModel.Columns;
import tqlModel.MappingField;
import tqlModel.TqlModelPackage;
import tqlModel.Transformation;

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
 *   <li>{@link tqlModel.impl.MappingFieldImpl#getTransformations <em>Transformations</em>}</li>
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
	protected Columns souceField;

	/**
	 * The cached value of the '{@link #getTargetField() <em>Target Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetField()
	 * @generated
	 * @ordered
	 */
	protected Columns targetField;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

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
	public Columns getSouceField() {
		if (souceField != null && souceField.eIsProxy()) {
			InternalEObject oldSouceField = (InternalEObject) souceField;
			souceField = (Columns) eResolveProxy(oldSouceField);
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
	public Columns basicGetSouceField() {
		return souceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouceField(Columns newSouceField) {
		Columns oldSouceField = souceField;
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
	public Columns getTargetField() {
		if (targetField != null && targetField.eIsProxy()) {
			InternalEObject oldTargetField = (InternalEObject) targetField;
			targetField = (Columns) eResolveProxy(oldTargetField);
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
	public Columns basicGetTargetField() {
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetField(Columns newTargetField) {
		Columns oldTargetField = targetField;
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
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectResolvingEList<Transformation>(Transformation.class, this,
					TqlModelPackage.MAPPING_FIELD__TRANSFORMATIONS);
		}
		return transformations;
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
		case TqlModelPackage.MAPPING_FIELD__TRANSFORMATIONS:
			return getTransformations();
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
			setSouceField((Columns) newValue);
			return;
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			setTargetField((Columns) newValue);
			return;
		case TqlModelPackage.MAPPING_FIELD__TRANSFORMATIONS:
			getTransformations().clear();
			getTransformations().addAll((Collection<? extends Transformation>) newValue);
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
			setSouceField((Columns) null);
			return;
		case TqlModelPackage.MAPPING_FIELD__TARGET_FIELD:
			setTargetField((Columns) null);
			return;
		case TqlModelPackage.MAPPING_FIELD__TRANSFORMATIONS:
			getTransformations().clear();
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
		case TqlModelPackage.MAPPING_FIELD__TRANSFORMATIONS:
			return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingFieldImpl
