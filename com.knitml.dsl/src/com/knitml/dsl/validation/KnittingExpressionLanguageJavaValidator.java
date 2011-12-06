package com.knitml.dsl.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.knitml.dsl.knittingExpressionLanguage.ArrangeStitches;
import com.knitml.dsl.knittingExpressionLanguage.Instruction;
import com.knitml.dsl.knittingExpressionLanguage.Knit;
import com.knitml.dsl.knittingExpressionLanguage.Needle;
import com.knitml.dsl.knittingExpressionLanguage.NeedleStitchCount;
import com.knitml.dsl.knittingExpressionLanguage.Purl;

public class KnittingExpressionLanguageJavaValidator extends
		AbstractKnittingExpressionLanguageJavaValidator {

	@Check
	public void checkKnitTogetherNotGreaterThan3(Knit knit) {
		if (knit.isTogether() && knit.getNumber() != null) {
			if (knit.getNumber() > 3) {
				error("Decreases greater than k3tog are not supported", null);
			} else if (knit.getNumber() == 3 && knit.isThroughTrailingLoop()) {
				warning("k3tog through trailing/back loop not supported by the model. Will become k3tog",
						null);
			}
		}
	}

	@Check
	public void checkPurlTogetherNotGreaterThan3(Purl purl) {
		if (purl.isTogether() && purl.getNumber() > 3) {
			error("Decreases greater than p3tog are not supported", null);
		}
	}

	@Check
	public void checkArrangeStitchesOnNeedleNotDuplicate(ArrangeStitches stitches) {
		Set<Needle> needles = new HashSet<Needle>();
		for (NeedleStitchCount stitchCount : stitches.getNeedleStitchCount()) {
			if (!needles.add(stitchCount.getNeedle())) {
				error("Needle cannot be used more than once", stitchCount, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
			}
		}
	}
	
}
