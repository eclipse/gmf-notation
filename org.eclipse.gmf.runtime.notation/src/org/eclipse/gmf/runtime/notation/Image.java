/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Image</b></em>'.
 * <p>
 * An image is representing a serialization of an image file
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.Image#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImage()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Image extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * The data is a blop representing the image data. The returned
	 * <code>byte[]</code> is not expected to be changed. If a change is requried,
	 * it has to be through the <code>setData()</code> API
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImage_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Image#getData
	 * <em>Data</em>}' attribute. <!-- begin-user-doc -->
	 * <p>
	 * The data is a blop representing the image data.
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

} // Image
