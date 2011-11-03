/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage
 * @generated
 */
public interface KnittingExpressionLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KnittingExpressionLanguageFactory eINSTANCE = com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Block Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Operation</em>'.
   * @generated
   */
  BlockOperation createBlockOperation();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row</em>'.
   * @generated
   */
  Row createRow();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Inline Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inline Operation</em>'.
   * @generated
   */
  InlineOperation createInlineOperation();

  /**
   * Returns a new object of class '<em>Knit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Knit</em>'.
   * @generated
   */
  Knit createKnit();

  /**
   * Returns a new object of class '<em>Purl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Purl</em>'.
   * @generated
   */
  Purl createPurl();

  /**
   * Returns a new object of class '<em>Slip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slip</em>'.
   * @generated
   */
  Slip createSlip();

  /**
   * Returns a new object of class '<em>Repeat Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat Spec</em>'.
   * @generated
   */
  RepeatSpec createRepeatSpec();

  /**
   * Returns a new object of class '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat</em>'.
   * @generated
   */
  Repeat createRepeat();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KnittingExpressionLanguagePackage getKnittingExpressionLanguagePackage();

} //KnittingExpressionLanguageFactory
