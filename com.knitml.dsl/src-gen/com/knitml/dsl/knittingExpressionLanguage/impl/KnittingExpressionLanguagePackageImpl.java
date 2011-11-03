/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage.impl;

import com.knitml.dsl.knittingExpressionLanguage.BlockOperation;
import com.knitml.dsl.knittingExpressionLanguage.InlineOperation;
import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.Knit;
import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguageFactory;
import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Message;
import com.knitml.dsl.knittingExpressionLanguage.Pattern;
import com.knitml.dsl.knittingExpressionLanguage.Purl;
import com.knitml.dsl.knittingExpressionLanguage.Range;
import com.knitml.dsl.knittingExpressionLanguage.Repeat;
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec;
import com.knitml.dsl.knittingExpressionLanguage.Row;
import com.knitml.dsl.knittingExpressionLanguage.Slip;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnittingExpressionLanguagePackageImpl extends EPackageImpl implements KnittingExpressionLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inlineOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass knitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass purlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KnittingExpressionLanguagePackageImpl()
  {
    super(eNS_URI, KnittingExpressionLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KnittingExpressionLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KnittingExpressionLanguagePackage init()
  {
    if (isInited) return (KnittingExpressionLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(KnittingExpressionLanguagePackage.eNS_URI);

    // Obtain or create and register package
    KnittingExpressionLanguagePackageImpl theKnittingExpressionLanguagePackage = (KnittingExpressionLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnittingExpressionLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnittingExpressionLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKnittingExpressionLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theKnittingExpressionLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKnittingExpressionLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KnittingExpressionLanguagePackage.eNS_URI, theKnittingExpressionLanguagePackage);
    return theKnittingExpressionLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Elements()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockOperation()
  {
    return blockOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_Id()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_Label()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_HasKey()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_MessageKey()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_Shape()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_RowCount()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_Rows()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRow()
  {
    return rowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_NextRow()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_ShortRow()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_LongRow()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Label()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRow_Range()
  {
    return (EReference)rowEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Number()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Subsequent()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Side()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_YarnRef()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Inform()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Reset()
  {
    return (EAttribute)rowEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRow_Operations()
  {
    return (EReference)rowEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Message()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineOperation()
  {
    return inlineOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKnit()
  {
    return knitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnit_Number()
  {
    return (EAttribute)knitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnit_Together()
  {
    return (EAttribute)knitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnit_ThroughTrailingLoop()
  {
    return (EAttribute)knitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnit_YarnRef()
  {
    return (EAttribute)knitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnit_Repeat()
  {
    return (EReference)knitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPurl()
  {
    return purlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPurl_Number()
  {
    return (EAttribute)purlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPurl_Together()
  {
    return (EAttribute)purlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPurl_ThroughTrailingLoop()
  {
    return (EAttribute)purlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPurl_YarnRef()
  {
    return (EAttribute)purlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPurl_Repeat()
  {
    return (EReference)purlEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlip()
  {
    return slipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlip_Reverse()
  {
    return (EAttribute)slipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlip_Number()
  {
    return (EAttribute)slipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlip_Knitwise()
  {
    return (EAttribute)slipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlip_Purlwise()
  {
    return (EAttribute)slipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlip_YarnPosition()
  {
    return (EAttribute)slipEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatSpec()
  {
    return repeatSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_ToEnd()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_ToMarker()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_Value()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_BeforeEnd()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_BeforeGap()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_BeforeMarker()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatSpec_Times()
  {
    return (EAttribute)repeatSpecEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeat()
  {
    return repeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Operations()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Spec()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_Min()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_Max()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnittingExpressionLanguageFactory getKnittingExpressionLanguageFactory()
  {
    return (KnittingExpressionLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    patternEClass = createEClass(PATTERN);
    createEReference(patternEClass, PATTERN__ELEMENTS);

    blockOperationEClass = createEClass(BLOCK_OPERATION);

    instructionEClass = createEClass(INSTRUCTION);
    createEAttribute(instructionEClass, INSTRUCTION__ID);
    createEAttribute(instructionEClass, INSTRUCTION__LABEL);
    createEAttribute(instructionEClass, INSTRUCTION__HAS_KEY);
    createEAttribute(instructionEClass, INSTRUCTION__MESSAGE_KEY);
    createEAttribute(instructionEClass, INSTRUCTION__SHAPE);
    createEAttribute(instructionEClass, INSTRUCTION__ROW_COUNT);
    createEReference(instructionEClass, INSTRUCTION__ROWS);

    rowEClass = createEClass(ROW);
    createEAttribute(rowEClass, ROW__NEXT_ROW);
    createEAttribute(rowEClass, ROW__SHORT_ROW);
    createEAttribute(rowEClass, ROW__LONG_ROW);
    createEAttribute(rowEClass, ROW__LABEL);
    createEReference(rowEClass, ROW__RANGE);
    createEAttribute(rowEClass, ROW__NUMBER);
    createEAttribute(rowEClass, ROW__SUBSEQUENT);
    createEAttribute(rowEClass, ROW__SIDE);
    createEAttribute(rowEClass, ROW__YARN_REF);
    createEAttribute(rowEClass, ROW__INFORM);
    createEAttribute(rowEClass, ROW__RESET);
    createEReference(rowEClass, ROW__OPERATIONS);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__MESSAGE);

    inlineOperationEClass = createEClass(INLINE_OPERATION);

    knitEClass = createEClass(KNIT);
    createEAttribute(knitEClass, KNIT__NUMBER);
    createEAttribute(knitEClass, KNIT__TOGETHER);
    createEAttribute(knitEClass, KNIT__THROUGH_TRAILING_LOOP);
    createEAttribute(knitEClass, KNIT__YARN_REF);
    createEReference(knitEClass, KNIT__REPEAT);

    purlEClass = createEClass(PURL);
    createEAttribute(purlEClass, PURL__NUMBER);
    createEAttribute(purlEClass, PURL__TOGETHER);
    createEAttribute(purlEClass, PURL__THROUGH_TRAILING_LOOP);
    createEAttribute(purlEClass, PURL__YARN_REF);
    createEReference(purlEClass, PURL__REPEAT);

    slipEClass = createEClass(SLIP);
    createEAttribute(slipEClass, SLIP__REVERSE);
    createEAttribute(slipEClass, SLIP__NUMBER);
    createEAttribute(slipEClass, SLIP__KNITWISE);
    createEAttribute(slipEClass, SLIP__PURLWISE);
    createEAttribute(slipEClass, SLIP__YARN_POSITION);

    repeatSpecEClass = createEClass(REPEAT_SPEC);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__TO_END);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__TO_MARKER);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__VALUE);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__BEFORE_END);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__BEFORE_GAP);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__BEFORE_MARKER);
    createEAttribute(repeatSpecEClass, REPEAT_SPEC__TIMES);

    repeatEClass = createEClass(REPEAT);
    createEReference(repeatEClass, REPEAT__OPERATIONS);
    createEReference(repeatEClass, REPEAT__SPEC);

    rangeEClass = createEClass(RANGE);
    createEAttribute(rangeEClass, RANGE__MIN);
    createEAttribute(rangeEClass, RANGE__MAX);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    instructionEClass.getESuperTypes().add(this.getBlockOperation());
    rowEClass.getESuperTypes().add(this.getBlockOperation());
    messageEClass.getESuperTypes().add(this.getBlockOperation());
    knitEClass.getESuperTypes().add(this.getInlineOperation());
    purlEClass.getESuperTypes().add(this.getInlineOperation());
    slipEClass.getESuperTypes().add(this.getInlineOperation());
    repeatEClass.getESuperTypes().add(this.getInlineOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPattern_Elements(), this.getBlockOperation(), null, "elements", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockOperationEClass, BlockOperation.class, "BlockOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_Id(), ecorePackage.getEString(), "id", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_Label(), ecorePackage.getEString(), "label", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_HasKey(), ecorePackage.getEBoolean(), "hasKey", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_MessageKey(), ecorePackage.getEString(), "messageKey", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_RowCount(), ecorePackage.getEIntegerObject(), "rowCount", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_Rows(), this.getRow(), null, "rows", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRow_NextRow(), ecorePackage.getEBoolean(), "nextRow", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_ShortRow(), ecorePackage.getEBoolean(), "shortRow", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_LongRow(), ecorePackage.getEBoolean(), "longRow", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Label(), ecorePackage.getEString(), "label", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRow_Range(), this.getRange(), null, "range", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Subsequent(), ecorePackage.getEString(), "subsequent", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Side(), ecorePackage.getEString(), "side", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_YarnRef(), ecorePackage.getEString(), "yarnRef", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Inform(), ecorePackage.getEBoolean(), "inform", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRow_Reset(), ecorePackage.getEBoolean(), "reset", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRow_Operations(), this.getInlineOperation(), null, "operations", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inlineOperationEClass, InlineOperation.class, "InlineOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(knitEClass, Knit.class, "Knit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKnit_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, 1, Knit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKnit_Together(), ecorePackage.getEBoolean(), "together", null, 0, 1, Knit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKnit_ThroughTrailingLoop(), ecorePackage.getEBoolean(), "throughTrailingLoop", null, 0, 1, Knit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKnit_YarnRef(), ecorePackage.getEString(), "yarnRef", null, 0, 1, Knit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKnit_Repeat(), this.getRepeatSpec(), null, "repeat", null, 0, 1, Knit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(purlEClass, Purl.class, "Purl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPurl_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, 1, Purl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPurl_Together(), ecorePackage.getEBoolean(), "together", null, 0, 1, Purl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPurl_ThroughTrailingLoop(), ecorePackage.getEBoolean(), "throughTrailingLoop", null, 0, 1, Purl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPurl_YarnRef(), ecorePackage.getEString(), "yarnRef", null, 0, 1, Purl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPurl_Repeat(), this.getRepeatSpec(), null, "repeat", null, 0, 1, Purl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slipEClass, Slip.class, "Slip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlip_Reverse(), ecorePackage.getEBoolean(), "reverse", null, 0, 1, Slip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlip_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, 1, Slip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlip_Knitwise(), ecorePackage.getEBoolean(), "knitwise", null, 0, 1, Slip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlip_Purlwise(), ecorePackage.getEBoolean(), "purlwise", null, 0, 1, Slip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlip_YarnPosition(), ecorePackage.getEString(), "yarnPosition", null, 0, 1, Slip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatSpecEClass, RepeatSpec.class, "RepeatSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatSpec_ToEnd(), ecorePackage.getEBoolean(), "toEnd", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_ToMarker(), ecorePackage.getEBoolean(), "toMarker", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_BeforeEnd(), ecorePackage.getEBoolean(), "beforeEnd", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_BeforeGap(), ecorePackage.getEBoolean(), "beforeGap", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_BeforeMarker(), ecorePackage.getEBoolean(), "beforeMarker", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatSpec_Times(), ecorePackage.getEBoolean(), "times", null, 0, 1, RepeatSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepeat_Operations(), this.getInlineOperation(), null, "operations", null, 0, -1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_Spec(), this.getRepeatSpec(), null, "spec", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRange_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRange_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KnittingExpressionLanguagePackageImpl
