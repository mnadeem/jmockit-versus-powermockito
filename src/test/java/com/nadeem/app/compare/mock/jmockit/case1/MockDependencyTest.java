package com.nadeem.app.compare.mock.jmockit.case1;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case1.Dependency;
import com.nadeem.app.compare.mock.case1.MockDependency;

public class MockDependencyTest {

	@Test
    public void shouldMockDependencyBehaviorBased(@Mocked final Dependency dependency) throws IOException {
		MockDependency mockDependency = new MockDependency(dependency);
        new Expectations() {{
            dependency.message();
            result = "I am mocked!";
        }};
        assertThat(mockDependency.go()).isEqualTo("I am mocked!");
    }

	@Test
    public void shouldMockDependencyStateBased(@Mocked final Dependency dependency) throws IOException {

		new MockedDependency();
		MockDependency mockDependency = new MockDependency(dependency);
        
        assertThat(mockDependency.go()).isEqualTo("I am mocked!");
    }

	private static class MockedDependency extends MockUp<Dependency> {

		@Mock
		public String message() {
			return "I am mocked!";
		}
	}
}
