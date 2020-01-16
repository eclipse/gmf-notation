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

package org.eclipse.gmf.runtime.notation.stylepooling;

import java.util.HashMap;

/**
 * The container type used by the cached styles as part of the style caching
 * performance tuning optimization. Consider having a threshold and when we
 * reach a threshold we could remove infrequently accessed styles, by ovveriding
 * get to increment a cache hit cnt when get succeeds.
 * 
 * Remember if we are to use a weakHash the key is weak not the value.
 * 
 * @author affrantz@us.ibm.com
 *
 */
public class StylePoolContainer extends HashMap {

	private static final long serialVersionUID = 1L;

	public StylePoolContainer() {
		super();
	}

	/**
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public Object put(Object key, Object value) {
		return super.put(key, value);
	}
}
