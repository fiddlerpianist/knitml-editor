/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isToEnd <em>To End</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isToMarker <em>To Marker</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isBeforeEnd <em>Before End</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isBeforeGap <em>Before Gap</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isBeforeMarker <em>Before Marker</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl#isTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatSpecImpl extends MinimalEObjectImpl.Container implements RepeatSpec
{
  /**
   * The default value of the '{@link #isToEnd() <em>To End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToEnd()
   * @generated
   * @ordered
   */
  protected static final boolean TO_END_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToEnd() <em>To End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToEnd()
   * @generated
   * @ordered
   */
  protected boolean toEnd = TO_END_EDEFAULT;

  /**
   * The default value of the '{@link #isToMarker() <em>To Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToMarker()
   * @generated
   * @ordered
   */
  protected static final boolean TO_MARKER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToMarker() <em>To Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToMarker()
   * @generated
   * @ordered
   */
  protected boolean toMarker = TO_MARKER_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final Integer VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Integer value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isBeforeEnd() <em>Before End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeEnd()
   * @generated
   * @ordered
   */
  protected static final boolean BEFORE_END_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeforeEnd() <em>Before End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeEnd()
   * @generated
   * @ordered
   */
  protected boolean beforeEnd = BEFORE_END_EDEFAULT;

  /**
   * The default value of the '{@link #isBeforeGap() <em>Before Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeGap()
   * @generated
   * @ordered
   */
  protected static final boolean BEFORE_GAP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeforeGap() <em>Before Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeGap()
   * @generated
   * @ordered
   */
  protected boolean beforeGap = BEFORE_GAP_EDEFAULT;

  /**
   * The default value of the '{@link #isBeforeMarker() <em>Before Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeMarker()
   * @generated
   * @ordered
   */
  protected static final boolean BEFORE_MARKER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeforeMarker() <em>Before Marker</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeforeMarker()
   * @generated
   * @ordered
   */
  protected boolean beforeMarker = BEFORE_MARKER_EDEFAULT;

  /**
   * The default value of the '{@link #isTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTimes()
   * @generated
   * @ordered
   */
  protected static final boolean TIMES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTimes()
   * @generated
   * @ordered
   */
  protected boolean times = TIMES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KnittingExpressionLanguagePackage.Literals.REPEAT_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToEnd()
  {
    return toEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToEnd(boolean newToEnd)
  {
    boolean oldToEnd = toEnd;
    toEnd = newToEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_END, oldToEnd, toEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToMarker()
  {
    return toMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToMarker(boolean newToMarker)
  {
    boolean oldToMarker = toMarker;
    toMarker = newToMarker;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_MARKER, oldToMarker, toMarker));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Integer newValue)
  {
    Integer oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeforeEnd()
  {
    return beforeEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeforeEnd(boolean newBeforeEnd)
  {
    boolean oldBeforeEnd = beforeEnd;
    beforeEnd = newBeforeEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_END, oldBeforeEnd, beforeEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeforeGap()
  {
    return beforeGap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeforeGap(boolean newBeforeGap)
  {
    boolean oldBeforeGap = beforeGap;
    beforeGap = newBeforeGap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_GAP, oldBeforeGap, beforeGap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeforeMarker()
  {
    return beforeMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeforeMarker(boolean newBeforeMarker)
  {
    boolean oldBeforeMarker = beforeMarker;
    beforeMarker = newBeforeMarker;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_MARKER, oldBeforeMarker, beforeMarker));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimes(boolean newTimes)
  {
    boolean oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.REPEAT_SPEC__TIMES, oldTimes, times));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_END:
        return isToEnd();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_MARKER:
        return isToMarker();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__VALUE:
        return getValue();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_END:
        return isBeforeEnd();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_GAP:
        return isBeforeGap();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_MARKER:
        return isBeforeMarker();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TIMES:
        return isTimes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_END:
        setToEnd((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_MARKER:
        setToMarker((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__VALUE:
        setValue((Integer)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_END:
        setBeforeEnd((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_GAP:
        setBeforeGap((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_MARKER:
        setBeforeMarker((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TIMES:
        setTimes((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_END:
        setToEnd(TO_END_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_MARKER:
        setToMarker(TO_MARKER_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_END:
        setBeforeEnd(BEFORE_END_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_GAP:
        setBeforeGap(BEFORE_GAP_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_MARKER:
        setBeforeMarker(BEFORE_MARKER_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TIMES:
        setTimes(TIMES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_END:
        return toEnd != TO_END_EDEFAULT;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TO_MARKER:
        return toMarker != TO_MARKER_EDEFAULT;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_END:
        return beforeEnd != BEFORE_END_EDEFAULT;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_GAP:
        return beforeGap != BEFORE_GAP_EDEFAULT;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__BEFORE_MARKER:
        return beforeMarker != BEFORE_MARKER_EDEFAULT;
      case KnittingExpressionLanguagePackage.REPEAT_SPEC__TIMES:
        return times != TIMES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (toEnd: ");
    result.append(toEnd);
    result.append(", toMarker: ");
    result.append(toMarker);
    result.append(", value: ");
    result.append(value);
    result.append(", beforeEnd: ");
    result.append(beforeEnd);
    result.append(", beforeGap: ");
    result.append(beforeGap);
    result.append(", beforeMarker: ");
    result.append(beforeMarker);
    result.append(", times: ");
    result.append(times);
    result.append(')');
    return result.toString();
  }

} //RepeatSpecImpl
