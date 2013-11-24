package com.nadeem.app.compare.mock.mockito.case1;



import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.nadeem.app.compare.mock.case1.Dependency;
import com.nadeem.app.compare.mock.case1.MockDependency;

@RunWith(MockitoJUnitRunner.class)
public class MockDependencyTest {

	@Test
	public void test() throws IOException {
		Dependency dependency = mock(Dependency.class);
		MockDependency mockDependency = new MockDependency(dependency);
		when(dependency.message()).thenReturn("I am mocked!");
		assertThat(mockDependency.go()).isEqualTo("I am mocked!");
	}
}
