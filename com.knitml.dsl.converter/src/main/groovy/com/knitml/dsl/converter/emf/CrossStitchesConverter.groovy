package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject;
import com.knitml.core.common.CrossType;
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.BlockOperation;
import com.knitml.core.model.operations.block.DeclareFlatKnitting;
import com.knitml.core.model.operations.block.DeclareRoundKnitting;
import com.knitml.core.model.operations.inline.CrossStitches;
import com.knitml.core.model.operations.inline.OperationGroup;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class CrossStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.CrossStitches> {

	static final Log log = LogFactory.getLog(CrossStitchesConverter)

	//	@Override
	//	public CrossStitches convert(com.knitml.dsl.knittingExpressionLanguage.CrossStitches emfObject) {
	//		CrossStitches crossStitches = new CrossStitches()
	//		crossStitches.first = emfObject.first
	//		crossStitches.next = emfObject.next
	//		if (emfObject.direction.equals('front')) {
	//			crossStitches.type = CrossType.FRONT
	//		} else {
	//			crossStitches.type = CrossType.BACK
	//		}
	//		return crossStitches
	//	}
	@Inject
	protected EmfHelper emfHelper

	@Override
	public OperationGroup convert(com.knitml.dsl.knittingExpressionLanguage.CrossStitches emfObject) {
		CrossStitches crossStitches = new CrossStitches()
		crossStitches.first = emfObject.first
		if (emfObject.third == null) {
			crossStitches.next = emfObject.second
		} else {
			crossStitches.skip = emfObject.second
			crossStitches.next = emfObject.third
		}
		com.knitml.dsl.knittingExpressionLanguage.CrossType.with {
			switch (emfObject.direction) {
				case LEFT:
					crossStitches.type = CrossType.FRONT
					if (emfObject.third != null) {
						crossStitches.skipType = CrossType.BACK
					}
					break;
				case LEFT_FRONT:
					crossStitches.type = CrossType.FRONT
					crossStitches.skipType = CrossType.FRONT
					break;
				case RIGHT:
					// right crosses switch the numbers
					def tmp = crossStitches.first
					crossStitches.first = crossStitches.next
					crossStitches.next = tmp

					crossStitches.type = CrossType.BACK
					if (emfObject.third != null) {
						crossStitches.skipType = CrossType.BACK
					}
					break;
				case RIGHT_FRONT:
					// right crosses switch the numbers
					def tmp = crossStitches.first
					crossStitches.first = crossStitches.next
					crossStitches.next = tmp
					
					crossStitches.type = CrossType.BACK
					crossStitches.skipType = CrossType.FRONT
					break;
				default:
					break;
			}
		}
		crossStitches.validate()
		int count = 0
		emfObject.with {
			count = first + second + (third == null ? 0 : third)
		}
		def ops = []
		ops << crossStitches
		ops.addAll(emfHelper.convertOperations (emfObject.operations))
		return new OperationGroup(count, ops)
	}
}
