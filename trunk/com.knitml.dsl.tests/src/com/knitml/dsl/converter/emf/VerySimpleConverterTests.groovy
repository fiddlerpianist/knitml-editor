package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.Side
import com.knitml.core.model.operations.block.DeclareFlatKnitting;
import com.knitml.core.model.operations.block.DeclareRoundKnitting;
import com.knitml.core.model.operations.block.JoinInRound;
import com.knitml.core.model.operations.inline.DesignateEndOfRow;
import com.knitml.core.model.operations.inline.NoStitch;
import com.knitml.core.model.operations.inline.PlaceMarker;
import com.knitml.core.model.operations.inline.RemoveMarker;
import com.knitml.core.model.pattern.Pattern;

class VerySimpleConverterTests extends AbstractConverterTests {

	@Test
	void joinInRound() {
		Pattern pattern = convert '''
		Join in round
		'''
		assertThat pattern.directions.operations[0], instanceOf (JoinInRound)
	}
	@Test
	void joinTogetherInRound() {
		Pattern pattern = convert '''
		Join together in round
		'''
		assertThat pattern.directions.operations[0], instanceOf (JoinInRound)
	}
	@Test
	void beginKnittingInTheRound() {
		Pattern pattern = convert '''Begin knitting in the round
		'''
		assertThat pattern.directions.operations[0], instanceOf (DeclareRoundKnitting)
	}
	@Test
	void beginKnittingFlatWithWSRowNext() {
		Pattern pattern = convert '''Begin knitting flat with WS row next
		'''
		assertThat pattern.directions.operations[0], instanceOf (DeclareFlatKnitting)
		assertThat pattern.directions.operations[0].nextRowSide, is (Side.WRONG)
	}
	@Test
	void beginKnittingFlatWithRSRowNext() {
		Pattern pattern = convert '''Begin knitting flat with RS row next
		'''
		assertThat pattern.directions.operations[0], instanceOf (DeclareFlatKnitting)
		assertThat pattern.directions.operations[0].nextRowSide, is (Side.RIGHT)
	}
	@Test
	void placeMarker() {
		Pattern pattern = convert 'Row: place marker'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (PlaceMarker)
	}
	@Test
	void pm() {
		Pattern pattern = convert 'Row: pm'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (PlaceMarker)
	}
	@Test
	void removeMarker() {
		Pattern pattern = convert 'Row: remove marker'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (RemoveMarker)
	}
	@Test
	void rm() {
		Pattern pattern = convert 'Row: rm'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (RemoveMarker)
	}
	@Test
	void endOfRow() {
		Pattern pattern = convert 'Row: end of row'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (DesignateEndOfRow)
	}
	@Test
	void endOfRound() {
		Pattern pattern = convert 'Row: end of round'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (DesignateEndOfRow)
	}
	@Test
	void noStitch() {
		Pattern pattern = convert 'Row: ns'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (NoStitch)
		assertThat pattern.directions.operations[0].operations[0].numberOfStitches, is (null)
	}
	@Test
	void noStitchWithValue() {
		Pattern pattern = convert 'Row: ns10'
		assertThat pattern.directions.operations[0].operations[0], instanceOf (NoStitch)
		assertThat pattern.directions.operations[0].operations[0].numberOfStitches, is (10)
	}
}
