/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isTogether <em>Together</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isThroughTrailingLoop <em>Through Trailing Loop</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getYarnRef <em>Yarn Ref</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit()
 * @model
 * @generated
 */
public interface Knit extends InlineOperation
{
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
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit_Number()
   * @model
   * @generated
   */
  Integer getNumber();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(Integer value);

  /**
   * Returns the value of the '<em><b>Together</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Together</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Together</em>' attribute.
   * @see #setTogether(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit_Together()
   * @model
   * @generated
   */
  boolean isTogether();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isTogether <em>Together</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Together</em>' attribute.
   * @see #isTogether()
   * @generated
   */
  void setTogether(boolean value);

  /**
   * Returns the value of the '<em><b>Through Trailing Loop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Through Trailing Loop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Through Trailing Loop</em>' attribute.
   * @see #setThroughTrailingLoop(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit_ThroughTrailingLoop()
   * @model
   * @generated
   */
  boolean isThroughTrailingLoop();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isThroughTrailingLoop <em>Through Trailing Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Through Trailing Loop</em>' attribute.
   * @see #isThroughTrailingLoop()
   * @generated
   */
  void setThroughTrailingLoop(boolean value);

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
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit_YarnRef()
   * @model
   * @generated
   */
  String getYarnRef();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getYarnRef <em>Yarn Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yarn Ref</em>' attribute.
   * @see #getYarnRef()
   * @generated
   */
  void setYarnRef(String value);

  /**
   * Returns the value of the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat</em>' containment reference.
   * @see #setRepeat(RepeatSpec)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getKnit_Repeat()
   * @model containment="true"
   * @generated
   */
  RepeatSpec getRepeat();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getRepeat <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat</em>' containment reference.
   * @see #getRepeat()
   * @generated
   */
  void setRepeat(RepeatSpec value);

} // Knit
