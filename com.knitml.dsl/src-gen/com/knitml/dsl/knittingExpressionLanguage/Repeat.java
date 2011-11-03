/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Repeat#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Repeat#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends InlineOperation
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link com.knitml.dsl.knittingExpressionLanguage.InlineOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeat_Operations()
   * @model containment="true"
   * @generated
   */
  EList<InlineOperation> getOperations();

  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(RepeatSpec)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeat_Spec()
   * @model containment="true"
   * @generated
   */
  RepeatSpec getSpec();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Repeat#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(RepeatSpec value);

} // Repeat
