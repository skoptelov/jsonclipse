/**
 */
package org.jsonclipse.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jsonclipse.json.Array#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jsonclipse.json.JsonPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.jsonclipse.json.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.jsonclipse.json.JsonPackage#getArray_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Value> getElements();

} // Array
