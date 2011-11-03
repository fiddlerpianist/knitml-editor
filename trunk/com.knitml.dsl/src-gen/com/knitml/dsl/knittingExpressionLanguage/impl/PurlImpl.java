/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Purl;
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl#isTogether <em>Together</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl#isThroughTrailingLoop <em>Through Trailing Loop</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl#getYarnRef <em>Yarn Ref</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurlImpl extends InlineOperationImpl implements Purl
{
  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final Integer NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected Integer number = NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #isTogether() <em>Together</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTogether()
   * @generated
   * @ordered
   */
  protected static final boolean TOGETHER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTogether() <em>Together</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTogether()
   * @generated
   * @ordered
   */
  protected boolean together = TOGETHER_EDEFAULT;

  /**
   * The default value of the '{@link #isThroughTrailingLoop() <em>Through Trailing Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isThroughTrailingLoop()
   * @generated
   * @ordered
   */
  protected static final boolean THROUGH_TRAILING_LOOP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isThroughTrailingLoop() <em>Through Trailing Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isThroughTrailingLoop()
   * @generated
   * @ordered
   */
  protected boolean throughTrailingLoop = THROUGH_TRAILING_LOOP_EDEFAULT;

  /**
   * The default value of the '{@link #getYarnRef() <em>Yarn Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYarnRef()
   * @generated
   * @ordered
   */
  protected static final String YARN_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYarnRef() <em>Yarn Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYarnRef()
   * @generated
   * @ordered
   */
  protected String yarnRef = YARN_REF_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat()
   * @generated
   * @ordered
   */
  protected RepeatSpec repeat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PurlImpl()
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
    return KnittingExpressionLanguagePackage.Literals.PURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(Integer newNumber)
  {
    Integer oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTogether()
  {
    return together;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTogether(boolean newTogether)
  {
    boolean oldTogether = together;
    together = newTogether;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__TOGETHER, oldTogether, together));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isThroughTrailingLoop()
  {
    return throughTrailingLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThroughTrailingLoop(boolean newThroughTrailingLoop)
  {
    boolean oldThroughTrailingLoop = throughTrailingLoop;
    throughTrailingLoop = newThroughTrailingLoop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__THROUGH_TRAILING_LOOP, oldThroughTrailingLoop, throughTrailingLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYarnRef()
  {
    return yarnRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYarnRef(String newYarnRef)
  {
    String oldYarnRef = yarnRef;
    yarnRef = newYarnRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__YARN_REF, oldYarnRef, yarnRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatSpec getRepeat()
  {
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeat(RepeatSpec newRepeat, NotificationChain msgs)
  {
    RepeatSpec oldRepeat = repeat;
    repeat = newRepeat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__REPEAT, oldRepeat, newRepeat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeat(RepeatSpec newRepeat)
  {
    if (newRepeat != repeat)
    {
      NotificationChain msgs = null;
      if (repeat != null)
        msgs = ((InternalEObject)repeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KnittingExpressionLanguagePackage.PURL__REPEAT, null, msgs);
      if (newRepeat != null)
        msgs = ((InternalEObject)newRepeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KnittingExpressionLanguagePackage.PURL__REPEAT, null, msgs);
      msgs = basicSetRepeat(newRepeat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.PURL__REPEAT, newRepeat, newRepeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.PURL__REPEAT:
        return basicSetRepeat(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KnittingExpressionLanguagePackage.PURL__NUMBER:
        return getNumber();
      case KnittingExpressionLanguagePackage.PURL__TOGETHER:
        return isTogether();
      case KnittingExpressionLanguagePackage.PURL__THROUGH_TRAILING_LOOP:
        return isThroughTrailingLoop();
      case KnittingExpressionLanguagePackage.PURL__YARN_REF:
        return getYarnRef();
      case KnittingExpressionLanguagePackage.PURL__REPEAT:
        return getRepeat();
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
      case KnittingExpressionLanguagePackage.PURL__NUMBER:
        setNumber((Integer)newValue);
        return;
      case KnittingExpressionLanguagePackage.PURL__TOGETHER:
        setTogether((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.PURL__THROUGH_TRAILING_LOOP:
        setThroughTrailingLoop((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.PURL__YARN_REF:
        setYarnRef((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.PURL__REPEAT:
        setRepeat((RepeatSpec)newValue);
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
      case KnittingExpressionLanguagePackage.PURL__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.PURL__TOGETHER:
        setTogether(TOGETHER_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.PURL__THROUGH_TRAILING_LOOP:
        setThroughTrailingLoop(THROUGH_TRAILING_LOOP_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.PURL__YARN_REF:
        setYarnRef(YARN_REF_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.PURL__REPEAT:
        setRepeat((RepeatSpec)null);
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
      case KnittingExpressionLanguagePackage.PURL__NUMBER:
        return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
      case KnittingExpressionLanguagePackage.PURL__TOGETHER:
        return together != TOGETHER_EDEFAULT;
      case KnittingExpressionLanguagePackage.PURL__THROUGH_TRAILING_LOOP:
        return throughTrailingLoop != THROUGH_TRAILING_LOOP_EDEFAULT;
      case KnittingExpressionLanguagePackage.PURL__YARN_REF:
        return YARN_REF_EDEFAULT == null ? yarnRef != null : !YARN_REF_EDEFAULT.equals(yarnRef);
      case KnittingExpressionLanguagePackage.PURL__REPEAT:
        return repeat != null;
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
    result.append(" (number: ");
    result.append(number);
    result.append(", together: ");
    result.append(together);
    result.append(", throughTrailingLoop: ");
    result.append(throughTrailingLoop);
    result.append(", yarnRef: ");
    result.append(yarnRef);
    result.append(')');
    return result.toString();
  }

} //PurlImpl
