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

import tqlModel.TableField;
import tqlModel.TqlModelPackage;
import tqlModel.Transformation;
import tqlModel.TransformationCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.TransformationCallImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationCallImpl#getParameters <em>Parameters</em>}</li>
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TableField> parameters;

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
		return TqlModelPackage.Literals.TRANSFORMATION_CALL;
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
							TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION, oldTransformation, transformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION,
					oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableField> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<TableField>(TableField.class, this,
					TqlModelPackage.TRANSFORMATION_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			if (resolve)
				return getTransformation();
			return basicGetTransformation();
		case TqlModelPackage.TRANSFORMATION_CALL__PARAMETERS:
			return getParameters();
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
		case TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			setTransformation((Transformation) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION_CALL__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends TableField>) newValue);
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
		case TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			setTransformation((Transformation) null);
			return;
		case TqlModelPackage.TRANSFORMATION_CALL__PARAMETERS:
			getParameters().clear();
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
		case TqlModelPackage.TRANSFORMATION_CALL__TRANSFORMATION:
			return transformation != null;
		case TqlModelPackage.TRANSFORMATION_CALL__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationCallImpl
