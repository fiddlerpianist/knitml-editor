package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.inline.Turn;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class TurnConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Turn> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Turn convert(com.knitml.dsl.knittingExpressionLanguage.Turn emfTurn) {
		def turn = new Turn()
		if (emfTurn.stateUnworked) {
			turn.informUnworkedStitches = true
			turn.stitchesLeft = emfTurn.number
		}
		return turn
	}
}
