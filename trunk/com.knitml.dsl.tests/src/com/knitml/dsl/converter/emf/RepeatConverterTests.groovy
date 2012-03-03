package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.core.model.operations.inline.Knit;
import com.knitml.core.model.operations.inline.Purl;
import com.knitml.core.model.operations.inline.Repeat;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.dsl.converter.emf.exception.ConversionException

class RepeatConverterTests extends AbstractConverterTests {

	@Test
	void repeatToEnd() {
		Pattern pattern = convert '''
			Row 1: repeat [k1, p1] to end
		''' 
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.END)
			assertThat it.operations.size(), is (2)
			assertThat it.operations[0], instanceOf (Knit)
			assertThat it.operations[1], instanceOf (Purl)
		}
	}
	@Test
	void repeatToMarker() {
		Pattern pattern = convert '''
			Row 1: repeat [k1] to marker
		''' 
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.MARKER)
			assertThat it.value, is (null)
		}
	}
	@Test
	void repeatToGap() {
		Pattern pattern = convert '''
			Row 1: repeat [k1] to 2 before gap
		''' 
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.BEFORE_GAP)
			assertThat it.value, is (2)
		}
	}
	@Test
	void repeatTo2BeforeEnd() {
		Pattern pattern = convert '''
			Row 1: repeat [k1] to 2 sts before end
		'''
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.BEFORE_END)
			assertThat it.value, is (2)
		}
	}
	@Test
	void repeatTo3BeforeMarker() {
		Pattern pattern = convert '''
			Row 1: repeat [k1] to 2 before marker
		'''
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.BEFORE_MARKER)
			assertThat it.value, is (2)
		}
	}
	@Test
	void repeat2Times() {
		Pattern pattern = convert '''
			Row 1: repeat [k1] 2 times
		'''
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat it.until, is (Until.TIMES)
			assertThat it.value, is (2)
		}
	}
	@Test(expected=ConversionException)
	void repeatInvalidSyntax() {
		Pattern pattern = convert '''Row 1: repeat [k1] to 2 times to end'''
	}

}
