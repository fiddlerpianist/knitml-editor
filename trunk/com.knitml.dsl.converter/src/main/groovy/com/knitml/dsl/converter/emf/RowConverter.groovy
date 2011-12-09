package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.common.RowDefinitionScope
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.Row
import com.knitml.core.model.directions.information.Information
import com.knitml.core.model.directions.information.Message
import com.knitml.core.model.directions.information.NumberOfStitches
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class RowConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Row> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Row convert(com.knitml.dsl.knittingExpressionLanguage.Row emfRow) {
		def row = new Row()
		def rowNumbers = [] 
		emfRow.number?.each {
			rowNumbers << it
		}
		emfRow.range?.each {
			int min = it.min
			int max = it.max
			if (min <= max) {
				def len = max-min+1
				for (int i = 0; i < len; i++) {
					rowNumbers << min + i
				}
			}
		}
		rowNumbers.sort()
		row.numbers = rowNumbers.size() == 0 ? null : rowNumbers.toArray()

		if (emfRow.label != null) {
			if (emfRow.label.toLowerCase().startsWith('round')) {
				row.type = KnittingShape.ROUND
			}
		}
		row.resetRowCount = emfRow.reset
		row.shortRow = emfRow.shortRow
		row.longRow = emfRow.longRow
		if (emfRow.nextRow) {
			row.assignRowNumber = false
		}
		
		if (emfRow.side?.toLowerCase().equals('ws')) {
			row.side = Side.WRONG
		} else if (emfRow.side?.toLowerCase().equals('rs')) {
			row.side = Side.RIGHT
		}
		if (emfRow.subsequent?.equals('even')) {
			row.subsequent = RowDefinitionScope.EVEN
		} else	if (emfRow.subsequent?.equals('odd')) {
			row.subsequent = RowDefinitionScope.ODD
		}
		row.informSide = emfRow.inform
		row.yarnIdRef = emfRow.yarnRef?.name
		row.operations = emfHelper.convertOperations (emfRow.operations)
		
		if (emfRow.stateStitches || emfRow.followupMessage != null) {
			row.followupInformation = new Information()
			row.followupInformation.details = []
			if (emfRow.stateStitches) {
				def numberOfStitches = new NumberOfStitches()
				numberOfStitches.number = emfRow.numberToState
				numberOfStitches.inform = (emfRow.numberToState == null)
				row.followupInformation.details << numberOfStitches
			}
			if (emfRow.followupMessage != null) {
				def message = new Message(emfRow.followupMessage)
				row.followupInformation.details << message
			}
		}
		return new Row(row, row.operations)
	}
}
