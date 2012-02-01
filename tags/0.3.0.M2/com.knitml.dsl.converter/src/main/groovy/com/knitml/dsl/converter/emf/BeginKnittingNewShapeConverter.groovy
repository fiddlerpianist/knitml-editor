package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Side;
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.BlockOperation
import com.knitml.core.model.directions.block.DeclareFlatKnitting;
import com.knitml.core.model.directions.block.DeclareRoundKnitting;

public class BeginKnittingNewShapeConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.BeginKnittingNewShape> {

	static final Log log = LogFactory.getLog(BeginKnittingNewShapeConverter)

	@Override
	public BlockOperation convert(com.knitml.dsl.knittingExpressionLanguage.BeginKnittingNewShape emfObject) {
		if (emfObject.shape.equals('round')) {
			return new DeclareRoundKnitting()
		}
		def flatKnitting = new DeclareFlatKnitting()
		flatKnitting.nextRowSide = Side.RIGHT
		if (emfObject.side.equals('WS')) {
			flatKnitting.nextRowSide = Side.WRONG
		}
		return flatKnitting
	}
}
