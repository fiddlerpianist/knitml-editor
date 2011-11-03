/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.util;

import com.knitml.dsl.knittingExpressionLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage
 * @generated
 */
public class KnittingExpressionLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KnittingExpressionLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnittingExpressionLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KnittingExpressionLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnittingExpressionLanguageSwitch<Adapter> modelSwitch =
    new KnittingExpressionLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseBlockOperation(BlockOperation object)
      {
        return createBlockOperationAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseRow(Row object)
      {
        return createRowAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseInlineOperation(InlineOperation object)
      {
        return createInlineOperationAdapter();
      }
      @Override
      public Adapter caseKnit(Knit object)
      {
        return createKnitAdapter();
      }
      @Override
      public Adapter casePurl(Purl object)
      {
        return createPurlAdapter();
      }
      @Override
      public Adapter caseSlip(Slip object)
      {
        return createSlipAdapter();
      }
      @Override
      public Adapter caseRepeatSpec(RepeatSpec object)
      {
        return createRepeatSpecAdapter();
      }
      @Override
      public Adapter caseRepeat(Repeat object)
      {
        return createRepeatAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.BlockOperation <em>Block Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.BlockOperation
   * @generated
   */
  public Adapter createBlockOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row
   * @generated
   */
  public Adapter createRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.InlineOperation <em>Inline Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.InlineOperation
   * @generated
   */
  public Adapter createInlineOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Knit <em>Knit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit
   * @generated
   */
  public Adapter createKnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Purl <em>Purl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl
   * @generated
   */
  public Adapter createPurlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Slip <em>Slip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip
   * @generated
   */
  public Adapter createSlipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec <em>Repeat Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec
   * @generated
   */
  public Adapter createRepeatSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Repeat
   * @generated
   */
  public Adapter createRepeatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.knitml.dsl.knittingExpressionLanguage.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.knitml.dsl.knittingExpressionLanguage.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //KnittingExpressionLanguageAdapterFactory
