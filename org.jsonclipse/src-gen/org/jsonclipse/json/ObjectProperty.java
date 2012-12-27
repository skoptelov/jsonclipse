/**
 */
package org.jsonclipse.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jsonclipse.json.ObjectProperty#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link org.jsonclipse.json.ObjectProperty#getPropValue <em>Prop Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jsonclipse.json.JsonPackage#getObjectProperty()
 * @model
 * @generated
 */
public interface ObjectProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Prop Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Name</em>' attribute.
   * @see #setPropName(String)
   * @see org.jsonclipse.json.JsonPackage#getObjectProperty_PropName()
   * @model
   * @generated
   */
  String getPropName();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.ObjectProperty#getPropName <em>Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Name</em>' attribute.
   * @see #getPropName()
   * @generated
   */
  void setPropName(String value);

  /**
   * Returns the value of the '<em><b>Prop Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Value</em>' containment reference.
   * @see #setPropValue(Value)
   * @see org.jsonclipse.json.JsonPackage#getObjectProperty_PropValue()
   * @model containment="true"
   * @generated
   */
  Value getPropValue();

  /**
   * Sets the value of the '{@link org.jsonclipse.json.ObjectProperty#getPropValue <em>Prop Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Value</em>' containment reference.
   * @see #getPropValue()
   * @generated
   */
  void setPropValue(Value value);

} // ObjectProperty
