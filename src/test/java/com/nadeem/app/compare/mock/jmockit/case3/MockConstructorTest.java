package com.nadeem.app.compare.mock.jmockit.case3;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case3.Dependency;
import com.nadeem.app.compare.mock.case3.MockConstructor;

public class MockConstructorTest {

	private static final String EXPECTED_RESULT = "I am mocked";

	@Test
	public void constructorIsMockedSuccessfullyBehaviorBased(@Mocked(stubOutClassInitialization = false) final Dependency dep) throws IOException {
		MockConstructor mockConstructor = new MockConstructor();
		new Expectations() {{
			new Dependency();
			result = dep;
			dep.message();
			result = EXPECTED_RESULT;
		}};
		assertThat(mockConstructor.go()).isEqualTo(EXPECTED_RESULT);
	}

	@Test
	public void constructorIsMockedSuccessfullyStateBased() throws IOException {
		new MockedDependency();
		MockConstructor mockConstructor = new MockConstructor();
		assertThat(mockConstructor.go()).isEqualTo(EXPECTED_RESULT);
		
	}

	private static class MockedDependency extends MockUp<Dependency> {
		@Mock
		public void $init()
		{

		}
		@Mock
		public String message() {
			return EXPECTED_RESULT;
		}
	}

}
