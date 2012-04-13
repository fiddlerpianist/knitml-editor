package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.Information;
import com.knitml.core.model.operations.information.Message;
import com.knitml.core.model.pattern.Pattern;

class MessageConverterTests extends AbstractConverterTests {

	@Test
	void message() {
		Pattern pattern = convert '''
			"The next row will look funny."
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is (null)
		}
	}

	@Test
	void messageKeyQuoted() {
		Pattern pattern = convert '''
			"The next row will look funny." (key 'msg-1')
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is ("msg-1")
		}
	}
	
	@Test
	void messageKeyAsId() {
		Pattern pattern = convert '''
			"The next row will look funny." (key messageOne)
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is ("messageOne")
		}
	}
}
