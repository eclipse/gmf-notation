/**
 * <copyright>
 * </copyright>
 *
 * $Id: DobleValueStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doble Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.DobleValueStyle#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDobleValueStyle()
 * @model
 * @generated
 */
public interface DobleValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Value</em>' attribute.
	 * @see #setDoubleValue(double)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDobleValueStyle_DoubleValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDoubleValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.DobleValueStyle#getDoubleValue <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Value</em>' attribute.
	 * @see #getDoubleValue()
	 * @generated
	 */
	void setDoubleValue(double value);

} // DobleValueStyle
