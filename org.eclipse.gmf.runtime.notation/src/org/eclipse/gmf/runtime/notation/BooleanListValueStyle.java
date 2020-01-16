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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Boolean
 * List Value Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.BooleanListValueStyle#getBooleanListValue
 * <em>Boolean List Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getBooleanListValueStyle()
 * @model
 * @generated
 */
public interface BooleanListValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Boolean List Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Boolean List Value</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Boolean List Value</em>' attribute list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getBooleanListValueStyle_BooleanListValue()
	 * @model unique="false"
	 * @generated
	 */
	EList getBooleanListValue();

} // BooleanListValueStyle
