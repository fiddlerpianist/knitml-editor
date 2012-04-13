package com.knitml.dsl.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.knitml.dsl.knittingExpressionLanguage.ArrangeStitches;
import com.knitml.dsl.knittingExpressionLanguage.CrossStitches;
import com.knitml.dsl.knittingExpressionLanguage.CrossType;
import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.Needle;
import com.knitml.dsl.knittingExpressionLanguage.NeedleStitchCount;
import com.knitml.dsl.knittingExpressionLanguage.Row;

public class KnittingExpressionLanguageJavaValidator extends
		AbstractKnittingExpressionLanguageJavaValidator {

	@Check
	public void checkSingleRowNumber(Row row) {
		if (!(row.eContainer() instanceof Instruction)
				&& (row.getNumber().size() > 1 || row.getRange().size() > 0)) {
			error("A row with multiple row numbers must be specified within an instruction",
					null);
		}
	}

	@Check
	public void checkArrangeStitchesOnNeedleNotDuplicate(
			ArrangeStitches stitches) {
		Set<Needle> needles = new HashSet<Needle>();
		for (NeedleStitchCount stitchCount : stitches.getNeedleStitchCount()) {
			if (!needles.add(stitchCount.getNeedle())) {
				error("Needle cannot be used more than once", stitchCount,
						null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
			}
		}
	}

	@Check
	public void checkLRCorRRCHaveThreeNumbers(CrossStitches crossStitches) {
		if (crossStitches.getThird() == null
				&& (crossStitches.getDirection() == CrossType.LEFT_FRONT || crossStitches
						.getDirection() == CrossType.RIGHT_FRONT)) {
			error("LRC and RRC may only be used when three numbers are specified in the cross", null);
		}
	}

}
