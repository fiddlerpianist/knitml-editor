/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.InlineOperation;
import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Range;
import com.knitml.dsl.knittingExpressionLanguage.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#isNextRow <em>Next Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#isShortRow <em>Short Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#isLongRow <em>Long Row</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getSubsequent <em>Subsequent</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getSide <em>Side</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getYarnRef <em>Yarn Ref</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#isInform <em>Inform</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#isReset <em>Reset</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RowImpl extends BlockOperationImpl implements Row
{
  /**
   * The default value of the '{@link #isNextRow() <em>Next Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextRow()
   * @generated
   * @ordered
   */
  protected static final boolean NEXT_ROW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNextRow() <em>Next Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextRow()
   * @generated
   * @ordered
   */
  protected boolean nextRow = NEXT_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #isShortRow() <em>Short Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShortRow()
   * @generated
   * @ordered
   */
  protected static final boolean SHORT_ROW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShortRow() <em>Short Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShortRow()
   * @generated
   * @ordered
   */
  protected boolean shortRow = SHORT_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #isLongRow() <em>Long Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLongRow()
   * @generated
   * @ordered
   */
  protected static final boolean LONG_ROW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLongRow() <em>Long Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLongRow()
   * @generated
   * @ordered
   */
  protected boolean longRow = LONG_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Range range;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected EList<Integer> number;

  /**
   * The default value of the '{@link #getSubsequent() <em>Subsequent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsequent()
   * @generated
   * @ordered
   */
  protected static final String SUBSEQUENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubsequent() <em>Subsequent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsequent()
   * @generated
   * @ordered
   */
  protected String subsequent = SUBSEQUENT_EDEFAULT;

  /**
   * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected static final String SIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected String side = SIDE_EDEFAULT;

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
   * The default value of the '{@link #isInform() <em>Inform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInform()
   * @generated
   * @ordered
   */
  protected static final boolean INFORM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInform() <em>Inform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInform()
   * @generated
   * @ordered
   */
  protected boolean inform = INFORM_EDEFAULT;

  /**
   * The default value of the '{@link #isReset() <em>Reset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReset()
   * @generated
   * @ordered
   */
  protected static final boolean RESET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReset() <em>Reset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReset()
   * @generated
   * @ordered
   */
  protected boolean reset = RESET_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<InlineOperation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RowImpl()
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
    return KnittingExpressionLanguagePackage.Literals.ROW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNextRow()
  {
    return nextRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextRow(boolean newNextRow)
  {
    boolean oldNextRow = nextRow;
    nextRow = newNextRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__NEXT_ROW, oldNextRow, nextRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShortRow()
  {
    return shortRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortRow(boolean newShortRow)
  {
    boolean oldShortRow = shortRow;
    shortRow = newShortRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__SHORT_ROW, oldShortRow, shortRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLongRow()
  {
    return longRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongRow(boolean newLongRow)
  {
    boolean oldLongRow = longRow;
    longRow = newLongRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__LONG_ROW, oldLongRow, longRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Range newRange, NotificationChain msgs)
  {
    Range oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(Range newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KnittingExpressionLanguagePackage.ROW__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KnittingExpressionLanguagePackage.ROW__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumber()
  {
    if (number == null)
    {
      number = new EDataTypeEList<Integer>(Integer.class, this, KnittingExpressionLanguagePackage.ROW__NUMBER);
    }
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubsequent()
  {
    return subsequent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubsequent(String newSubsequent)
  {
    String oldSubsequent = subsequent;
    subsequent = newSubsequent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__SUBSEQUENT, oldSubsequent, subsequent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSide()
  {
    return side;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSide(String newSide)
  {
    String oldSide = side;
    side = newSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__SIDE, oldSide, side));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__YARN_REF, oldYarnRef, yarnRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInform()
  {
    return inform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInform(boolean newInform)
  {
    boolean oldInform = inform;
    inform = newInform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__INFORM, oldInform, inform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReset()
  {
    return reset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReset(boolean newReset)
  {
    boolean oldReset = reset;
    reset = newReset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.ROW__RESET, oldReset, reset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InlineOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<InlineOperation>(InlineOperation.class, this, KnittingExpressionLanguagePackage.ROW__OPERATIONS);
    }
    return operations;
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
      case KnittingExpressionLanguagePackage.ROW__RANGE:
        return basicSetRange(null, msgs);
      case KnittingExpressionLanguagePackage.ROW__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case KnittingExpressionLanguagePackage.ROW__NEXT_ROW:
        return isNextRow();
      case KnittingExpressionLanguagePackage.ROW__SHORT_ROW:
        return isShortRow();
      case KnittingExpressionLanguagePackage.ROW__LONG_ROW:
        return isLongRow();
      case KnittingExpressionLanguagePackage.ROW__LABEL:
        return getLabel();
      case KnittingExpressionLanguagePackage.ROW__RANGE:
        return getRange();
      case KnittingExpressionLanguagePackage.ROW__NUMBER:
        return getNumber();
      case KnittingExpressionLanguagePackage.ROW__SUBSEQUENT:
        return getSubsequent();
      case KnittingExpressionLanguagePackage.ROW__SIDE:
        return getSide();
      case KnittingExpressionLanguagePackage.ROW__YARN_REF:
        return getYarnRef();
      case KnittingExpressionLanguagePackage.ROW__INFORM:
        return isInform();
      case KnittingExpressionLanguagePackage.ROW__RESET:
        return isReset();
      case KnittingExpressionLanguagePackage.ROW__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KnittingExpressionLanguagePackage.ROW__NEXT_ROW:
        setNextRow((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__SHORT_ROW:
        setShortRow((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__LONG_ROW:
        setLongRow((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__LABEL:
        setLabel((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__RANGE:
        setRange((Range)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__NUMBER:
        getNumber().clear();
        getNumber().addAll((Collection<? extends Integer>)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__SUBSEQUENT:
        setSubsequent((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__SIDE:
        setSide((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__YARN_REF:
        setYarnRef((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__INFORM:
        setInform((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__RESET:
        setReset((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.ROW__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends InlineOperation>)newValue);
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
      case KnittingExpressionLanguagePackage.ROW__NEXT_ROW:
        setNextRow(NEXT_ROW_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__SHORT_ROW:
        setShortRow(SHORT_ROW_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__LONG_ROW:
        setLongRow(LONG_ROW_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__RANGE:
        setRange((Range)null);
        return;
      case KnittingExpressionLanguagePackage.ROW__NUMBER:
        getNumber().clear();
        return;
      case KnittingExpressionLanguagePackage.ROW__SUBSEQUENT:
        setSubsequent(SUBSEQUENT_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__SIDE:
        setSide(SIDE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__YARN_REF:
        setYarnRef(YARN_REF_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__INFORM:
        setInform(INFORM_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__RESET:
        setReset(RESET_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.ROW__OPERATIONS:
        getOperations().clear();
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
      case KnittingExpressionLanguagePackage.ROW__NEXT_ROW:
        return nextRow != NEXT_ROW_EDEFAULT;
      case KnittingExpressionLanguagePackage.ROW__SHORT_ROW:
        return shortRow != SHORT_ROW_EDEFAULT;
      case KnittingExpressionLanguagePackage.ROW__LONG_ROW:
        return longRow != LONG_ROW_EDEFAULT;
      case KnittingExpressionLanguagePackage.ROW__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case KnittingExpressionLanguagePackage.ROW__RANGE:
        return range != null;
      case KnittingExpressionLanguagePackage.ROW__NUMBER:
        return number != null && !number.isEmpty();
      case KnittingExpressionLanguagePackage.ROW__SUBSEQUENT:
        return SUBSEQUENT_EDEFAULT == null ? subsequent != null : !SUBSEQUENT_EDEFAULT.equals(subsequent);
      case KnittingExpressionLanguagePackage.ROW__SIDE:
        return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
      case KnittingExpressionLanguagePackage.ROW__YARN_REF:
        return YARN_REF_EDEFAULT == null ? yarnRef != null : !YARN_REF_EDEFAULT.equals(yarnRef);
      case KnittingExpressionLanguagePackage.ROW__INFORM:
        return inform != INFORM_EDEFAULT;
      case KnittingExpressionLanguagePackage.ROW__RESET:
        return reset != RESET_EDEFAULT;
      case KnittingExpressionLanguagePackage.ROW__OPERATIONS:
        return operations != null && !operations.isEmpty();
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
    result.append(" (nextRow: ");
    result.append(nextRow);
    result.append(", shortRow: ");
    result.append(shortRow);
    result.append(", longRow: ");
    result.append(longRow);
    result.append(", label: ");
    result.append(label);
    result.append(", number: ");
    result.append(number);
    result.append(", subsequent: ");
    result.append(subsequent);
    result.append(", side: ");
    result.append(side);
    result.append(", yarnRef: ");
    result.append(yarnRef);
    result.append(", inform: ");
    result.append(inform);
    result.append(", reset: ");
    result.append(reset);
    result.append(')');
    return result.toString();
  }

} //RowImpl
