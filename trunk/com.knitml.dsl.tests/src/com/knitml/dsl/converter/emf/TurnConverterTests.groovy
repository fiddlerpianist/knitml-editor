package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.SlipDirection
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.inline.Turn

class TurnConverterTests extends AbstractConverterTests {

	@Test
	void turn() {
		Pattern pattern = convert 'Row: turn'
		((Turn) pattern.directions.operations[0].operations[0]).with {
			assertThat stitchesLeft, is (null)
			assertThat informUnworkedStitches, is (false)
		}
	}
	@Test
	void turnStateUnworkedSts() {
		Pattern pattern = convert 'Row: turn (state unworked sts)'
		((Turn) pattern.directions.operations[0].operations[0]).with {
			assertThat stitchesLeft, is (null)
			assertThat informUnworkedStitches, is (true)
		}
	}
	@Test
	void turnState3UnworkedSts() {
		Pattern pattern = convert 'Row: turn (state 3 unworked sts)'
		((Turn) pattern.directions.operations[0].operations[0]).with {
			assertThat stitchesLeft, is (3)
			assertThat informUnworkedStitches, is (true)
		}
	}
}
