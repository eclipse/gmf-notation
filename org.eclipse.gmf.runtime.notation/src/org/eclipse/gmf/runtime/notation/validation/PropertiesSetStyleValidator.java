/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertiesSetStyleValidator.java,v 1.1 2007/05/17 16:26:49 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.validation;

import org.eclipse.emf.common.util.EMap;

/**
 * A sample validator interface for {@link org.eclipse.gmf.runtime.notation.PropertiesSetStyle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertiesSetStyleValidator {
	boolean validate();

	boolean validatePropertiesMap(EMap value);
}
