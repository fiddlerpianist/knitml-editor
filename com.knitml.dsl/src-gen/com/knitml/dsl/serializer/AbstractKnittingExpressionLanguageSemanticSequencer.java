package com.knitml.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.Knit;
import com.knitml.dsl.knittingExpressionLanguage.KnittingExpressionLanguagePackage;
import com.knitml.dsl.knittingExpressionLanguage.Message;
import com.knitml.dsl.knittingExpressionLanguage.Pattern;
import com.knitml.dsl.knittingExpressionLanguage.Purl;
import com.knitml.dsl.knittingExpressionLanguage.Range;
import com.knitml.dsl.knittingExpressionLanguage.Repeat;
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec;
import com.knitml.dsl.knittingExpressionLanguage.Row;
import com.knitml.dsl.knittingExpressionLanguage.Slip;
import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractKnittingExpressionLanguageSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected KnittingExpressionLanguageGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == KnittingExpressionLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KnittingExpressionLanguagePackage.INSTRUCTION:
				if(context == grammarAccess.getBlockOperationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Instruction(context, (Instruction) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.KNIT:
				if(context == grammarAccess.getInlineOperationRule() ||
				   context == grammarAccess.getKnitRule()) {
					sequence_Knit(context, (Knit) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.MESSAGE:
				if(context == grammarAccess.getBlockOperationRule() ||
				   context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.PATTERN:
				if(context == grammarAccess.getPatternRule()) {
					sequence_Pattern(context, (Pattern) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.PURL:
				if(context == grammarAccess.getInlineOperationRule() ||
				   context == grammarAccess.getPurlRule()) {
					sequence_Purl(context, (Purl) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.RANGE:
				if(context == grammarAccess.getRangeRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.REPEAT:
				if(context == grammarAccess.getInlineOperationRule() ||
				   context == grammarAccess.getRepeatRule()) {
					sequence_Repeat(context, (Repeat) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.REPEAT_SPEC:
				if(context == grammarAccess.getRepeatSpecRule()) {
					sequence_RepeatSpec(context, (RepeatSpec) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.ROW:
				if(context == grammarAccess.getBlockOperationRule() ||
				   context == grammarAccess.getRowRule()) {
					sequence_Row(context, (Row) semanticObject); 
					return; 
				}
				else break;
			case KnittingExpressionLanguagePackage.SLIP:
				if(context == grammarAccess.getInlineOperationRule() ||
				   context == grammarAccess.getSlipRule()) {
					sequence_Slip(context, (Slip) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=ID label=STRING? ((hasKey?='key' messageKey=STRING?)? (shape='round' | shape='flat')? rowCount=INT?)? (rows+=Row+ | rows+=Row+))
	 */
	protected void sequence_Instruction(EObject context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=INT? together?='tog'? (throughTrailingLoop?='tbl' | throughTrailingLoop?='ttl')? yarnRef=ID? repeat=RepeatSpec?)
	 */
	protected void sequence_Knit(EObject context, Knit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KnittingExpressionLanguagePackage.Literals.MESSAGE__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KnittingExpressionLanguagePackage.Literals.MESSAGE__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_0_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=BlockOperation+
	 */
	protected void sequence_Pattern(EObject context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=INT? together?='tog'? (throughTrailingLoop?='tbl' | throughTrailingLoop?='ttl')? yarnRef=ID? repeat=RepeatSpec?)
	 */
	protected void sequence_Purl(EObject context, Purl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=INT max=INT)
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KnittingExpressionLanguagePackage.Literals.RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KnittingExpressionLanguagePackage.Literals.RANGE__MIN));
			if(transientValues.isValueTransient(semanticObject, KnittingExpressionLanguagePackage.Literals.RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KnittingExpressionLanguagePackage.Literals.RANGE__MAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_0_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_2_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         toEnd?='end' | 
	 *         toMarker?='marker' | 
	 *         (value=INT beforeEnd?='before end') | 
	 *         (value=INT beforeGap?='before gap') | 
	 *         (value=INT beforeMarker?='before marker') | 
	 *         (value=INT times?='times')
	 *     )
	 */
	protected void sequence_RepeatSpec(EObject context, RepeatSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operations+=InlineOperation operations+=InlineOperation* spec=RepeatSpec) | 
	 *         (operations+=InlineOperation operations+=InlineOperation* spec=RepeatSpec)
	 *     )
	 */
	protected void sequence_Repeat(EObject context, Repeat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         nextRow?='Next'? 
	 *         shortRow?='Short'? 
	 *         longRow?='Long'? 
	 *         (label='Row' | label='Round' | label='Rows' | label='Rounds') 
	 *         (range=Range | (number+=INT number+=INT* (subsequent='even' | subsequent='odd')?))? 
	 *         (side='WS' | side='RS')? 
	 *         yarnRef=ID? 
	 *         (inform?='inform'? reset?='reset'?)? 
	 *         operations+=InlineOperation 
	 *         operations+=InlineOperation*
	 *     )
	 */
	protected void sequence_Row(EObject context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (reverse?='Rev' | reverse?='Reverse' | reverse?='rev' | reverse?='reverse')? 
	 *         number=INT? 
	 *         (knitwise?='kw' | knitwise?='knitwise' | purlwise?='pw' | purlwise?='purlwise')? 
	 *         (yarnPosition='wyif' | yarnPosition='wyib')?
	 *     )
	 */
	protected void sequence_Slip(EObject context, Slip semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
