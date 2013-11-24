package com.nadeem.app.compare.mock.jmockit.case2;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case2.DependencyOne;
import com.nadeem.app.compare.mock.case2.DependencyTwo;
import com.nadeem.app.compare.mock.case2.MockMultipleDependencies;

public class MockMultipleDependenciesTest {

	@Test
    public void shouldMockDependency(@Mocked final DependencyOne one, @Mocked final DependencyTwo two) throws IOException {
		MockMultipleDependencies mockDependencies = new MockMultipleDependencies();
		mockDependencies.setDependencyOne(one);
		mockDependencies.setDependencyTwo(two);

        new Expectations() {{
            onInstance(one).message(); result = "I am mocked One!";

            onInstance(two).message(); result = "I am mocked Two!";
            
        }};
        assertThat(mockDependencies.go()).isEqualTo("I am mocked One! I am mocked Two!");
    }

}
