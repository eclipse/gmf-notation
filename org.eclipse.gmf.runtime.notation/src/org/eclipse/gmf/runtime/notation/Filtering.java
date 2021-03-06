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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Filtering</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFiltering()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public final class Filtering extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #NONE_LITERAL
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Manual</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #MANUAL_LITERAL
	 * @model name="Manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL = 1;

	/**
	 * The '<em><b>Automatic</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #AUTOMATIC_LITERAL
	 * @model name="Automatic"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC = 2;

	/**
	 * The '<em><b>None</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final Filtering NONE_LITERAL = new Filtering(NONE, "None", "None"); //$NON-NLS-2$//$NON-NLS-1$

	/**
	 * The '<em><b>Manual</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #MANUAL
	 * @generated
	 * @ordered
	 */
	public static final Filtering MANUAL_LITERAL = new Filtering(MANUAL, "Manual", "Manual"); //$NON-NLS-2$//$NON-NLS-1$

	/**
	 * The '<em><b>Automatic</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #AUTOMATIC
	 * @generated
	 * @ordered
	 */
	public static final Filtering AUTOMATIC_LITERAL = new Filtering(AUTOMATIC, "Automatic", "Automatic"); //$NON-NLS-2$//$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Filtering</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Filtering[] VALUES_ARRAY = new Filtering[] { NONE_LITERAL, MANUAL_LITERAL,
			AUTOMATIC_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Filtering</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filtering</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Filtering get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Filtering result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filtering</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Filtering getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Filtering result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filtering</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Filtering get(int value) {
		switch (value) {
		case NONE:
			return NONE_LITERAL;
		case MANUAL:
			return MANUAL_LITERAL;
		case AUTOMATIC:
			return AUTOMATIC_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private Filtering(int value, String name, String literal) {
		super(value, name, literal);
	}

} // Filtering
