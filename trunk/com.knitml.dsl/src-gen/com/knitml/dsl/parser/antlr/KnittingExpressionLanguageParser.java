/*
* generated by Xtext
*/
package com.knitml.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;

public class KnittingExpressionLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private KnittingExpressionLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.knitml.dsl.parser.antlr.internal.InternalKnittingExpressionLanguageParser createParser(XtextTokenStream stream) {
		return new com.knitml.dsl.parser.antlr.internal.InternalKnittingExpressionLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Pattern";
	}
	
	public KnittingExpressionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KnittingExpressionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}