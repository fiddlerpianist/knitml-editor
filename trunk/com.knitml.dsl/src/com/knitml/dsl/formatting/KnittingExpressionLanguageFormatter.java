package com.knitml.dsl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;

/**
 * This class contains formatting rules for the grammar.
 */
public class KnittingExpressionLanguageFormatter extends
		AbstractDeclarativeFormatter {

	@Override
	protected KnittingExpressionLanguageGrammarAccess getGrammarAccess() {
		return (KnittingExpressionLanguageGrammarAccess) super
				.getGrammarAccess();
	}

	@Override
	protected void configureFormatting(FormattingConfig c) {
		KnittingExpressionLanguageGrammarAccess gr = getGrammarAccess();
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setAutoLinewrap(300);
		
		c.setLinewrap(0, 1, 2).before(gr.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(gr.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(gr.getML_COMMENTRule());

		c.setNoSpace().before(gr.getLFRule());
		
		// Needles
		c.setIndentationIncrement().before(
				gr.getHeaderAccess().getGroup_7_7_2());
		c.setIndentationDecrement()
				.after(gr.getHeaderAccess().getGroup_7_7_2());
		// NeedleType
		c.setIndentationIncrement().before(
				gr.getNeedleTypeAccess().getGroup_2());
		c.setIndentationDecrement()
				.after(gr.getNeedleTypeAccess().getGroup_2());

		// Yarn
		c.setIndentationIncrement().before(
				gr.getHeaderAccess().getGroup_7_8_2());
		c.setIndentationDecrement()
				.after(gr.getHeaderAccess().getGroup_7_8_2());
		// MultipleYarnsWithYarnType
		c.setIndentationIncrement().before(
				gr.getMultipleYarnsWithYarnTypeAccess().getGroup_1());
		c.setIndentationDecrement().after(
				gr.getMultipleYarnsWithYarnTypeAccess().getGroup_1());
		// Stitch Holders
		c.setIndentationIncrement().before(
				gr.getHeaderAccess().getGroup_7_9_3());
		c.setIndentationDecrement()
				.after(gr.getHeaderAccess().getGroup_7_9_3());

		// Instructions
		c.setIndentationIncrement().before(
				gr.getHeaderAccess().getInstructionsAssignment_7_11_2());
		c.setIndentationDecrement().after(
				gr.getHeaderAccess().getInstructionsAssignment_7_11_2());
		// InstructionDefinition
		c.setIndentationIncrement().before(
				gr.getInstructionDefinitionRuleAccess().getRowsAssignment_11());
		c.setIndentationDecrement().after(
				gr.getInstructionDefinitionRuleAccess().getRowsAssignment_11());

		// InstructionGroup
		c.setIndentationIncrement().before(
				gr.getInstructionGroupAccess().getGroup_6());
		c.setIndentationDecrement().after(
				gr.getInstructionGroupAccess().getGroup_6());
		c.setIndentationIncrement().before(
				gr.getInstructionGroupWithSectionsAccess().getGroup_6());
		c.setIndentationDecrement().after(
				gr.getInstructionGroupWithSectionsAccess().getGroup_6());

		// Instruction
		c.setIndentationIncrement().before(
				gr.getInstructionRuleAccess().getGroup_4_0_2());
		c.setIndentationDecrement().after(
				gr.getInstructionRuleAccess().getGroup_4_0_2());
		c.setIndentationIncrement().before(
				gr.getInstructionRuleAccess().getAlternatives_4_1_2());
		c.setIndentationDecrement().after(
				gr.getInstructionRuleAccess().getAlternatives_4_1_2());

		// Row
		c.setIndentationIncrement().before(
				gr.getRowAccess().getAlternatives_8());
		c.setIndentationDecrement()
				.after(gr.getRowAccess().getAlternatives_8());

		// ForEachRowInInstruction
		c.setIndentationIncrement().before(
				gr.getForEachRowInInstructionAccess().getAlternatives_8());
		c.setIndentationDecrement().after(
				gr.getForEachRowInInstructionAccess().getAlternatives_8());

		// Using Needle
		c.setIndentationIncrement().before(
				gr.getUsingNeedleAccess().getGroup_4());
		c.setIndentationDecrement().after(
				gr.getUsingNeedleAccess().getGroup_4());

		// format k2, k2tog
		c.setNoSpace().after(gr.getKnitAccess().getKKeyword_0_0_0_0());
		c.setNoSpace().after(gr.getKnitAccess().getKKeyword_0_0_0_1());
		c.setNoSpace().before(gr.getKnitAccess().getTogetherAssignment_0_0_2());

		// format p2, p2tog
		c.setNoSpace().after(gr.getPurlAccess().getPKeyword_0_0_0_0());
		c.setNoSpace().after(gr.getPurlAccess().getPKeyword_0_0_0_1());
		c.setNoSpace().before(gr.getPurlAccess().getTogetherAssignment_0_0_2());

		// format Rows 1-3
		c.setNoSpace().after(gr.getRangeAccess().getMinAssignment_0());
		c.setNoSpace().before(gr.getRangeAccess().getMaxAssignment_2());

		for (Keyword comma : gr.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}
		for (Keyword colon : gr.findKeywords(":")) {
			c.setNoSpace().before(colon);
		}
		for (Pair<Keyword, Keyword> pair : gr.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : gr.findKeywordPairs("[", "]")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}

	}
}
