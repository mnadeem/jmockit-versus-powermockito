package com.nadeem.app.compare.mock.jmockit.case13;

import static org.fest.assertions.api.Assertions.assertThat;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case13.MockFinal;

public class MockFinalTest {

	@Test
	public void test(@Mocked final MockFinal mocked) {
		new Expectations() { {
			mocked.go(); result = "I am mocked!";
		}};
		assertThat(mocked.go()).isEqualTo("I am mocked!");
	}

}
