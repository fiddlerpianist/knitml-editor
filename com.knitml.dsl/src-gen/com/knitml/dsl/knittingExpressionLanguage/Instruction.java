/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getId <em>Id</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getLabel <em>Label</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#isHasKey <em>Has Key</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getMessageKey <em>Message Key</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getShape <em>Shape</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends BlockOperation
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Has Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Key</em>' attribute.
   * @see #setHasKey(boolean)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_HasKey()
   * @model
   * @generated
   */
  boolean isHasKey();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#isHasKey <em>Has Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Key</em>' attribute.
   * @see #isHasKey()
   * @generated
   */
  void setHasKey(boolean value);

  /**
   * Returns the value of the '<em><b>Message Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Key</em>' attribute.
   * @see #setMessageKey(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_MessageKey()
   * @model
   * @generated
   */
  String getMessageKey();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getMessageKey <em>Message Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Key</em>' attribute.
   * @see #getMessageKey()
   * @generated
   */
  void setMessageKey(String value);

  /**
   * Returns the value of the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' attribute.
   * @see #setShape(String)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_Shape()
   * @model
   * @generated
   */
  String getShape();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getShape <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' attribute.
   * @see #getShape()
   * @generated
   */
  void setShape(String value);

  /**
   * Returns the value of the '<em><b>Row Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row Count</em>' attribute.
   * @see #setRowCount(Integer)
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_RowCount()
   * @model
   * @generated
   */
  Integer getRowCount();

  /**
   * Sets the value of the '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getRowCount <em>Row Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row Count</em>' attribute.
   * @see #getRowCount()
   * @generated
   */
  void setRowCount(Integer value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link com.knitml.dsl.knittingExpressionLanguage.Row}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#getInstruction_Rows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getRows();

} // Instruction
