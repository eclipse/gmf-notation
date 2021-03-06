/******************************************************************************
 * Copyright (c) 2007, 2009 IBM Corporation and others.
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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Diagram
 * Link Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.DiagramLinkStyle#getDiagramLink
 * <em>Diagram Link</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagramLinkStyle()
 * @model
 * @generated
 */
public interface DiagramLinkStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Link</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Diagram Link</em>' reference.
	 * @see #setDiagramLink(Diagram)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagramLinkStyle_DiagramLink()
	 * @model
	 * @generated
	 */
	Diagram getDiagramLink();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.DiagramLinkStyle#getDiagramLink
	 * <em>Diagram Link</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Diagram Link</em>' reference.
	 * @see #getDiagramLink()
	 * @generated
	 */
	void setDiagramLink(Diagram value);

} // DiagramLinkStyle
