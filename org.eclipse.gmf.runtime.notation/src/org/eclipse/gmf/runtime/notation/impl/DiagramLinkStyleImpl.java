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
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Diagram
 * Link Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramLinkStyleImpl#getDiagramLink
 * <em>Diagram Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramLinkStyleImpl extends MinimalEObjectImpl.Container implements DiagramLinkStyle {
	/**
	 * The cached value of the '{@link #getDiagramLink() <em>Diagram Link</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiagramLink()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagramLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagramLinkStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM_LINK_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Diagram getDiagramLink() {
		if (diagramLink != null && diagramLink.eIsProxy()) {
			InternalEObject oldDiagramLink = (InternalEObject) diagramLink;
			diagramLink = (Diagram) eResolveProxy(oldDiagramLink);
			if (diagramLink != oldDiagramLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK, oldDiagramLink, diagramLink));
			}
		}
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Diagram basicGetDiagramLink() {
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDiagramLink(Diagram newDiagramLink) {
		Diagram oldDiagramLink = diagramLink;
		diagramLink = newDiagramLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK,
					oldDiagramLink, diagramLink));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
			if (resolve)
				return getDiagramLink();
			return basicGetDiagramLink();
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
		case NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
			setDiagramLink((Diagram) newValue);
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
		case NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
			setDiagramLink((Diagram) null);
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
		case NotationPackage.DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
			return diagramLink != null;
		}
		return eDynamicIsSet(featureID);
	}

} // DiagramLinkStyleImpl
