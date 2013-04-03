/**
 */
package org.jsonclipse.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jsonclipse.json.Value#getObjectValue <em>Object Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.Value#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.Value#getNumberValue <em>Number Value</em>}</li>
 *   <li>{@link org.jsonclipse.json.Value#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jsonclipse.json.JsonPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Value</em>' containment reference.
   * @see #setObjectValue(org.jsonclipse.json.Object)
   * @see org.jsonclipse.json.JsonPackage#getValue_ObjectValue()
   * @model containment="true"
   * @generated
   */
  org.jsonclipse.json.Object getObjectValue();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.Value#getObjectValue <em>Object Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Value</em>' containment reference.
   * @see #getObjectValue()
   * @generated
   */
  void setObjectValue(org.jsonclipse.json.Object value);

  /**
   * Returns the value of the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Value</em>' containment reference.
   * @see #setArrayValue(Array)
   * @see org.jsonclipse.json.JsonPackage#getValue_ArrayValue()
   * @model containment="true"
   * @generated
   */
  Array getArrayValue();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.Value#getArrayValue <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Value</em>' containment reference.
   * @see #getArrayValue()
   * @generated
   */
  void setArrayValue(Array value);

  /**
   * Returns the value of the '<em><b>Number Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Value</em>' attribute.
   * @see #setNumberValue(String)
   * @see org.jsonclipse.json.JsonPackage#getValue_NumberValue()
   * @model
   * @generated
   */
  String getNumberValue();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.Value#getNumberValue <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Value</em>' attribute.
   * @see #getNumberValue()
   * @generated
   */
  void setNumberValue(String value);

  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see org.jsonclipse.json.JsonPackage#getValue_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.Value#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

} // Value
