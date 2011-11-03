/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToEnd <em>To End</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToMarker <em>To Marker</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#getValue <em>Value</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeEnd <em>Before End</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeGap <em>Before Gap</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeMarker <em>Before Marker</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec()
 * @model
 * @generated
 */
public interface RepeatSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>To End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To End</em>' attribute.
   * @see #setToEnd(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_ToEnd()
   * @model
   * @generated
   */
  boolean isToEnd();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToEnd <em>To End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To End</em>' attribute.
   * @see #isToEnd()
   * @generated
   */
  void setToEnd(boolean value);

  /**
   * Returns the value of the '<em><b>To Marker</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Marker</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Marker</em>' attribute.
   * @see #setToMarker(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_ToMarker()
   * @model
   * @generated
   */
  boolean isToMarker();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToMarker <em>To Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Marker</em>' attribute.
   * @see #isToMarker()
   * @generated
   */
  void setToMarker(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Integer)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_Value()
   * @model
   * @generated
   */
  Integer getValue();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Integer value);

  /**
   * Returns the value of the '<em><b>Before End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before End</em>' attribute.
   * @see #setBeforeEnd(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_BeforeEnd()
   * @model
   * @generated
   */
  boolean isBeforeEnd();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeEnd <em>Before End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before End</em>' attribute.
   * @see #isBeforeEnd()
   * @generated
   */
  void setBeforeEnd(boolean value);

  /**
   * Returns the value of the '<em><b>Before Gap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before Gap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before Gap</em>' attribute.
   * @see #setBeforeGap(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_BeforeGap()
   * @model
   * @generated
   */
  boolean isBeforeGap();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeGap <em>Before Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before Gap</em>' attribute.
   * @see #isBeforeGap()
   * @generated
   */
  void setBeforeGap(boolean value);

  /**
   * Returns the value of the '<em><b>Before Marker</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before Marker</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before Marker</em>' attribute.
   * @see #setBeforeMarker(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_BeforeMarker()
   * @model
   * @generated
   */
  boolean isBeforeMarker();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeMarker <em>Before Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before Marker</em>' attribute.
   * @see #isBeforeMarker()
   * @generated
   */
  void setBeforeMarker(boolean value);

  /**
   * Returns the value of the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' attribute.
   * @see #setTimes(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getRepeatSpec_Times()
   * @model
   * @generated
   */
  boolean isTimes();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isTimes <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' attribute.
   * @see #isTimes()
   * @generated
   */
  void setTimes(boolean value);

} // RepeatSpec
