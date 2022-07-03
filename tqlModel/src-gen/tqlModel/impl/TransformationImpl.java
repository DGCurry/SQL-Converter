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

import tqlModel.Expression;
import tqlModel.Parameter;
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
 *   <li>{@link tqlModel.impl.TransformationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getSelfType <em>Self Type</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getReturnStatement <em>Return Statement</em>}</li>
 *   <li>{@link tqlModel.impl.TransformationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
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
	 * The default value of the '{@link #getSelfType() <em>Self Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfType()
	 * @generated
	 * @ordered
	 */
	protected static final Type SELF_TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getSelfType() <em>Self Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfType()
	 * @generated
	 * @ordered
	 */
	protected Type selfType = SELF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> returnStatement;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

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
	public Type getSelfType() {
		return selfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfType(Type newSelfType) {
		Type oldSelfType = selfType;
		selfType = newSelfType == null ? SELF_TYPE_EDEFAULT : newSelfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.TRANSFORMATION__SELF_TYPE,
					oldSelfType, selfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TqlModelPackage.TRANSFORMATION__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getReturnStatement() {
		if (returnStatement == null) {
			returnStatement = new EObjectContainmentEList<Expression>(Expression.class, this,
					TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT);
		}
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					TqlModelPackage.TRANSFORMATION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			return ((InternalEList<?>) getReturnStatement()).basicRemove(otherEnd, msgs);
		case TqlModelPackage.TRANSFORMATION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			return getReturnType();
		case TqlModelPackage.TRANSFORMATION__SELF_TYPE:
			return getSelfType();
		case TqlModelPackage.TRANSFORMATION__LABEL:
			return getLabel();
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			return getReturnStatement();
		case TqlModelPackage.TRANSFORMATION__PARAMETER:
			return getParameter();
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
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			setReturnType((Type) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__SELF_TYPE:
			setSelfType((Type) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__LABEL:
			setLabel((String) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			getReturnStatement().clear();
			getReturnStatement().addAll((Collection<? extends Expression>) newValue);
			return;
		case TqlModelPackage.TRANSFORMATION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
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
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case TqlModelPackage.TRANSFORMATION__SELF_TYPE:
			setSelfType(SELF_TYPE_EDEFAULT);
			return;
		case TqlModelPackage.TRANSFORMATION__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			getReturnStatement().clear();
			return;
		case TqlModelPackage.TRANSFORMATION__PARAMETER:
			getParameter().clear();
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
		case TqlModelPackage.TRANSFORMATION__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case TqlModelPackage.TRANSFORMATION__SELF_TYPE:
			return selfType != SELF_TYPE_EDEFAULT;
		case TqlModelPackage.TRANSFORMATION__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case TqlModelPackage.TRANSFORMATION__RETURN_STATEMENT:
			return returnStatement != null && !returnStatement.isEmpty();
		case TqlModelPackage.TRANSFORMATION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
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
		result.append(", selfType: ");
		result.append(selfType);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
