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

import tqlModel.Parameter;
import tqlModel.Statement;
import tqlModel.TqlModelPackage;
import tqlModel.Transformation;
import tqlModel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tqlModel.impl.TransformationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final Type RETURN_TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement returnStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TqlModelPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					TqlModelPackage.TRANSFORMATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.TRANSFORMATION__RETURN_TYPE,
					oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getReturnStatement() {
		if (returnStatement != null && returnStatement.eIsProxy()) {
			InternalEObject oldReturnStatement = (InternalEObject) returnStatement;
			returnStatement = (Statement) eResolveProxy(oldReturnStatement);
			if (returnStatement != oldReturnStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT, oldReturnStatement, returnStatement));
			}
		}
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetReturnStatement() {
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnStatement(Statement newReturnStatement) {
		Statement oldReturnStatement = returnStatement;
		returnStatement = newReturnStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT,
					oldReturnStatement, returnStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TqlModelPackage.TRANSFORMATION__PARAMETERS:
			return getParameters();
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			return getReturnType();
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			if (resolve)
				return getReturnStatement();
			return basicGetReturnStatement();
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
		case TqlModelPackage.TRANSFORMATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			setReturnType((Type) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			setReturnStatement((Statement) newValue);
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
		case TqlModelPackage.TRANSFORMATION__PARAMETERS:
			getParameters().clear();
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			setReturnStatement((Statement) null);
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
		case TqlModelPackage.TRANSFORMATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			return returnStatement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
