/**
 */
package org.jsonclipse.json.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jsonclipse.json.Array;
import org.jsonclipse.json.JsonPackage;
import org.jsonclipse.json.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jsonclipse.json.impl.ValueImpl#getObjectValue <em>Object Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.impl.ValueImpl#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.impl.ValueImpl#getNumberValue <em>Number Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.impl.ValueImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
  /**
   * The cached value of the '{@link #getObjectValue() <em>Object Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectValue()
   * @generated
   * @ordered
   */
  protected org.jsonclipse.json.Object objectValue;

  /**
   * The cached value of the '{@link #getArrayValue() <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayValue()
   * @generated
   * @ordered
   */
  protected Array arrayValue;

  /**
   * The default value of the '{@link #getNumberValue() <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberValue()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumberValue() <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberValue()
   * @generated
   * @ordered
   */
  protected String numberValue = NUMBER_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return JsonPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.jsonclipse.json.Object getObjectValue()
  {
    return objectValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectValue(org.jsonclipse.json.Object newObjectValue, NotificationChain msgs)
  {
    org.jsonclipse.json.Object oldObjectValue = objectValue;
    objectValue = newObjectValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__OBJECT_VALUE, oldObjectValue, newObjectValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectValue(org.jsonclipse.json.Object newObjectValue)
  {
    if (newObjectValue != objectValue)
    {
      NotificationChain msgs = null;
      if (objectValue != null)
        msgs = ((InternalEObject)objectValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.VALUE__OBJECT_VALUE, null, msgs);
      if (newObjectValue != null)
        msgs = ((InternalEObject)newObjectValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.VALUE__OBJECT_VALUE, null, msgs);
      msgs = basicSetObjectValue(newObjectValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__OBJECT_VALUE, newObjectValue, newObjectValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array getArrayValue()
  {
    return arrayValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayValue(Array newArrayValue, NotificationChain msgs)
  {
    Array oldArrayValue = arrayValue;
    arrayValue = newArrayValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__ARRAY_VALUE, oldArrayValue, newArrayValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayValue(Array newArrayValue)
  {
    if (newArrayValue != arrayValue)
    {
      NotificationChain msgs = null;
      if (arrayValue != null)
        msgs = ((InternalEObject)arrayValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.VALUE__ARRAY_VALUE, null, msgs);
      if (newArrayValue != null)
        msgs = ((InternalEObject)newArrayValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.VALUE__ARRAY_VALUE, null, msgs);
      msgs = basicSetArrayValue(newArrayValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__ARRAY_VALUE, newArrayValue, newArrayValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumberValue()
  {
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberValue(String newNumberValue)
  {
    String oldNumberValue = numberValue;
    numberValue = newNumberValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__NUMBER_VALUE, oldNumberValue, numberValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.VALUE__STRING_VALUE, oldStringValue, stringValue));
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
      case JsonPackage.VALUE__OBJECT_VALUE:
        return basicSetObjectValue(null, msgs);
      case JsonPackage.VALUE__ARRAY_VALUE:
        return basicSetArrayValue(null, msgs);
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
      case JsonPackage.VALUE__OBJECT_VALUE:
        return getObjectValue();
      case JsonPackage.VALUE__ARRAY_VALUE:
        return getArrayValue();
      case JsonPackage.VALUE__NUMBER_VALUE:
        return getNumberValue();
      case JsonPackage.VALUE__STRING_VALUE:
        return getStringValue();
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
      case JsonPackage.VALUE__OBJECT_VALUE:
        setObjectValue((org.jsonclipse.json.Object)newValue);
        return;
      case JsonPackage.VALUE__ARRAY_VALUE:
        setArrayValue((Array)newValue);
        return;
      case JsonPackage.VALUE__NUMBER_VALUE:
        setNumberValue((String)newValue);
        return;
      case JsonPackage.VALUE__STRING_VALUE:
        setStringValue((String)newValue);
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
      case JsonPackage.VALUE__OBJECT_VALUE:
        setObjectValue((org.jsonclipse.json.Object)null);
        return;
      case JsonPackage.VALUE__ARRAY_VALUE:
        setArrayValue((Array)null);
        return;
      case JsonPackage.VALUE__NUMBER_VALUE:
        setNumberValue(NUMBER_VALUE_EDEFAULT);
        return;
      case JsonPackage.VALUE__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
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
      case JsonPackage.VALUE__OBJECT_VALUE:
        return objectValue != null;
      case JsonPackage.VALUE__ARRAY_VALUE:
        return arrayValue != null;
      case JsonPackage.VALUE__NUMBER_VALUE:
        return NUMBER_VALUE_EDEFAULT == null ? numberValue != null : !NUMBER_VALUE_EDEFAULT.equals(numberValue);
      case JsonPackage.VALUE__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
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
    result.append(" (numberValue: ");
    result.append(numberValue);
    result.append(", stringValue: ");
    result.append(stringValue);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
