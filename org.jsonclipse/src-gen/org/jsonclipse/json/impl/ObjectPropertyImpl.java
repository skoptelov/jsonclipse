/**
 */
package org.jsonclipse.json.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jsonclipse.json.JsonPackage;
import org.jsonclipse.json.ObjectProperty;
import org.jsonclipse.json.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jsonclipse.json.impl.ObjectPropertyImpl#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link org.jsonclipse.json.impl.ObjectPropertyImpl#getPropValue <em>Prop Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends MinimalEObjectImpl.Container implements ObjectProperty
{
  /**
   * The default value of the '{@link #getPropName() <em>Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropName()
   * @generated
   * @ordered
   */
  protected static final String PROP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropName() <em>Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropName()
   * @generated
   * @ordered
   */
  protected String propName = PROP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropValue() <em>Prop Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropValue()
   * @generated
   * @ordered
   */
  protected Value propValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JsonPackage.Literals.OBJECT_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropName()
  {
    return propName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropName(String newPropName)
  {
    String oldPropName = propName;
    propName = newPropName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.OBJECT_PROPERTY__PROP_NAME, oldPropName, propName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getPropValue()
  {
    return propValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropValue(Value newPropValue, NotificationChain msgs)
  {
    Value oldPropValue = propValue;
    propValue = newPropValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.OBJECT_PROPERTY__PROP_VALUE, oldPropValue, newPropValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropValue(Value newPropValue)
  {
    if (newPropValue != propValue)
    {
      NotificationChain msgs = null;
      if (propValue != null)
        msgs = ((InternalEObject)propValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.OBJECT_PROPERTY__PROP_VALUE, null, msgs);
      if (newPropValue != null)
        msgs = ((InternalEObject)newPropValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.OBJECT_PROPERTY__PROP_VALUE, null, msgs);
      msgs = basicSetPropValue(newPropValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.OBJECT_PROPERTY__PROP_VALUE, newPropValue, newPropValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JsonPackage.OBJECT_PROPERTY__PROP_VALUE:
        return basicSetPropValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JsonPackage.OBJECT_PROPERTY__PROP_NAME:
        return getPropName();
      case JsonPackage.OBJECT_PROPERTY__PROP_VALUE:
        return getPropValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonPackage.OBJECT_PROPERTY__PROP_NAME:
        setPropName((String)newValue);
        return;
      case JsonPackage.OBJECT_PROPERTY__PROP_VALUE:
        setPropValue((Value)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JsonPackage.OBJECT_PROPERTY__PROP_NAME:
        setPropName(PROP_NAME_EDEFAULT);
        return;
      case JsonPackage.OBJECT_PROPERTY__PROP_VALUE:
        setPropValue((Value)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JsonPackage.OBJECT_PROPERTY__PROP_NAME:
        return PROP_NAME_EDEFAULT == null ? propName != null : !PROP_NAME_EDEFAULT.equals(propName);
      case JsonPackage.OBJECT_PROPERTY__PROP_VALUE:
        return propValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (propName: ");
    result.append(propName);
    result.append(')');
    return result.toString();
  }

} //ObjectPropertyImpl
