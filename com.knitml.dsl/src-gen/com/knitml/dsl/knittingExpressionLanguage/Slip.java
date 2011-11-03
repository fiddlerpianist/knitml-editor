/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isReverse <em>Reverse</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isKnitwise <em>Knitwise</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isPurlwise <em>Purlwise</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getYarnPosition <em>Yarn Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip()
 * @model
 * @generated
 */
public interface Slip extends InlineOperation
{
  /**
   * Returns the value of the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse</em>' attribute.
   * @see #setReverse(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip_Reverse()
   * @model
   * @generated
   */
  boolean isReverse();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isReverse <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse</em>' attribute.
   * @see #isReverse()
   * @generated
   */
  void setReverse(boolean value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(Integer)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip_Number()
   * @model
   * @generated
   */
  Integer getNumber();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(Integer value);

  /**
   * Returns the value of the '<em><b>Knitwise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knitwise</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knitwise</em>' attribute.
   * @see #setKnitwise(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip_Knitwise()
   * @model
   * @generated
   */
  boolean isKnitwise();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isKnitwise <em>Knitwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knitwise</em>' attribute.
   * @see #isKnitwise()
   * @generated
   */
  void setKnitwise(boolean value);

  /**
   * Returns the value of the '<em><b>Purlwise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Purlwise</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Purlwise</em>' attribute.
   * @see #setPurlwise(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip_Purlwise()
   * @model
   * @generated
   */
  boolean isPurlwise();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isPurlwise <em>Purlwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Purlwise</em>' attribute.
   * @see #isPurlwise()
   * @generated
   */
  void setPurlwise(boolean value);

  /**
   * Returns the value of the '<em><b>Yarn Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yarn Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yarn Position</em>' attribute.
   * @see #setYarnPosition(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getSlip_YarnPosition()
   * @model
   * @generated
   */
  String getYarnPosition();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getYarnPosition <em>Yarn Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yarn Position</em>' attribute.
   * @see #getYarnPosition()
   * @generated
   */
  void setYarnPosition(String value);

} // Slip
