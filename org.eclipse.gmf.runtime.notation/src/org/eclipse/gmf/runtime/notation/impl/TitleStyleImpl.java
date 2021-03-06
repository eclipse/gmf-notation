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

package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.TitleStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Title
 * Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.TitleStyleImpl#isShowTitle
 * <em>Show Title</em>}</li>
 * </ul>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class TitleStyleImpl extends MinimalEObjectImpl.Container implements TitleStyle {

	/**
	 * int field to store booleans and enums
	 * 
	 * @since 1.2
	 */
	protected int eFlags;

	/**
	 * The default value of the '{@link #isShowTitle() <em>Show Title</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TITLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isShowTitle() <em>Show
	 * Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOW_TITLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TitleStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.TITLE_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isShowTitle() {
		return (eFlags & SHOW_TITLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setShowTitle(boolean newShowTitle) {
		boolean oldShowTitle = (eFlags & SHOW_TITLE_EFLAG) != 0;
		if (newShowTitle)
			eFlags |= SHOW_TITLE_EFLAG;
		else
			eFlags &= ~SHOW_TITLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TITLE_STYLE__SHOW_TITLE, oldShowTitle,
					newShowTitle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.TITLE_STYLE__SHOW_TITLE:
			return isShowTitle() ? Boolean.TRUE : Boolean.FALSE;
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
		case NotationPackage.TITLE_STYLE__SHOW_TITLE:
			setShowTitle(((Boolean) newValue).booleanValue());
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
		case NotationPackage.TITLE_STYLE__SHOW_TITLE:
			setShowTitle(SHOW_TITLE_EDEFAULT);
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
		case NotationPackage.TITLE_STYLE__SHOW_TITLE:
			return ((eFlags & SHOW_TITLE_EFLAG) != 0) != SHOW_TITLE_EDEFAULT;
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
		result.append(" (showTitle: "); //$NON-NLS-1$
		result.append((eFlags & SHOW_TITLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} // TitleStyleImpl
