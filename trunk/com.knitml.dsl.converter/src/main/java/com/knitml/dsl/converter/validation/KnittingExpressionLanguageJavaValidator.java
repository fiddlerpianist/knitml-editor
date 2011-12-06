package com.knitml.dsl.converter.validation;

import org.eclipse.xtext.validation.Check;

import com.knitml.dsl.knittingExpressionLanguage.Instruction;

public class KnittingExpressionLanguageJavaValidator extends com.knitml.dsl.validation.KnittingExpressionLanguageJavaValidator {

	@Check
	public void checkInstruction(Instruction instruction) {
	}

}
