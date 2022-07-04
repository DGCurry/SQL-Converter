/**
 */
package nl.tue.gtl.tql.model.impl;

import java.util.Collection;
import nl.tue.gtl.tql.model.CallParameter;
import nl.tue.gtl.tql.model.ModelPackage;
import nl.tue.gtl.tql.model.Transformation;
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
 * An implementation of the model object '<em><b>Transformation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationCallImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationCallImpl#getCallParameters <em>Call Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationCallImpl extends MinimalEObjectImpl.Container implements TransformationCall {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The cached value of the '{@link #getCallParameters() <em>Call Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<CallParameter> callParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRANSFORMATION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject) transformation;
			transformation = (Transformation) eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION,
					oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallParameter> getCallParameters() {
		if (callParameters == null) {
			callParameters = new EObjectContainmentEList<CallParameter>(CallParameter.class, this,
					ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS);
		}
		return callParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS:
			return ((InternalEList<?>) getCallParameters()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			if (resolve)
				return getTransformation();
			return basicGetTransformation();
		case ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS:
			return getCallParameters();
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
		case ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			setTransformation((Transformation) newValue);
			return;
		case ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS:
			getCallParameters().clear();
			getCallParameters().addAll((Collection<? extends CallParameter>) newValue);
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
		case ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			setTransformation((Transformation) null);
			return;
		case ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS:
			getCallParameters().clear();
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
		case ModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			return transformation != null;
		case ModelPackage.TRANSFORMATION_CALL__CALL_PARAMETERS:
			return callParameters != null && !callParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationCallImpl
