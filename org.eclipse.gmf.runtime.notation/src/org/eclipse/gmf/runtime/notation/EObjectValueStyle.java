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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EObject
 * Value Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.EObjectValueStyle#getEObjectValue
 * <em>EObject Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectValueStyle()
 * @model
 * @generated
 */
public interface EObjectValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>EObject Value</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject Value</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>EObject Value</em>' reference.
	 * @see #setEObjectValue(EObject)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectValueStyle_EObjectValue()
	 * @model
	 * @generated
	 */
	EObject getEObjectValue();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.EObjectValueStyle#getEObjectValue
	 * <em>EObject Value</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>EObject Value</em>' reference.
	 * @see #getEObjectValue()
	 * @generated
	 */
	void setEObjectValue(EObject value);

} // EObjectValueStyle
