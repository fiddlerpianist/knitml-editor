/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Slip;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl#isReverse <em>Reverse</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl#isKnitwise <em>Knitwise</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl#isPurlwise <em>Purlwise</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl#getYarnPosition <em>Yarn Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlipImpl extends InlineOperationImpl implements Slip
{
  /**
   * The default value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReverse()
   * @generated
   * @ordered
   */
  protected static final boolean REVERSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReverse()
   * @generated
   * @ordered
   */
  protected boolean reverse = REVERSE_EDEFAULT;

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
   * The default value of the '{@link #isKnitwise() <em>Knitwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKnitwise()
   * @generated
   * @ordered
   */
  protected static final boolean KNITWISE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKnitwise() <em>Knitwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKnitwise()
   * @generated
   * @ordered
   */
  protected boolean knitwise = KNITWISE_EDEFAULT;

  /**
   * The default value of the '{@link #isPurlwise() <em>Purlwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPurlwise()
   * @generated
   * @ordered
   */
  protected static final boolean PURLWISE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPurlwise() <em>Purlwise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPurlwise()
   * @generated
   * @ordered
   */
  protected boolean purlwise = PURLWISE_EDEFAULT;

  /**
   * The default value of the '{@link #getYarnPosition() <em>Yarn Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYarnPosition()
   * @generated
   * @ordered
   */
  protected static final String YARN_POSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYarnPosition() <em>Yarn Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYarnPosition()
   * @generated
   * @ordered
   */
  protected String yarnPosition = YARN_POSITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlipImpl()
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
    return KnittingExpressionLanguagePackage.Literals.SLIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReverse()
  {
    return reverse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReverse(boolean newReverse)
  {
    boolean oldReverse = reverse;
    reverse = newReverse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.SLIP__REVERSE, oldReverse, reverse));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.SLIP__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKnitwise()
  {
    return knitwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnitwise(boolean newKnitwise)
  {
    boolean oldKnitwise = knitwise;
    knitwise = newKnitwise;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.SLIP__KNITWISE, oldKnitwise, knitwise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPurlwise()
  {
    return purlwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurlwise(boolean newPurlwise)
  {
    boolean oldPurlwise = purlwise;
    purlwise = newPurlwise;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.SLIP__PURLWISE, oldPurlwise, purlwise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYarnPosition()
  {
    return yarnPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYarnPosition(String newYarnPosition)
  {
    String oldYarnPosition = yarnPosition;
    yarnPosition = newYarnPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.SLIP__YARN_POSITION, oldYarnPosition, yarnPosition));
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
      case KnittingExpressionLanguagePackage.SLIP__REVERSE:
        return isReverse();
      case KnittingExpressionLanguagePackage.SLIP__NUMBER:
        return getNumber();
      case KnittingExpressionLanguagePackage.SLIP__KNITWISE:
        return isKnitwise();
      case KnittingExpressionLanguagePackage.SLIP__PURLWISE:
        return isPurlwise();
      case KnittingExpressionLanguagePackage.SLIP__YARN_POSITION:
        return getYarnPosition();
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
      case KnittingExpressionLanguagePackage.SLIP__REVERSE:
        setReverse((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.SLIP__NUMBER:
        setNumber((Integer)newValue);
        return;
      case KnittingExpressionLanguagePackage.SLIP__KNITWISE:
        setKnitwise((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.SLIP__PURLWISE:
        setPurlwise((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.SLIP__YARN_POSITION:
        setYarnPosition((String)newValue);
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
      case KnittingExpressionLanguagePackage.SLIP__REVERSE:
        setReverse(REVERSE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.SLIP__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.SLIP__KNITWISE:
        setKnitwise(KNITWISE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.SLIP__PURLWISE:
        setPurlwise(PURLWISE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.SLIP__YARN_POSITION:
        setYarnPosition(YARN_POSITION_EDEFAULT);
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
      case KnittingExpressionLanguagePackage.SLIP__REVERSE:
        return reverse != REVERSE_EDEFAULT;
      case KnittingExpressionLanguagePackage.SLIP__NUMBER:
        return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
      case KnittingExpressionLanguagePackage.SLIP__KNITWISE:
        return knitwise != KNITWISE_EDEFAULT;
      case KnittingExpressionLanguagePackage.SLIP__PURLWISE:
        return purlwise != PURLWISE_EDEFAULT;
      case KnittingExpressionLanguagePackage.SLIP__YARN_POSITION:
        return YARN_POSITION_EDEFAULT == null ? yarnPosition != null : !YARN_POSITION_EDEFAULT.equals(yarnPosition);
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
    result.append(" (reverse: ");
    result.append(reverse);
    result.append(", number: ");
    result.append(number);
    result.append(", knitwise: ");
    result.append(knitwise);
    result.append(", purlwise: ");
    result.append(purlwise);
    result.append(", yarnPosition: ");
    result.append(yarnPosition);
    result.append(')');
    return result.toString();
  }

} //SlipImpl
