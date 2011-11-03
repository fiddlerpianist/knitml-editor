/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Pattern#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.knitml.dsl.knittingExpressionLanguage.BlockOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getPattern_Elements()
   * @model containment="true"
   * @generated
   */
  EList<BlockOperation> getElements();

} // Pattern
