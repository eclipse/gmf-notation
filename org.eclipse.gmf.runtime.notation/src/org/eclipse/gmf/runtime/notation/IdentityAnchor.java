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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Identity
 * Anchor</b></em>'.
 * <p>
 * The identity anchor is an anchor constraint which has a unique string id
 * within its defining view
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId
 * <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface IdentityAnchor extends Anchor {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. The default value is
	 * <code>"anchor"</code>. <!-- begin-user-doc -->
	 * <p>
	 * The id is user-define
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor_Id()
	 * @model default="anchor"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * The id is user-define
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentityAnchor
