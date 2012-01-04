package com.knitml.dsl.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class KnittingExpressionLanguageHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public TextStyle numberTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		return textStyle;
	}
	
}
