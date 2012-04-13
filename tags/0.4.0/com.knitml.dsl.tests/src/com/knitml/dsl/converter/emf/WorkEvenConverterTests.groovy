package com.knitml.dsl.converter.emf

import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.LoopToWork
import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.core.model.operations.inline.DoubleDecrease;
import com.knitml.core.model.operations.inline.Knit;
import com.knitml.core.model.operations.inline.Repeat;
import com.knitml.core.model.operations.inline.WorkEven;
import com.knitml.core.model.pattern.Pattern;

class WorkEvenConverterTests extends AbstractConverterTests {

	@Test
	void workEven() {
		Pattern pattern = convert 'Row: Work even'
		((WorkEven) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}

	@Test
	void workEvenWithA() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: worsted weight yarn
				in red: A

			Row: work even with A
		'''
		((WorkEven) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is ('A')
		}
	}
	
	@Test
	void workToEnd() {
		Pattern pattern = convert 'Row: work to end'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat until, is (Until.END)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}

	@Test
	void workToMarker() {
		Pattern pattern = convert 'Row: work to marker'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat until, is (Until.MARKER)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}

	@Test
	void workTo3BeforeEnd() {
		Pattern pattern = convert 'Row: work to 3 before end'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_END)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}

	@Test
	void workTo3BeforeMarker() {
		Pattern pattern = convert 'Row: work to 3 before marker'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_MARKER)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}

	@Test
	void workTo3BeforeGap() {
		Pattern pattern = convert 'Row: work to 3 before gap'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_GAP)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}

	@Test
	void work3Times() {
		Pattern pattern = convert 'Row: work 3 times'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.TIMES)
			assertThat operations[0], instanceOf (WorkEven)
		}
	}
}
