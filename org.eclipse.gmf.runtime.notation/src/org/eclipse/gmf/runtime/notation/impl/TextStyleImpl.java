/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.TextAlignment;
import org.eclipse.gmf.runtime.notation.TextStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text
 * Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.TextStyleImpl#getTextAlignment
 * <em>Text Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextStyleImpl extends MinimalEObjectImpl.Container implements TextStyle {

	/**
	 * int field to store booleans and enums
	 * 
	 * @since 1.2
	 */
	protected int eFlags = 0;

	/**
	 * The default value of the '{@link #getTextAlignment() <em>Text
	 * Alignment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlignment TEXT_ALIGNMENT_EDEFAULT = TextAlignment.LEFT_LITERAL;

	/**
	 * The offset of the flags representing the value of the
	 * '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_ALIGNMENT_EFLAG_OFFSET = 8;

	/**
	 * The flags representing the default value of the '{@link #getTextAlignment()
	 * <em>Text Alignment</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_ALIGNMENT_EFLAG_DEFAULT = TextAlignment.VALUES
			.indexOf(TEXT_ALIGNMENT_EDEFAULT) << TEXT_ALIGNMENT_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link TextAlignment Text Alignment}'
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private static final TextAlignment[] TEXT_ALIGNMENT_EFLAG_VALUES = (TextAlignment[]) TextAlignment.VALUES
			.toArray(new TextAlignment[TextAlignment.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getTextAlignment() <em>Text
	 * Alignment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_ALIGNMENT_EFLAG = 0x3 << TEXT_ALIGNMENT_EFLAG_OFFSET;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.TEXT_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TextAlignment getTextAlignment() {
		return TEXT_ALIGNMENT_EFLAG_VALUES[(eFlags & TEXT_ALIGNMENT_EFLAG) >>> TEXT_ALIGNMENT_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTextAlignment(TextAlignment newTextAlignment) {
		TextAlignment oldTextAlignment = TEXT_ALIGNMENT_EFLAG_VALUES[(eFlags
				& TEXT_ALIGNMENT_EFLAG) >>> TEXT_ALIGNMENT_EFLAG_OFFSET];
		if (newTextAlignment == null)
			newTextAlignment = TEXT_ALIGNMENT_EDEFAULT;
		eFlags = eFlags & ~TEXT_ALIGNMENT_EFLAG
				| TextAlignment.VALUES.indexOf(newTextAlignment) << TEXT_ALIGNMENT_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__TEXT_ALIGNMENT,
					oldTextAlignment, newTextAlignment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.TEXT_STYLE__TEXT_ALIGNMENT:
			return getTextAlignment();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.TEXT_STYLE__TEXT_ALIGNMENT:
			setTextAlignment((TextAlignment) newValue);
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotationPackage.TEXT_STYLE__TEXT_ALIGNMENT:
			setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
			return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.TEXT_STYLE__TEXT_ALIGNMENT:
			return (eFlags & TEXT_ALIGNMENT_EFLAG) != TEXT_ALIGNMENT_EFLAG_DEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textAlignment: "); //$NON-NLS-1$
		result.append(TEXT_ALIGNMENT_EFLAG_VALUES[(eFlags & TEXT_ALIGNMENT_EFLAG) >>> TEXT_ALIGNMENT_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
	}

} // TextStyleImpl
