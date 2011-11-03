/**
 * <copyright>
 * </copyright>
 *

 */
package com.knitml.dsl.knittingExpressionLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface KnittingExpressionLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "knittingExpressionLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.knitml.com/dsl/KnittingExpressionLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "knittingExpressionLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KnittingExpressionLanguagePackage eINSTANCE = com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.PatternImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.BlockOperationImpl <em>Block Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.BlockOperationImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getBlockOperation()
   * @generated
   */
  int BLOCK_OPERATION = 1;

  /**
   * The number of structural features of the '<em>Block Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ID = BLOCK_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__LABEL = BLOCK_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__HAS_KEY = BLOCK_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Message Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__MESSAGE_KEY = BLOCK_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__SHAPE = BLOCK_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Row Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ROW_COUNT = BLOCK_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ROWS = BLOCK_OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = BLOCK_OPERATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl <em>Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRow()
   * @generated
   */
  int ROW = 3;

  /**
   * The feature id for the '<em><b>Next Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__NEXT_ROW = BLOCK_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Short Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__SHORT_ROW = BLOCK_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Long Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__LONG_ROW = BLOCK_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__LABEL = BLOCK_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__RANGE = BLOCK_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__NUMBER = BLOCK_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Subsequent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__SUBSEQUENT = BLOCK_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__SIDE = BLOCK_OPERATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Yarn Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__YARN_REF = BLOCK_OPERATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Inform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__INFORM = BLOCK_OPERATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Reset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__RESET = BLOCK_OPERATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__OPERATIONS = BLOCK_OPERATION_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_FEATURE_COUNT = BLOCK_OPERATION_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.MessageImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 4;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__MESSAGE = BLOCK_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = BLOCK_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.InlineOperationImpl <em>Inline Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.InlineOperationImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getInlineOperation()
   * @generated
   */
  int INLINE_OPERATION = 5;

  /**
   * The number of structural features of the '<em>Inline Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.KnitImpl <em>Knit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnitImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getKnit()
   * @generated
   */
  int KNIT = 6;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT__NUMBER = INLINE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Together</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT__TOGETHER = INLINE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Through Trailing Loop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT__THROUGH_TRAILING_LOOP = INLINE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Yarn Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT__YARN_REF = INLINE_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT__REPEAT = INLINE_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Knit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIT_FEATURE_COUNT = INLINE_OPERATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl <em>Purl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getPurl()
   * @generated
   */
  int PURL = 7;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL__NUMBER = INLINE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Together</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL__TOGETHER = INLINE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Through Trailing Loop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL__THROUGH_TRAILING_LOOP = INLINE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Yarn Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL__YARN_REF = INLINE_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL__REPEAT = INLINE_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Purl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURL_FEATURE_COUNT = INLINE_OPERATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl <em>Slip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getSlip()
   * @generated
   */
  int SLIP = 8;

  /**
   * The feature id for the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP__REVERSE = INLINE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP__NUMBER = INLINE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Knitwise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP__KNITWISE = INLINE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Purlwise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP__PURLWISE = INLINE_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Yarn Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP__YARN_POSITION = INLINE_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Slip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIP_FEATURE_COUNT = INLINE_OPERATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl <em>Repeat Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRepeatSpec()
   * @generated
   */
  int REPEAT_SPEC = 9;

  /**
   * The feature id for the '<em><b>To End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__TO_END = 0;

  /**
   * The feature id for the '<em><b>To Marker</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__TO_MARKER = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__VALUE = 2;

  /**
   * The feature id for the '<em><b>Before End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__BEFORE_END = 3;

  /**
   * The feature id for the '<em><b>Before Gap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__BEFORE_GAP = 4;

  /**
   * The feature id for the '<em><b>Before Marker</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__BEFORE_MARKER = 5;

  /**
   * The feature id for the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC__TIMES = 6;

  /**
   * The number of structural features of the '<em>Repeat Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_SPEC_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatImpl <em>Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.RepeatImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRepeat()
   * @generated
   */
  int REPEAT = 10;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__OPERATIONS = INLINE_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__SPEC = INLINE_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = INLINE_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.RangeImpl
   * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRange()
   * @generated
   */
  int RANGE = 11;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__MAX = 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the containment reference list '{@link com.knitml.dsl.knittingExpressionLanguage.Pattern#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Pattern#getElements()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Elements();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.BlockOperation <em>Block Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Operation</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.BlockOperation
   * @generated
   */
  EClass getBlockOperation();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getId()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Id();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getLabel()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Label();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#isHasKey <em>Has Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Key</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#isHasKey()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_HasKey();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getMessageKey <em>Message Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message Key</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getMessageKey()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_MessageKey();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getShape()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Shape();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getRowCount <em>Row Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row Count</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getRowCount()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_RowCount();

  /**
   * Returns the meta object for the containment reference list '{@link com.knitml.dsl.knittingExpressionLanguage.Instruction#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Instruction#getRows()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Rows();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row
   * @generated
   */
  EClass getRow();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isNextRow <em>Next Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Next Row</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#isNextRow()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_NextRow();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isShortRow <em>Short Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Row</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#isShortRow()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_ShortRow();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isLongRow <em>Long Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Row</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#isLongRow()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_LongRow();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getLabel()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Label();

  /**
   * Returns the meta object for the containment reference '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getRange()
   * @see #getRow()
   * @generated
   */
  EReference getRow_Range();

  /**
   * Returns the meta object for the attribute list '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Number</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getNumber()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Number();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSubsequent <em>Subsequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subsequent</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getSubsequent()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Subsequent();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getSide <em>Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Side</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getSide()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Side();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getYarnRef <em>Yarn Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yarn Ref</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getYarnRef()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_YarnRef();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isInform <em>Inform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inform</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#isInform()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Inform();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Row#isReset <em>Reset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reset</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#isReset()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Reset();

  /**
   * Returns the meta object for the containment reference list '{@link com.knitml.dsl.knittingExpressionLanguage.Row#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Row#getOperations()
   * @see #getRow()
   * @generated
   */
  EReference getRow_Operations();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Message#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Message#getMessage()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Message();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.InlineOperation <em>Inline Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Operation</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.InlineOperation
   * @generated
   */
  EClass getInlineOperation();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Knit <em>Knit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knit</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit
   * @generated
   */
  EClass getKnit();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit#getNumber()
   * @see #getKnit()
   * @generated
   */
  EAttribute getKnit_Number();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isTogether <em>Together</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Together</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit#isTogether()
   * @see #getKnit()
   * @generated
   */
  EAttribute getKnit_Together();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#isThroughTrailingLoop <em>Through Trailing Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Through Trailing Loop</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit#isThroughTrailingLoop()
   * @see #getKnit()
   * @generated
   */
  EAttribute getKnit_ThroughTrailingLoop();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getYarnRef <em>Yarn Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yarn Ref</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit#getYarnRef()
   * @see #getKnit()
   * @generated
   */
  EAttribute getKnit_YarnRef();

  /**
   * Returns the meta object for the containment reference '{@link com.knitml.dsl.knittingExpressionLanguage.Knit#getRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repeat</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Knit#getRepeat()
   * @see #getKnit()
   * @generated
   */
  EReference getKnit_Repeat();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Purl <em>Purl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Purl</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl
   * @generated
   */
  EClass getPurl();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Purl#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl#getNumber()
   * @see #getPurl()
   * @generated
   */
  EAttribute getPurl_Number();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Purl#isTogether <em>Together</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Together</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl#isTogether()
   * @see #getPurl()
   * @generated
   */
  EAttribute getPurl_Together();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Purl#isThroughTrailingLoop <em>Through Trailing Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Through Trailing Loop</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl#isThroughTrailingLoop()
   * @see #getPurl()
   * @generated
   */
  EAttribute getPurl_ThroughTrailingLoop();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Purl#getYarnRef <em>Yarn Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yarn Ref</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl#getYarnRef()
   * @see #getPurl()
   * @generated
   */
  EAttribute getPurl_YarnRef();

  /**
   * Returns the meta object for the containment reference '{@link com.knitml.dsl.knittingExpressionLanguage.Purl#getRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repeat</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Purl#getRepeat()
   * @see #getPurl()
   * @generated
   */
  EReference getPurl_Repeat();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Slip <em>Slip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slip</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip
   * @generated
   */
  EClass getSlip();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isReverse <em>Reverse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reverse</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip#isReverse()
   * @see #getSlip()
   * @generated
   */
  EAttribute getSlip_Reverse();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip#getNumber()
   * @see #getSlip()
   * @generated
   */
  EAttribute getSlip_Number();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isKnitwise <em>Knitwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Knitwise</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip#isKnitwise()
   * @see #getSlip()
   * @generated
   */
  EAttribute getSlip_Knitwise();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#isPurlwise <em>Purlwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purlwise</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip#isPurlwise()
   * @see #getSlip()
   * @generated
   */
  EAttribute getSlip_Purlwise();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Slip#getYarnPosition <em>Yarn Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yarn Position</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Slip#getYarnPosition()
   * @see #getSlip()
   * @generated
   */
  EAttribute getSlip_YarnPosition();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec <em>Repeat Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Spec</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec
   * @generated
   */
  EClass getRepeatSpec();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToEnd <em>To End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To End</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToEnd()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_ToEnd();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToMarker <em>To Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Marker</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isToMarker()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_ToMarker();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#getValue()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_Value();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeEnd <em>Before End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before End</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeEnd()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_BeforeEnd();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeGap <em>Before Gap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before Gap</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeGap()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_BeforeGap();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeMarker <em>Before Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before Marker</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isBeforeMarker()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_BeforeMarker();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Times</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.RepeatSpec#isTimes()
   * @see #getRepeatSpec()
   * @generated
   */
  EAttribute getRepeatSpec_Times();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Repeat
   * @generated
   */
  EClass getRepeat();

  /**
   * Returns the meta object for the containment reference list '{@link com.knitml.dsl.knittingExpressionLanguage.Repeat#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Repeat#getOperations()
   * @see #getRepeat()
   * @generated
   */
  EReference getRepeat_Operations();

  /**
   * Returns the meta object for the containment reference '{@link com.knitml.dsl.knittingExpressionLanguage.Repeat#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Repeat#getSpec()
   * @see #getRepeat()
   * @generated
   */
  EReference getRepeat_Spec();

  /**
   * Returns the meta object for class '{@link com.knitml.dsl.knittingExpressionLanguage.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Range#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Range#getMin()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_Min();

  /**
   * Returns the meta object for the attribute '{@link com.knitml.dsl.knittingExpressionLanguage.Range#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see com.knitml.dsl.knittingExpressionLanguage.Range#getMax()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_Max();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KnittingExpressionLanguageFactory getKnittingExpressionLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.PatternImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__ELEMENTS = eINSTANCE.getPattern_Elements();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.BlockOperationImpl <em>Block Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.BlockOperationImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getBlockOperation()
     * @generated
     */
    EClass BLOCK_OPERATION = eINSTANCE.getBlockOperation();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.InstructionImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__ID = eINSTANCE.getInstruction_Id();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__LABEL = eINSTANCE.getInstruction_Label();

    /**
     * The meta object literal for the '<em><b>Has Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__HAS_KEY = eINSTANCE.getInstruction_HasKey();

    /**
     * The meta object literal for the '<em><b>Message Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__MESSAGE_KEY = eINSTANCE.getInstruction_MessageKey();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__SHAPE = eINSTANCE.getInstruction_Shape();

    /**
     * The meta object literal for the '<em><b>Row Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__ROW_COUNT = eINSTANCE.getInstruction_RowCount();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ROWS = eINSTANCE.getInstruction_Rows();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl <em>Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.RowImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRow()
     * @generated
     */
    EClass ROW = eINSTANCE.getRow();

    /**
     * The meta object literal for the '<em><b>Next Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__NEXT_ROW = eINSTANCE.getRow_NextRow();

    /**
     * The meta object literal for the '<em><b>Short Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__SHORT_ROW = eINSTANCE.getRow_ShortRow();

    /**
     * The meta object literal for the '<em><b>Long Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__LONG_ROW = eINSTANCE.getRow_LongRow();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__LABEL = eINSTANCE.getRow_Label();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROW__RANGE = eINSTANCE.getRow_Range();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__NUMBER = eINSTANCE.getRow_Number();

    /**
     * The meta object literal for the '<em><b>Subsequent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__SUBSEQUENT = eINSTANCE.getRow_Subsequent();

    /**
     * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__SIDE = eINSTANCE.getRow_Side();

    /**
     * The meta object literal for the '<em><b>Yarn Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__YARN_REF = eINSTANCE.getRow_YarnRef();

    /**
     * The meta object literal for the '<em><b>Inform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__INFORM = eINSTANCE.getRow_Inform();

    /**
     * The meta object literal for the '<em><b>Reset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__RESET = eINSTANCE.getRow_Reset();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROW__OPERATIONS = eINSTANCE.getRow_Operations();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.MessageImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.InlineOperationImpl <em>Inline Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.InlineOperationImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getInlineOperation()
     * @generated
     */
    EClass INLINE_OPERATION = eINSTANCE.getInlineOperation();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.KnitImpl <em>Knit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnitImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getKnit()
     * @generated
     */
    EClass KNIT = eINSTANCE.getKnit();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNIT__NUMBER = eINSTANCE.getKnit_Number();

    /**
     * The meta object literal for the '<em><b>Together</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNIT__TOGETHER = eINSTANCE.getKnit_Together();

    /**
     * The meta object literal for the '<em><b>Through Trailing Loop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNIT__THROUGH_TRAILING_LOOP = eINSTANCE.getKnit_ThroughTrailingLoop();

    /**
     * The meta object literal for the '<em><b>Yarn Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNIT__YARN_REF = eINSTANCE.getKnit_YarnRef();

    /**
     * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNIT__REPEAT = eINSTANCE.getKnit_Repeat();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl <em>Purl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.PurlImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getPurl()
     * @generated
     */
    EClass PURL = eINSTANCE.getPurl();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURL__NUMBER = eINSTANCE.getPurl_Number();

    /**
     * The meta object literal for the '<em><b>Together</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURL__TOGETHER = eINSTANCE.getPurl_Together();

    /**
     * The meta object literal for the '<em><b>Through Trailing Loop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURL__THROUGH_TRAILING_LOOP = eINSTANCE.getPurl_ThroughTrailingLoop();

    /**
     * The meta object literal for the '<em><b>Yarn Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURL__YARN_REF = eINSTANCE.getPurl_YarnRef();

    /**
     * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURL__REPEAT = eINSTANCE.getPurl_Repeat();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl <em>Slip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.SlipImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getSlip()
     * @generated
     */
    EClass SLIP = eINSTANCE.getSlip();

    /**
     * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIP__REVERSE = eINSTANCE.getSlip_Reverse();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIP__NUMBER = eINSTANCE.getSlip_Number();

    /**
     * The meta object literal for the '<em><b>Knitwise</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIP__KNITWISE = eINSTANCE.getSlip_Knitwise();

    /**
     * The meta object literal for the '<em><b>Purlwise</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIP__PURLWISE = eINSTANCE.getSlip_Purlwise();

    /**
     * The meta object literal for the '<em><b>Yarn Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIP__YARN_POSITION = eINSTANCE.getSlip_YarnPosition();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl <em>Repeat Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.RepeatSpecImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRepeatSpec()
     * @generated
     */
    EClass REPEAT_SPEC = eINSTANCE.getRepeatSpec();

    /**
     * The meta object literal for the '<em><b>To End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__TO_END = eINSTANCE.getRepeatSpec_ToEnd();

    /**
     * The meta object literal for the '<em><b>To Marker</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__TO_MARKER = eINSTANCE.getRepeatSpec_ToMarker();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__VALUE = eINSTANCE.getRepeatSpec_Value();

    /**
     * The meta object literal for the '<em><b>Before End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__BEFORE_END = eINSTANCE.getRepeatSpec_BeforeEnd();

    /**
     * The meta object literal for the '<em><b>Before Gap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__BEFORE_GAP = eINSTANCE.getRepeatSpec_BeforeGap();

    /**
     * The meta object literal for the '<em><b>Before Marker</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__BEFORE_MARKER = eINSTANCE.getRepeatSpec_BeforeMarker();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_SPEC__TIMES = eINSTANCE.getRepeatSpec_Times();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RepeatImpl <em>Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.RepeatImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRepeat()
     * @generated
     */
    EClass REPEAT = eINSTANCE.getRepeat();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__OPERATIONS = eINSTANCE.getRepeat_Operations();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__SPEC = eINSTANCE.getRepeat_Spec();

    /**
     * The meta object literal for the '{@link com.knitml.dsl.knittingExpressionLanguage.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.RangeImpl
     * @see com.knitml.dsl.knittingExpressionLanguage.impl.KnittingExpressionLanguagePackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

  }

} //KnittingExpressionLanguagePackage
