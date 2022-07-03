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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tqlModel.BooleanOperationExpression;
import tqlModel.Mapping;
import tqlModel.MappingField;
import tqlModel.MappingSourceTable;
import tqlModel.MappingTargetTable;
import tqlModel.TqlModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.MappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tqlModel.impl.MappingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link tqlModel.impl.MappingImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link tqlModel.impl.MappingImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingSourceTable> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingTargetTable> target;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingField> fields;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperationExpression when;

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
	public EList<MappingSourceTable> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<MappingSourceTable>(MappingSourceTable.class, this,
					TqlModelPackage.MAPPING__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingTargetTable> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<MappingTargetTable>(MappingTargetTable.class, this,
					TqlModelPackage.MAPPING__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingField> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<MappingField>(MappingField.class, this, TqlModelPackage.MAPPING__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationExpression getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject) when;
			when = (BooleanOperationExpression) eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TqlModelPackage.MAPPING__WHEN, oldWhen,
							when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationExpression basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(BooleanOperationExpression newWhen) {
		BooleanOperationExpression oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.MAPPING__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TqlModelPackage.MAPPING__SOURCE:
			return ((InternalEList<?>) getSource()).basicRemove(otherEnd, msgs);
		case TqlModelPackage.MAPPING__TARGET:
			return ((InternalEList<?>) getTarget()).basicRemove(otherEnd, msgs);
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
		case TqlModelPackage.MAPPING__SOURCE:
			return getSource();
		case TqlModelPackage.MAPPING__TARGET:
			return getTarget();
		case TqlModelPackage.MAPPING__FIELDS:
			return getFields();
		case TqlModelPackage.MAPPING__WHEN:
			if (resolve)
				return getWhen();
			return basicGetWhen();
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
		case TqlModelPackage.MAPPING__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends MappingSourceTable>) newValue);
			return;
		case TqlModelPackage.MAPPING__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends MappingTargetTable>) newValue);
			return;
		case TqlModelPackage.MAPPING__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends MappingField>) newValue);
			return;
		case TqlModelPackage.MAPPING__WHEN:
			setWhen((BooleanOperationExpression) newValue);
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
		case TqlModelPackage.MAPPING__SOURCE:
			getSource().clear();
			return;
		case TqlModelPackage.MAPPING__TARGET:
			getTarget().clear();
			return;
		case TqlModelPackage.MAPPING__FIELDS:
			getFields().clear();
			return;
		case TqlModelPackage.MAPPING__WHEN:
			setWhen((BooleanOperationExpression) null);
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
		case TqlModelPackage.MAPPING__SOURCE:
			return source != null && !source.isEmpty();
		case TqlModelPackage.MAPPING__TARGET:
			return target != null && !target.isEmpty();
		case TqlModelPackage.MAPPING__FIELDS:
			return fields != null && !fields.isEmpty();
		case TqlModelPackage.MAPPING__WHEN:
			return when != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
