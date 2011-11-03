/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#isNextRow <em>Next Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#isShortRow <em>Short Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#isLongRow <em>Long Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getLabel <em>Label</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getRange <em>Range</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSubsequent <em>Subsequent</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSide <em>Side</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getYarnRef <em>Yarn Ref</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#isInform <em>Inform</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#isReset <em>Reset</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Row#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow()
 * @model
 * @generated
 */
public interface Row extends BlockOperation
{
  /**
   * Returns the value of the '<em><b>Next Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Row</em>' attribute.
   * @see #setNextRow(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_NextRow()
   * @model
   * @generated
   */
  boolean isNextRow();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isNextRow <em>Next Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Row</em>' attribute.
   * @see #isNextRow()
   * @generated
   */
  void setNextRow(boolean value);

  /**
   * Returns the value of the '<em><b>Short Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Row</em>' attribute.
   * @see #setShortRow(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_ShortRow()
   * @model
   * @generated
   */
  boolean isShortRow();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isShortRow <em>Short Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Row</em>' attribute.
   * @see #isShortRow()
   * @generated
   */
  void setShortRow(boolean value);

  /**
   * Returns the value of the '<em><b>Long Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Row</em>' attribute.
   * @see #setLongRow(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_LongRow()
   * @model
   * @generated
   */
  boolean isLongRow();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isLongRow <em>Long Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Row</em>' attribute.
   * @see #isLongRow()
   * @generated
   */
  void setLongRow(boolean value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute list.
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Number()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNumber();

  /**
   * Returns the value of the '<em><b>Subsequent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsequent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsequent</em>' attribute.
   * @see #setSubsequent(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Subsequent()
   * @model
   * @generated
   */
  String getSubsequent();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSubsequent <em>Subsequent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subsequent</em>' attribute.
   * @see #getSubsequent()
   * @generated
   */
  void setSubsequent(String value);

  /**
   * Returns the value of the '<em><b>Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Side</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Side</em>' attribute.
   * @see #setSide(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Side()
   * @model
   * @generated
   */
  String getSide();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSide <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Side</em>' attribute.
   * @see #getSide()
   * @generated
   */
  void setSide(String value);

  /**
   * Returns the value of the '<em><b>Yarn Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yarn Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yarn Ref</em>' attribute.
   * @see #setYarnRef(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_YarnRef()
   * @model
   * @generated
   */
  String getYarnRef();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getYarnRef <em>Yarn Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yarn Ref</em>' attribute.
   * @see #getYarnRef()
   * @generated
   */
  void setYarnRef(String value);

  /**
   * Returns the value of the '<em><b>Inform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inform</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inform</em>' attribute.
   * @see #setInform(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Inform()
   * @model
   * @generated
   */
  boolean isInform();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isInform <em>Inform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inform</em>' attribute.
   * @see #isInform()
   * @generated
   */
  void setInform(boolean value);

  /**
   * Returns the value of the '<em><b>Reset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset</em>' attribute.
   * @see #setReset(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Reset()
   * @model
   * @generated
   */
  boolean isReset();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isReset <em>Reset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reset</em>' attribute.
   * @see #isReset()
   * @generated
   */
  void setReset(boolean value);

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
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRow_Operations()
   * @model containment="true"
   * @generated
   */
  EList<InlineOperation> getOperations();

} // Row
