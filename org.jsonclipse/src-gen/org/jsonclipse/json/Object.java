/**
 */
package org.jsonclipse.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jsonclipse.json.Object#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jsonclipse.json.JsonPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.jsonclipse.json.ObjectProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.jsonclipse.json.JsonPackage#getObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ObjectProperty> getProperties();

} // Object
