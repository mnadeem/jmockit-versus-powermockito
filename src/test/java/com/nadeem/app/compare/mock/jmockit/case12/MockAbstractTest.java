package com.nadeem.app.compare.mock.jmockit.case12;

import static org.fest.assertions.api.Assertions.assertThat;
import mockit.Expectations;
import mockit.NonStrict;

import org.junit.Test;

import com.nadeem.app.compare.mock.case12.MockAbstract;

public class MockAbstractTest {

	@Test
	public void shouldMockAbstract(@NonStrict final MockAbstract mocked) {
		new Expectations() {{
			mocked.go();result = "I am mocked!";
		}};
		assertThat(mocked.go()).isEqualTo("I am mocked!");
	}

}
