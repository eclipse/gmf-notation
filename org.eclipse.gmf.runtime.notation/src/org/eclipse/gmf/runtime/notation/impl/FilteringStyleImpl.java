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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Filtering Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFiltering
 * <em>Filtering</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteringKeys
 * <em>Filtering Keys</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteredObjects
 * <em>Filtered Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class FilteringStyleImpl extends MinimalEObjectImpl.Container implements FilteringStyle {

	/**
	 * int field to store booleans and enums
	 * 
	 * @since 1.2
	 */
	protected int eFlags = 0;

	/**
	 * The default value of the '{@link #getFiltering() <em>Filtering</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Filtering FILTERING_EDEFAULT = Filtering.NONE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getFiltering()
	 * <em>Filtering</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG_OFFSET = 8;

	/**
	 * The flags representing the default value of the '{@link #getFiltering()
	 * <em>Filtering</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG_DEFAULT = Filtering.VALUES
			.indexOf(FILTERING_EDEFAULT) << FILTERING_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link Filtering Filtering}' <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private static final Filtering[] FILTERING_EFLAG_VALUES = (Filtering[]) Filtering.VALUES
			.toArray(new Filtering[Filtering.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getFiltering()
	 * <em>Filtering</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG = 0x3 << FILTERING_EFLAG_OFFSET;

	/**
	 * The default value of the '{@link #getFilteringKeys() <em>Filtering
	 * Keys</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilteringKeys()
	 * @generated NOT
	 * @ordered
	 */
	protected static final List FILTERING_KEYS_EDEFAULT = Collections.EMPTY_LIST;

	/**
	 * The cached value of the '{@link #getFilteringKeys() <em>Filtering Keys</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilteringKeys()
	 * @generated
	 * @ordered
	 */
	protected List filteringKeys = FILTERING_KEYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilteredObjects() <em>Filtered
	 * Objects</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilteredObjects()
	 * @generated
	 * @ordered
	 */
	protected EList filteredObjects;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FilteringStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FILTERING_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Filtering getFiltering() {
		return FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFiltering(Filtering newFiltering) {
		Filtering oldFiltering = FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET];
		if (newFiltering == null)
			newFiltering = FILTERING_EDEFAULT;
		eFlags = eFlags & ~FILTERING_EFLAG | Filtering.VALUES.indexOf(newFiltering) << FILTERING_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILTERING_STYLE__FILTERING,
					oldFiltering, newFiltering));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public List getFilteringKeys() {
		return Collections.unmodifiableList(getFilteringKeysGen());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List getFilteringKeysGen() {
		return filteringKeys;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setFilteringKeys(List newFilteringKeys) {
		if (newFilteringKeys == null)
			throw new NullPointerException("the 'newFilteringKeys' parameter is null"); //$NON-NLS-1$

		if (newFilteringKeys.isEmpty())
			setFilteringKeysGen(FILTERING_KEYS_EDEFAULT);
		else {
			List tempList = new ArrayList(newFilteringKeys.size());
			for (Iterator i = newFilteringKeys.iterator(); i.hasNext();) {
				Object key = i.next();
				if (!(key instanceof String))
					throw new IllegalArgumentException(
							"One or more objects in the list is not of type java.lang.String"); //$NON-NLS-1$
				tempList.add(key);
			}
			setFilteringKeysGen(tempList);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFilteringKeysGen(List newFilteringKeys) {
		List oldFilteringKeys = filteringKeys;
		filteringKeys = newFilteringKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILTERING_STYLE__FILTERING_KEYS,
					oldFilteringKeys, filteringKeys));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getFilteredObjects() {
		if (filteredObjects == null) {
			filteredObjects = new EObjectResolvingEList(EObject.class, this,
					NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS);
		}
		return filteredObjects;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.FILTERING_STYLE__FILTERING:
			return getFiltering();
		case NotationPackage.FILTERING_STYLE__FILTERING_KEYS:
			return getFilteringKeys();
		case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS:
			return getFilteredObjects();
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
		case NotationPackage.FILTERING_STYLE__FILTERING:
			setFiltering((Filtering) newValue);
			return;
		case NotationPackage.FILTERING_STYLE__FILTERING_KEYS:
			setFilteringKeys((List) newValue);
			return;
		case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS:
			getFilteredObjects().clear();
			getFilteredObjects().addAll((Collection) newValue);
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
		case NotationPackage.FILTERING_STYLE__FILTERING:
			setFiltering(FILTERING_EDEFAULT);
			return;
		case NotationPackage.FILTERING_STYLE__FILTERING_KEYS:
			setFilteringKeys(FILTERING_KEYS_EDEFAULT);
			return;
		case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS:
			getFilteredObjects().clear();
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
		case NotationPackage.FILTERING_STYLE__FILTERING:
			return (eFlags & FILTERING_EFLAG) != FILTERING_EFLAG_DEFAULT;
		case NotationPackage.FILTERING_STYLE__FILTERING_KEYS:
			return FILTERING_KEYS_EDEFAULT == null ? filteringKeys != null
					: !FILTERING_KEYS_EDEFAULT.equals(filteringKeys);
		case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS:
			return filteredObjects != null && !filteredObjects.isEmpty();
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
		result.append(" (filtering: "); //$NON-NLS-1$
		result.append(FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET]);
		result.append(", filteringKeys: "); //$NON-NLS-1$
		result.append(filteringKeys);
		result.append(')');
		return result.toString();
	}

} // FilteringStyleImpl
