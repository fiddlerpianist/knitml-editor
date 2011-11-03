/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#isHasKey <em>Has Key</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getMessageKey <em>Message Key</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends BlockOperationImpl implements Instruction
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
   * The default value of the '{@link #isHasKey() <em>Has Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasKey()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasKey() <em>Has Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasKey()
   * @generated
   * @ordered
   */
  protected boolean hasKey = HAS_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageKey()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageKey()
   * @generated
   * @ordered
   */
  protected String messageKey = MESSAGE_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final String SHAPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected String shape = SHAPE_EDEFAULT;

  /**
   * The default value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowCount()
   * @generated
   * @ordered
   */
  protected static final Integer ROW_COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowCount()
   * @generated
   * @ordered
   */
  protected Integer rowCount = ROW_COUNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected EList<Row> rows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
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
    return KnittingExpressionLanguagePackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasKey()
  {
    return hasKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasKey(boolean newHasKey)
  {
    boolean oldHasKey = hasKey;
    hasKey = newHasKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__HAS_KEY, oldHasKey, hasKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessageKey()
  {
    return messageKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessageKey(String newMessageKey)
  {
    String oldMessageKey = messageKey;
    messageKey = newMessageKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__MESSAGE_KEY, oldMessageKey, messageKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(String newShape)
  {
    String oldShape = shape;
    shape = newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__SHAPE, oldShape, shape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getRowCount()
  {
    return rowCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRowCount(Integer newRowCount)
  {
    Integer oldRowCount = rowCount;
    rowCount = newRowCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KnittingExpressionLanguagePackage.INSTRUCTION__ROW_COUNT, oldRowCount, rowCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Row> getRows()
  {
    if (rows == null)
    {
      rows = new EObjectContainmentEList<Row>(Row.class, this, KnittingExpressionLanguagePackage.INSTRUCTION__ROWS);
    }
    return rows;
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
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROWS:
        return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
      case KnittingExpressionLanguagePackage.INSTRUCTION__ID:
        return getId();
      case KnittingExpressionLanguagePackage.INSTRUCTION__LABEL:
        return getLabel();
      case KnittingExpressionLanguagePackage.INSTRUCTION__HAS_KEY:
        return isHasKey();
      case KnittingExpressionLanguagePackage.INSTRUCTION__MESSAGE_KEY:
        return getMessageKey();
      case KnittingExpressionLanguagePackage.INSTRUCTION__SHAPE:
        return getShape();
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROW_COUNT:
        return getRowCount();
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROWS:
        return getRows();
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
      case KnittingExpressionLanguagePackage.INSTRUCTION__ID:
        setId((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__LABEL:
        setLabel((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__HAS_KEY:
        setHasKey((Boolean)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__MESSAGE_KEY:
        setMessageKey((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__SHAPE:
        setShape((String)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROW_COUNT:
        setRowCount((Integer)newValue);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROWS:
        getRows().clear();
        getRows().addAll((Collection<? extends Row>)newValue);
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
      case KnittingExpressionLanguagePackage.INSTRUCTION__ID:
        setId(ID_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__HAS_KEY:
        setHasKey(HAS_KEY_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__MESSAGE_KEY:
        setMessageKey(MESSAGE_KEY_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__SHAPE:
        setShape(SHAPE_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROW_COUNT:
        setRowCount(ROW_COUNT_EDEFAULT);
        return;
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROWS:
        getRows().clear();
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
      case KnittingExpressionLanguagePackage.INSTRUCTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case KnittingExpressionLanguagePackage.INSTRUCTION__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case KnittingExpressionLanguagePackage.INSTRUCTION__HAS_KEY:
        return hasKey != HAS_KEY_EDEFAULT;
      case KnittingExpressionLanguagePackage.INSTRUCTION__MESSAGE_KEY:
        return MESSAGE_KEY_EDEFAULT == null ? messageKey != null : !MESSAGE_KEY_EDEFAULT.equals(messageKey);
      case KnittingExpressionLanguagePackage.INSTRUCTION__SHAPE:
        return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROW_COUNT:
        return ROW_COUNT_EDEFAULT == null ? rowCount != null : !ROW_COUNT_EDEFAULT.equals(rowCount);
      case KnittingExpressionLanguagePackage.INSTRUCTION__ROWS:
        return rows != null && !rows.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", label: ");
    result.append(label);
    result.append(", hasKey: ");
    result.append(hasKey);
    result.append(", messageKey: ");
    result.append(messageKey);
    result.append(", shape: ");
    result.append(shape);
    result.append(", rowCount: ");
    result.append(rowCount);
    result.append(')');
    return result.toString();
  }

} //InstructionImpl
