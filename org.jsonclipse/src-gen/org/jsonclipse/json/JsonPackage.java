/**
 */
package org.jsonclipse.json;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jsonclipse.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "json";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jsonclipse.org/Json";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "json";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonPackage eINSTANCE = org.jsonclipse.json.impl.JsonPackageImpl.init();

  /**
   * The meta object id for the '{@link org.jsonclipse.json.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jsonclipse.json.impl.ModelImpl
   * @see org.jsonclipse.json.impl.JsonPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOT = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jsonclipse.json.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jsonclipse.json.impl.ValueImpl
   * @see org.jsonclipse.json.impl.JsonPackageImpl#getValue()
   * @generated
   */
  int VALUE = 1;

  /**
   * The feature id for the '<em><b>Object Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__OBJECT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ARRAY_VALUE = 1;

  /**
   * The feature id for the '<em><b>Number Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NUMBER_VALUE = 2;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STRING_VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.jsonclipse.json.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jsonclipse.json.impl.ObjectImpl
   * @see org.jsonclipse.json.impl.JsonPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jsonclipse.json.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jsonclipse.json.impl.ObjectPropertyImpl
   * @see org.jsonclipse.json.impl.JsonPackageImpl#getObjectProperty()
   * @generated
   */
  int OBJECT_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Prop Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__PROP_NAME = 0;

  /**
   * The feature id for the '<em><b>Prop Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__PROP_VALUE = 1;

  /**
   * The number of structural features of the '<em>Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jsonclipse.json.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jsonclipse.json.impl.ArrayImpl
   * @see org.jsonclipse.json.impl.JsonPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.jsonclipse.json.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.jsonclipse.json.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.jsonclipse.json.Model#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.jsonclipse.json.Model#getRoot()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Root();

  /**
   * Returns the meta object for class '{@link org.jsonclipse.json.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.jsonclipse.json.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link org.jsonclipse.json.Value#getObjectValue <em>Object Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Value</em>'.
   * @see org.jsonclipse.json.Value#getObjectValue()
   * @see #getValue()
   * @generated
   */
  EReference getValue_ObjectValue();

  /**
   * Returns the meta object for the containment reference '{@link org.jsonclipse.json.Value#getArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Value</em>'.
   * @see org.jsonclipse.json.Value#getArrayValue()
   * @see #getValue()
   * @generated
   */
  EReference getValue_ArrayValue();

  /**
   * Returns the meta object for the attribute '{@link org.jsonclipse.json.Value#getNumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Value</em>'.
   * @see org.jsonclipse.json.Value#getNumberValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_NumberValue();

  /**
   * Returns the meta object for the attribute '{@link org.jsonclipse.json.Value#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see org.jsonclipse.json.Value#getStringValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_StringValue();

  /**
   * Returns the meta object for class '{@link org.jsonclipse.json.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.jsonclipse.json.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link org.jsonclipse.json.Object#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.jsonclipse.json.Object#getProperties()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Properties();

  /**
   * Returns the meta object for class '{@link org.jsonclipse.json.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see org.jsonclipse.json.ObjectProperty
   * @generated
   */
  EClass getObjectProperty();

  /**
   * Returns the meta object for the attribute '{@link org.jsonclipse.json.ObjectProperty#getPropName <em>Prop Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop Name</em>'.
   * @see org.jsonclipse.json.ObjectProperty#getPropName()
   * @see #getObjectProperty()
   * @generated
   */
  EAttribute getObjectProperty_PropName();

  /**
   * Returns the meta object for the containment reference '{@link org.jsonclipse.json.ObjectProperty#getPropValue <em>Prop Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Value</em>'.
   * @see org.jsonclipse.json.ObjectProperty#getPropValue()
   * @see #getObjectProperty()
   * @generated
   */
  EReference getObjectProperty_PropValue();

  /**
   * Returns the meta object for class '{@link org.jsonclipse.json.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see org.jsonclipse.json.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference list '{@link org.jsonclipse.json.Array#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.jsonclipse.json.Array#getElements()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonFactory getJsonFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.jsonclipse.json.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jsonclipse.json.impl.ModelImpl
     * @see org.jsonclipse.json.impl.JsonPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOT = eINSTANCE.getModel_Root();

    /**
     * The meta object literal for the '{@link org.jsonclipse.json.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jsonclipse.json.impl.ValueImpl
     * @see org.jsonclipse.json.impl.JsonPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Object Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__OBJECT_VALUE = eINSTANCE.getValue_ObjectValue();

    /**
     * The meta object literal for the '<em><b>Array Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__ARRAY_VALUE = eINSTANCE.getValue_ArrayValue();

    /**
     * The meta object literal for the '<em><b>Number Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__NUMBER_VALUE = eINSTANCE.getValue_NumberValue();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__STRING_VALUE = eINSTANCE.getValue_StringValue();

    /**
     * The meta object literal for the '{@link org.jsonclipse.json.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jsonclipse.json.impl.ObjectImpl
     * @see org.jsonclipse.json.impl.JsonPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__PROPERTIES = eINSTANCE.getObject_Properties();

    /**
     * The meta object literal for the '{@link org.jsonclipse.json.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jsonclipse.json.impl.ObjectPropertyImpl
     * @see org.jsonclipse.json.impl.JsonPackageImpl#getObjectProperty()
     * @generated
     */
    EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

    /**
     * The meta object literal for the '<em><b>Prop Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY__PROP_NAME = eINSTANCE.getObjectProperty_PropName();

    /**
     * The meta object literal for the '<em><b>Prop Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY__PROP_VALUE = eINSTANCE.getObjectProperty_PropValue();

    /**
     * The meta object literal for the '{@link org.jsonclipse.json.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jsonclipse.json.impl.ArrayImpl
     * @see org.jsonclipse.json.impl.JsonPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__ELEMENTS = eINSTANCE.getArray_Elements();

  }

} //JsonPackage
