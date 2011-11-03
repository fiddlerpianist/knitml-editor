package com.knitml.dsl.serializer;

import com.google.inject.Inject;
import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractKnittingExpressionLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KnittingExpressionLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Instruction_CommaKeyword_2_2_0_q;
	protected AbstractElementAlias match_Instruction_CommaKeyword_2_3_0_q;
	protected AbstractElementAlias match_Instruction_LFTerminalRuleCall_3_0_1_a;
	protected AbstractElementAlias match_Instruction_LFTerminalRuleCall_3_0_4_q;
	protected AbstractElementAlias match_Instruction_ShapeKeyword_2_2_2_q;
	protected AbstractElementAlias match_Instruction___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_4__q;
	protected AbstractElementAlias match_Instruction___RoundsKeyword_2_3_2_1_or_RowsKeyword_2_3_2_0__q;
	protected AbstractElementAlias match_Knit_KKeyword_0_0_or_KKeyword_0_1_or_KnitKeyword_0_2_or_KnitKeyword_0_3;
	protected AbstractElementAlias match_Knit_StKeyword_3_0_q_or_StsKeyword_3_1_q;
	protected AbstractElementAlias match_Knit_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Knit___StKeyword_3_0_or_StsKeyword_3_1__q;
	protected AbstractElementAlias match_Pattern_LFTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Pattern_LFTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Purl_PKeyword_0_0_or_PKeyword_0_1_or_PurlKeyword_0_2_or_PurlKeyword_0_3;
	protected AbstractElementAlias match_Purl_StKeyword_3_0_q_or_StsKeyword_3_1_q;
	protected AbstractElementAlias match_Purl_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Purl___StKeyword_3_0_or_StsKeyword_3_1__q;
	protected AbstractElementAlias match_RepeatSpec___StKeyword_2_1_0_or_StsKeyword_2_1_1__q;
	protected AbstractElementAlias match_RepeatSpec___StKeyword_3_1_0_or_StsKeyword_3_1_1__q;
	protected AbstractElementAlias match_RepeatSpec___StKeyword_4_1_0_or_StsKeyword_4_1_1__q;
	protected AbstractElementAlias match_Repeat_RepeatKeyword_0_0_0_or_RepeatKeyword_0_0_1;
	protected AbstractElementAlias match_Repeat_ToKeyword_0_5_q;
	protected AbstractElementAlias match_Repeat_ToKeyword_1_5_q;
	protected AbstractElementAlias match_Repeat___CommaKeyword_1_4_0___RepeatKeyword_1_4_1_0_or_RepeatKeyword_1_4_1_1____q;
	protected AbstractElementAlias match_Row_AllKeyword_3_1_2_1_q;
	protected AbstractElementAlias match_Row_CommaKeyword_5_1_0_q;
	protected AbstractElementAlias match_Row_CommaKeyword_5_2_0_q;
	protected AbstractElementAlias match_Row_CountKeyword_5_2_2_q;
	protected AbstractElementAlias match_Row_LFTerminalRuleCall_10_q;
	protected AbstractElementAlias match_Row_LFTerminalRuleCall_7_q;
	protected AbstractElementAlias match_Row_SideKeyword_5_1_2_q;
	protected AbstractElementAlias match_Row___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_3__q;
	protected AbstractElementAlias match_Row___RoundsKeyword_3_1_2_3_1_or_RowsKeyword_3_1_2_3_0__q;
	protected AbstractElementAlias match_Slip_NextStKeyword_3_1_q;
	protected AbstractElementAlias match_Slip_SlKeyword_2_0_or_SlKeyword_2_1_or_SlipKeyword_2_2_or_SlipKeyword_2_3;
	protected AbstractElementAlias match_Slip___StKeyword_3_0_1_0_or_StsKeyword_3_0_1_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KnittingExpressionLanguageGrammarAccess) access;
		match_Instruction_CommaKeyword_2_2_0_q = new TokenAlias(true, false, grammarAccess.getInstructionAccess().getCommaKeyword_2_2_0());
		match_Instruction_CommaKeyword_2_3_0_q = new TokenAlias(true, false, grammarAccess.getInstructionAccess().getCommaKeyword_2_3_0());
		match_Instruction_LFTerminalRuleCall_3_0_1_a = new TokenAlias(true, true, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_1());
		match_Instruction_LFTerminalRuleCall_3_0_4_q = new TokenAlias(true, false, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_4());
		match_Instruction_ShapeKeyword_2_2_2_q = new TokenAlias(true, false, grammarAccess.getInstructionAccess().getShapeKeyword_2_2_2());
		match_Instruction___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_4__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getInstructionAccess().getRightParenthesisKeyword_2_4()));
		match_Instruction___RoundsKeyword_2_3_2_1_or_RowsKeyword_2_3_2_0__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getInstructionAccess().getRoundsKeyword_2_3_2_1()), new TokenAlias(false, false, grammarAccess.getInstructionAccess().getRowsKeyword_2_3_2_0()));
		match_Knit_KKeyword_0_0_or_KKeyword_0_1_or_KnitKeyword_0_2_or_KnitKeyword_0_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKnitAccess().getKKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getKnitAccess().getKKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getKnitAccess().getKnitKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getKnitAccess().getKnitKeyword_0_3()));
		match_Knit_StKeyword_3_0_q_or_StsKeyword_3_1_q = new AlternativeAlias(false, false, new TokenAlias(true, false, grammarAccess.getKnitAccess().getStKeyword_3_0()), new TokenAlias(true, false, grammarAccess.getKnitAccess().getStsKeyword_3_1()));
		match_Knit_ToKeyword_6_0_q = new TokenAlias(true, false, grammarAccess.getKnitAccess().getToKeyword_6_0());
		match_Knit___StKeyword_3_0_or_StsKeyword_3_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getKnitAccess().getStKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKnitAccess().getStsKeyword_3_1()));
		match_Pattern_LFTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getPatternAccess().getLFTerminalRuleCall_0());
		match_Pattern_LFTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getPatternAccess().getLFTerminalRuleCall_2());
		match_Purl_PKeyword_0_0_or_PKeyword_0_1_or_PurlKeyword_0_2_or_PurlKeyword_0_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPurlAccess().getPKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPurlAccess().getPKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getPurlAccess().getPurlKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getPurlAccess().getPurlKeyword_0_3()));
		match_Purl_StKeyword_3_0_q_or_StsKeyword_3_1_q = new AlternativeAlias(false, false, new TokenAlias(true, false, grammarAccess.getPurlAccess().getStKeyword_3_0()), new TokenAlias(true, false, grammarAccess.getPurlAccess().getStsKeyword_3_1()));
		match_Purl_ToKeyword_6_0_q = new TokenAlias(true, false, grammarAccess.getPurlAccess().getToKeyword_6_0());
		match_Purl___StKeyword_3_0_or_StsKeyword_3_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getPurlAccess().getStKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPurlAccess().getStsKeyword_3_1()));
		match_RepeatSpec___StKeyword_2_1_0_or_StsKeyword_2_1_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1()));
		match_RepeatSpec___StKeyword_3_1_0_or_StsKeyword_3_1_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1()));
		match_RepeatSpec___StKeyword_4_1_0_or_StsKeyword_4_1_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0()), new TokenAlias(false, false, grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1()));
		match_Repeat_RepeatKeyword_0_0_0_or_RepeatKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1()));
		match_Repeat_ToKeyword_0_5_q = new TokenAlias(true, false, grammarAccess.getRepeatAccess().getToKeyword_0_5());
		match_Repeat_ToKeyword_1_5_q = new TokenAlias(true, false, grammarAccess.getRepeatAccess().getToKeyword_1_5());
		match_Repeat___CommaKeyword_1_4_0___RepeatKeyword_1_4_1_0_or_RepeatKeyword_1_4_1_1____q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0()), new TokenAlias(false, false, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1())));
		match_Row_AllKeyword_3_1_2_1_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getAllKeyword_3_1_2_1());
		match_Row_CommaKeyword_5_1_0_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getCommaKeyword_5_1_0());
		match_Row_CommaKeyword_5_2_0_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getCommaKeyword_5_2_0());
		match_Row_CountKeyword_5_2_2_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getCountKeyword_5_2_2());
		match_Row_LFTerminalRuleCall_10_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getLFTerminalRuleCall_10());
		match_Row_LFTerminalRuleCall_7_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getLFTerminalRuleCall_7());
		match_Row_SideKeyword_5_1_2_q = new TokenAlias(true, false, grammarAccess.getRowAccess().getSideKeyword_5_1_2());
		match_Row___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3()));
		match_Row___RoundsKeyword_3_1_2_3_1_or_RowsKeyword_3_1_2_3_0__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getRowAccess().getRoundsKeyword_3_1_2_3_1()), new TokenAlias(false, false, grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0()));
		match_Slip_NextStKeyword_3_1_q = new TokenAlias(true, false, grammarAccess.getSlipAccess().getNextStKeyword_3_1());
		match_Slip_SlKeyword_2_0_or_SlKeyword_2_1_or_SlipKeyword_2_2_or_SlipKeyword_2_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlipAccess().getSlKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getSlipAccess().getSlKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getSlipAccess().getSlipKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getSlipAccess().getSlipKeyword_2_3()));
		match_Slip___StKeyword_3_0_1_0_or_StsKeyword_3_0_1_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getSlipAccess().getStKeyword_3_0_1_0()), new TokenAlias(false, false, grammarAccess.getSlipAccess().getStsKeyword_3_0_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getLFRule())
			return getLFToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getLFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Instruction_CommaKeyword_2_2_0_q.equals(syntax))
				emit_Instruction_CommaKeyword_2_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_CommaKeyword_2_3_0_q.equals(syntax))
				emit_Instruction_CommaKeyword_2_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_LFTerminalRuleCall_3_0_1_a.equals(syntax))
				emit_Instruction_LFTerminalRuleCall_3_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_LFTerminalRuleCall_3_0_4_q.equals(syntax))
				emit_Instruction_LFTerminalRuleCall_3_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_ShapeKeyword_2_2_2_q.equals(syntax))
				emit_Instruction_ShapeKeyword_2_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_4__q.equals(syntax))
				emit_Instruction___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction___RoundsKeyword_2_3_2_1_or_RowsKeyword_2_3_2_0__q.equals(syntax))
				emit_Instruction___RoundsKeyword_2_3_2_1_or_RowsKeyword_2_3_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Knit_KKeyword_0_0_or_KKeyword_0_1_or_KnitKeyword_0_2_or_KnitKeyword_0_3.equals(syntax))
				emit_Knit_KKeyword_0_0_or_KKeyword_0_1_or_KnitKeyword_0_2_or_KnitKeyword_0_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Knit_StKeyword_3_0_q_or_StsKeyword_3_1_q.equals(syntax))
				emit_Knit_StKeyword_3_0_q_or_StsKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Knit_ToKeyword_6_0_q.equals(syntax))
				emit_Knit_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Knit___StKeyword_3_0_or_StsKeyword_3_1__q.equals(syntax))
				emit_Knit___StKeyword_3_0_or_StsKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Pattern_LFTerminalRuleCall_0_a.equals(syntax))
				emit_Pattern_LFTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Pattern_LFTerminalRuleCall_2_a.equals(syntax))
				emit_Pattern_LFTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Purl_PKeyword_0_0_or_PKeyword_0_1_or_PurlKeyword_0_2_or_PurlKeyword_0_3.equals(syntax))
				emit_Purl_PKeyword_0_0_or_PKeyword_0_1_or_PurlKeyword_0_2_or_PurlKeyword_0_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Purl_StKeyword_3_0_q_or_StsKeyword_3_1_q.equals(syntax))
				emit_Purl_StKeyword_3_0_q_or_StsKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Purl_ToKeyword_6_0_q.equals(syntax))
				emit_Purl_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Purl___StKeyword_3_0_or_StsKeyword_3_1__q.equals(syntax))
				emit_Purl___StKeyword_3_0_or_StsKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RepeatSpec___StKeyword_2_1_0_or_StsKeyword_2_1_1__q.equals(syntax))
				emit_RepeatSpec___StKeyword_2_1_0_or_StsKeyword_2_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RepeatSpec___StKeyword_3_1_0_or_StsKeyword_3_1_1__q.equals(syntax))
				emit_RepeatSpec___StKeyword_3_1_0_or_StsKeyword_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RepeatSpec___StKeyword_4_1_0_or_StsKeyword_4_1_1__q.equals(syntax))
				emit_RepeatSpec___StKeyword_4_1_0_or_StsKeyword_4_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Repeat_RepeatKeyword_0_0_0_or_RepeatKeyword_0_0_1.equals(syntax))
				emit_Repeat_RepeatKeyword_0_0_0_or_RepeatKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Repeat_ToKeyword_0_5_q.equals(syntax))
				emit_Repeat_ToKeyword_0_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Repeat_ToKeyword_1_5_q.equals(syntax))
				emit_Repeat_ToKeyword_1_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Repeat___CommaKeyword_1_4_0___RepeatKeyword_1_4_1_0_or_RepeatKeyword_1_4_1_1____q.equals(syntax))
				emit_Repeat___CommaKeyword_1_4_0___RepeatKeyword_1_4_1_0_or_RepeatKeyword_1_4_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_AllKeyword_3_1_2_1_q.equals(syntax))
				emit_Row_AllKeyword_3_1_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_CommaKeyword_5_1_0_q.equals(syntax))
				emit_Row_CommaKeyword_5_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_CommaKeyword_5_2_0_q.equals(syntax))
				emit_Row_CommaKeyword_5_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_CountKeyword_5_2_2_q.equals(syntax))
				emit_Row_CountKeyword_5_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_LFTerminalRuleCall_10_q.equals(syntax))
				emit_Row_LFTerminalRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_LFTerminalRuleCall_7_q.equals(syntax))
				emit_Row_LFTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row_SideKeyword_5_1_2_q.equals(syntax))
				emit_Row_SideKeyword_5_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_3__q.equals(syntax))
				emit_Row___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Row___RoundsKeyword_3_1_2_3_1_or_RowsKeyword_3_1_2_3_0__q.equals(syntax))
				emit_Row___RoundsKeyword_3_1_2_3_1_or_RowsKeyword_3_1_2_3_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Slip_NextStKeyword_3_1_q.equals(syntax))
				emit_Slip_NextStKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Slip_SlKeyword_2_0_or_SlKeyword_2_1_or_SlipKeyword_2_2_or_SlipKeyword_2_3.equals(syntax))
				emit_Slip_SlKeyword_2_0_or_SlKeyword_2_1_or_SlipKeyword_2_2_or_SlipKeyword_2_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Slip___StKeyword_3_0_1_0_or_StsKeyword_3_0_1_1__q.equals(syntax))
				emit_Slip___StKeyword_3_0_1_0_or_StsKeyword_3_0_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Instruction_CommaKeyword_2_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Instruction_CommaKeyword_2_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF*
	 */
	protected void emit_Instruction_LFTerminalRuleCall_3_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF?
	 */
	protected void emit_Instruction_LFTerminalRuleCall_3_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'shape'?
	 */
	protected void emit_Instruction_ShapeKeyword_2_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Instruction___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('rounds' | 'rows')?
	 */
	protected void emit_Instruction___RoundsKeyword_2_3_2_1_or_RowsKeyword_2_3_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'k' | 'Knit' | 'K' | 'knit'
	 */
	protected void emit_Knit_KKeyword_0_0_or_KKeyword_0_1_or_KnitKeyword_0_2_or_KnitKeyword_0_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'st'? | 'sts'?
	 */
	protected void emit_Knit_StKeyword_3_0_q_or_StsKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Knit_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('st' | 'sts')?
	 */
	protected void emit_Knit___StKeyword_3_0_or_StsKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF*
	 */
	protected void emit_Pattern_LFTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF*
	 */
	protected void emit_Pattern_LFTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'p' | 'purl' | 'P' | 'Purl'
	 */
	protected void emit_Purl_PKeyword_0_0_or_PKeyword_0_1_or_PurlKeyword_0_2_or_PurlKeyword_0_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'st'? | 'sts'?
	 */
	protected void emit_Purl_StKeyword_3_0_q_or_StsKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Purl_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sts' | 'st')?
	 */
	protected void emit_Purl___StKeyword_3_0_or_StsKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sts' | 'st')?
	 */
	protected void emit_RepeatSpec___StKeyword_2_1_0_or_StsKeyword_2_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('st' | 'sts')?
	 */
	protected void emit_RepeatSpec___StKeyword_3_1_0_or_StsKeyword_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('st' | 'sts')?
	 */
	protected void emit_RepeatSpec___StKeyword_4_1_0_or_StsKeyword_4_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'repeat' | 'Repeat'
	 */
	protected void emit_Repeat_RepeatKeyword_0_0_0_or_RepeatKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Repeat_ToKeyword_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Repeat_ToKeyword_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ('Repeat' | 'repeat'))?
	 */
	protected void emit_Repeat___CommaKeyword_1_4_0___RepeatKeyword_1_4_1_0_or_RepeatKeyword_1_4_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'all'?
	 */
	protected void emit_Row_AllKeyword_3_1_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Row_CommaKeyword_5_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Row_CommaKeyword_5_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'count'?
	 */
	protected void emit_Row_CountKeyword_5_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF?
	 */
	protected void emit_Row_LFTerminalRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LF?
	 */
	protected void emit_Row_LFTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'side'?
	 */
	protected void emit_Row_SideKeyword_5_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Row___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('rounds' | 'rows')?
	 */
	protected void emit_Row___RoundsKeyword_3_1_2_3_1_or_RowsKeyword_3_1_2_3_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'next st'?
	 */
	protected void emit_Slip_NextStKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'sl' | 'Slip' | 'Sl' | 'slip'
	 */
	protected void emit_Slip_SlKeyword_2_0_or_SlKeyword_2_1_or_SlipKeyword_2_2_or_SlipKeyword_2_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('st' | 'sts')?
	 */
	protected void emit_Slip___StKeyword_3_0_1_0_or_StsKeyword_3_0_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
