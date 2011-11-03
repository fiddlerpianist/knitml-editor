/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnittingExpressionLanguageFactoryImpl extends EFactoryImpl implements KnittingExpressionLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KnittingExpressionLanguageFactory init()
  {
    try
    {
      KnittingExpressionLanguageFactory theKnittingExpressionLanguageFactory = (KnittingExpressionLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.knitml.com/dsl/KnittingExpressionLanguage"); 
      if (theKnittingExpressionLanguageFactory != null)
      {
        return theKnittingExpressionLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KnittingExpressionLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnittingExpressionLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KnittingExpressionLanguagePackage.PATTERN: return createPattern();
      case KnittingExpressionLanguagePackage.BLOCK_OPERATION: return createBlockOperation();
      case KnittingExpressionLanguagePackage.INSTRUCTION: return createInstruction();
      case KnittingExpressionLanguagePackage.ROW: return createRow();
      case KnittingExpressionLanguagePackage.MESSAGE: return createMessage();
      case KnittingExpressionLanguagePackage.INLINE_OPERATION: return createInlineOperation();
      case KnittingExpressionLanguagePackage.KNIT: return createKnit();
      case KnittingExpressionLanguagePackage.PURL: return createPurl();
      case KnittingExpressionLanguagePackage.SLIP: return createSlip();
      case KnittingExpressionLanguagePackage.REPEAT_SPEC: return createRepeatSpec();
      case KnittingExpressionLanguagePackage.REPEAT: return createRepeat();
      case KnittingExpressionLanguagePackage.RANGE: return createRange();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOperation createBlockOperation()
  {
    BlockOperationImpl blockOperation = new BlockOperationImpl();
    return blockOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Row createRow()
  {
    RowImpl row = new RowImpl();
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineOperation createInlineOperation()
  {
    InlineOperationImpl inlineOperation = new InlineOperationImpl();
    return inlineOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Knit createKnit()
  {
    KnitImpl knit = new KnitImpl();
    return knit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Purl createPurl()
  {
    PurlImpl purl = new PurlImpl();
    return purl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Slip createSlip()
  {
    SlipImpl slip = new SlipImpl();
    return slip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatSpec createRepeatSpec()
  {
    RepeatSpecImpl repeatSpec = new RepeatSpecImpl();
    return repeatSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repeat createRepeat()
  {
    RepeatImpl repeat = new RepeatImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnittingExpressionLanguagePackage getKnittingExpressionLanguagePackage()
  {
    return (KnittingExpressionLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KnittingExpressionLanguagePackage getPackage()
  {
    return KnittingExpressionLanguagePackage.eINSTANCE;
  }

} //KnittingExpressionLanguageFactoryImpl
