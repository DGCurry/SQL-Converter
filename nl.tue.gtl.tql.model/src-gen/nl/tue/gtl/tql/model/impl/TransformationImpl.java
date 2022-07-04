/**
 */
package nl.tue.gtl.tql.model.impl;

import java.util.Collection;

import nl.tue.gtl.tql.model.Expression;
import nl.tue.gtl.tql.model.ModelPackage;
import nl.tue.gtl.tql.model.Parameter;
import nl.tue.gtl.tql.model.Transformation;
import nl.tue.gtl.tql.model.Type;

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
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationImpl#getInType <em>In Type</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationImpl#getOutType <em>Out Type</em>}</li>
 *   <li>{@link nl.tue.gtl.tql.model.impl.TransformationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getInType() <em>In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInType()
	 * @generated
	 * @ordered
	 */
	protected static final Type IN_TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getInType() <em>In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInType()
	 * @generated
	 * @ordered
	 */
	protected Type inType = IN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutType() <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutType()
	 * @generated
	 * @ordered
	 */
	protected static final Type OUT_TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getOutType() <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutType()
	 * @generated
	 * @ordered
	 */
	protected Type outType = OUT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

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
		return ModelPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ModelPackage.TRANSFORMATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getInType() {
		return inType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInType(Type newInType) {
		Type oldInType = inType;
		inType = newInType == null ? IN_TYPE_EDEFAULT : newInType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION__IN_TYPE, oldInType,
					inType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOutType() {
		return outType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutType(Type newOutType) {
		Type oldOutType = outType;
		outType = newOutType == null ? OUT_TYPE_EDEFAULT : newOutType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION__OUT_TYPE, oldOutType,
					outType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.TRANSFORMATION__BODY, oldBody, newBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.TRANSFORMATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.TRANSFORMATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.TRANSFORMATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case ModelPackage.TRANSFORMATION__BODY:
			return basicSetBody(null, msgs);
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
		case ModelPackage.TRANSFORMATION__NAME:
			return getName();
		case ModelPackage.TRANSFORMATION__PARAMETERS:
			return getParameters();
		case ModelPackage.TRANSFORMATION__IN_TYPE:
			return getInType();
		case ModelPackage.TRANSFORMATION__OUT_TYPE:
			return getOutType();
		case ModelPackage.TRANSFORMATION__BODY:
			return getBody();
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
		case ModelPackage.TRANSFORMATION__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.TRANSFORMATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ModelPackage.TRANSFORMATION__IN_TYPE:
			setInType((Type) newValue);
			return;
		case ModelPackage.TRANSFORMATION__OUT_TYPE:
			setOutType((Type) newValue);
			return;
		case ModelPackage.TRANSFORMATION__BODY:
			setBody((Expression) newValue);
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
		case ModelPackage.TRANSFORMATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.TRANSFORMATION__PARAMETERS:
			getParameters().clear();
			return;
		case ModelPackage.TRANSFORMATION__IN_TYPE:
			setInType(IN_TYPE_EDEFAULT);
			return;
		case ModelPackage.TRANSFORMATION__OUT_TYPE:
			setOutType(OUT_TYPE_EDEFAULT);
			return;
		case ModelPackage.TRANSFORMATION__BODY:
			setBody((Expression) null);
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
		case ModelPackage.TRANSFORMATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.TRANSFORMATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case ModelPackage.TRANSFORMATION__IN_TYPE:
			return inType != IN_TYPE_EDEFAULT;
		case ModelPackage.TRANSFORMATION__OUT_TYPE:
			return outType != OUT_TYPE_EDEFAULT;
		case ModelPackage.TRANSFORMATION__BODY:
			return body != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", inType: ");
		result.append(inType);
		result.append(", outType: ");
		result.append(outType);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
