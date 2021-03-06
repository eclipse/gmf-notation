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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>List
 * Value Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.ListValueStyle#getRawValuesList
 * <em>Raw Values List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getListValueStyle()
 * @model
 * @generated
 */
public interface ListValueStyle extends DataTypeStyle {
	/**
	 * Returns the value of the '<em><b>Raw Values List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Raw Values List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Raw Values List</em>' attribute list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getListValueStyle_RawValuesList()
	 * @model unique="false"
	 * @generated
	 */
	EList getRawValuesList();

} // ListValueStyle
