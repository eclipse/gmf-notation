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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hinted
 * Diagram Link Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle#getHint
 * <em>Hint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getHintedDiagramLinkStyle()
 * @model
 * @generated
 */
public interface HintedDiagramLinkStyle extends DiagramLinkStyle, Style {
	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getHintedDiagramLinkStyle_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle#getHint
	 * <em>Hint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

} // HintedDiagramLinkStyle
