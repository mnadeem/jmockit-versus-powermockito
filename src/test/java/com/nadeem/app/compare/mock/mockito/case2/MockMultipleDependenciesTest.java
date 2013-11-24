package com.nadeem.app.compare.mock.mockito.case2;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.nadeem.app.compare.mock.case2.DependencyOne;
import com.nadeem.app.compare.mock.case2.DependencyTwo;
import com.nadeem.app.compare.mock.case2.MockMultipleDependencies;

@RunWith(MockitoJUnitRunner.class)
public class MockMultipleDependenciesTest {
	
	@Mock
	private DependencyOne dependencyOne;
	@Mock 
	private DependencyTwo dependencyTwo;
	
	public void doBeforeEachTestCase() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldMockMultipleDependencies() throws IOException {


		MockMultipleDependencies mockDependencies = new MockMultipleDependencies();
		mockDependencies.setDependencyOne(dependencyOne);
		mockDependencies.setDependencyTwo(dependencyTwo);

		when(dependencyOne.message()).thenReturn("I am mocked One!");
		when(dependencyTwo.message()).thenReturn("I am mocked Two!");
		assertThat(mockDependencies.go()).isEqualTo("I am mocked One! I am mocked Two!");
	}

}
