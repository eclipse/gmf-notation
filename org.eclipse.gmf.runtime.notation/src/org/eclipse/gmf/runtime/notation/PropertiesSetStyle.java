/******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Properties Set Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.PropertiesSetStyle#getPropertiesMap
 * <em>Properties Map</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPropertiesSetStyle()
 * @model
 * @generated
 */
public interface PropertiesSetStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Properties Map</b></em>' map. The key is of
	 * type {@link java.lang.String}, and the value is of type
	 * {@link org.eclipse.gmf.runtime.notation.PropertyValue}, <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Properties Map</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties Map</em>' map.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPropertiesSetStyle_PropertiesMap()
	 * @model mapType="org.eclipse.gmf.runtime.notation.StringToPropertyValueMapEntry"
	 *        keyType="java.lang.String"
	 *        valueType="org.eclipse.gmf.runtime.notation.PropertyValue"
	 * @generated
	 */
	EMap getPropertiesMap();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Object getProperty(String propertyName);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean setProperty(String propertyName, Object newValue);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean createProperty(String propertyName, EDataType instanceType, Object initialValue);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean removeProperty(String propertyName);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean hasProperty(String propertyName);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean createProperty(String propertyName, String initialValue);

} // PropertiesSetStyle
