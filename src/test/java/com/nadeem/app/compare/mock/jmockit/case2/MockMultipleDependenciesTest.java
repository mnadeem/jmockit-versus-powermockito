package com.nadeem.app.compare.mock.jmockit.case2;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case2.DependencyOne;
import com.nadeem.app.compare.mock.case2.DependencyTwo;
import com.nadeem.app.compare.mock.case2.MockMultipleDependencies;

public class MockMultipleDependenciesTest {

	@Test
    public void shouldMockDependencyBehaviorBased(@Mocked final DependencyOne one, @Mocked final DependencyTwo two) throws IOException {
		MockMultipleDependencies mockDependencies = new MockMultipleDependencies();
		mockDependencies.setDependencyOne(one);
		mockDependencies.setDependencyTwo(two);

        new Expectations() {{
            onInstance(one).message(); result = "I am mocked One!";

            onInstance(two).message(); result = "I am mocked Two!";
            
        }};
        assertThat(mockDependencies.go()).isEqualTo("I am mocked One! I am mocked Two!");
    }
	
	@Test
    public void shouldMockDependencyStateBased(@Mocked final DependencyOne one, @Mocked final DependencyTwo two) throws IOException {
		new MockedDependencyOne();
		new MockedDependencyTwo();
		MockMultipleDependencies mockDependencies = new MockMultipleDependencies();
		mockDependencies.setDependencyOne(one);
		mockDependencies.setDependencyTwo(two);
		assertThat(mockDependencies.go()).isEqualTo("I am mocked One! I am mocked Two!");
		
	}
	
	private static class MockedDependencyOne extends MockUp<DependencyOne> {
		@Mock
		public void $init()
		{

		}
		@Mock
		public String message() {
			return "I am mocked One!";
		}
	}
	
	private static class MockedDependencyTwo extends MockUp<DependencyTwo> {
		@Mock
		public void $init()
		{

		}
		@Mock
		public String message() {
			return "I am mocked Two!";
		}
	}

}
