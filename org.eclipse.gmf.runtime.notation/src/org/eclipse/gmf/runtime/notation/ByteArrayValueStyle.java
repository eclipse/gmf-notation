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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Byte
 * Array Value Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.ByteArrayValueStyle#getByteArrayValue
 * <em>Byte Array Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getByteArrayValueStyle()
 * @model
 * @generated
 */
public interface ByteArrayValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Byte Array Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Byte Array Value</em>' attribute.
	 * @see #setByteArrayValue(byte[])
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getByteArrayValueStyle_ByteArrayValue()
	 * @model
	 * @generated
	 */
	byte[] getByteArrayValue();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.ByteArrayValueStyle#getByteArrayValue
	 * <em>Byte Array Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Byte Array Value</em>' attribute.
	 * @see #getByteArrayValue()
	 * @generated
	 */
	void setByteArrayValue(byte[] value);

} // ByteArrayValueStyle
