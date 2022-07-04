/**
 */
package nl.tue.gtl.tql.model.impl;

import java.util.Collection;
import nl.tue.gtl.tql.model.Column;
import nl.tue.gtl.tql.model.MappedColumn;
import nl.tue.gtl.tql.model.ModelPackage;

import nl.tue.gtl.tql.model.TransformationCall;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.impl.MappedColumnImpl#getSource <em>Source</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.MappedColumnImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.MappedColumnImpl#getTransformationCalls <em>Transformation Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedColumnImpl extends MinimalEObjectImpl.Container implements MappedColumn {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Column source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Column target;

	/**
	 * The cached value of the '{@link #getTransformationCalls() <em>Transformation Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationCall> transformationCalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MAPPED_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Column) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAPPED_COLUMN__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Column newSource) {
		Column oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPED_COLUMN__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Column) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAPPED_COLUMN__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Column newTarget) {
		Column oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPED_COLUMN__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationCall> getTransformationCalls() {
		if (transformationCalls == null) {
			transformationCalls = new EObjectContainmentEList<TransformationCall>(TransformationCall.class, this,
					ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS);
		}
		return transformationCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS:
			return ((InternalEList<?>) getTransformationCalls()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.MAPPED_COLUMN__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModelPackage.MAPPED_COLUMN__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS:
			return getTransformationCalls();
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
		case ModelPackage.MAPPED_COLUMN__SOURCE:
			setSource((Column) newValue);
			return;
		case ModelPackage.MAPPED_COLUMN__TARGET:
			setTarget((Column) newValue);
			return;
		case ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS:
			getTransformationCalls().clear();
			getTransformationCalls().addAll((Collection<? extends TransformationCall>) newValue);
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
		case ModelPackage.MAPPED_COLUMN__SOURCE:
			setSource((Column) null);
			return;
		case ModelPackage.MAPPED_COLUMN__TARGET:
			setTarget((Column) null);
			return;
		case ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS:
			getTransformationCalls().clear();
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
		case ModelPackage.MAPPED_COLUMN__SOURCE:
			return source != null;
		case ModelPackage.MAPPED_COLUMN__TARGET:
			return target != null;
		case ModelPackage.MAPPED_COLUMN__TRANSFORMATION_CALLS:
			return transformationCalls != null && !transformationCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappedColumnImpl
