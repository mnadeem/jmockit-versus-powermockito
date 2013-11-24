package com.nadeem.app.compare.mock.mockito.case3;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.whenNew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case3.Dependency;
import com.nadeem.app.compare.mock.case3.MockConstructor;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockConstructor.class)
public class MockConstructorTest {

	@Test
	public void constructorIsMockedSuccessfully() throws Exception {
		Dependency dependency = Mockito.mock(Dependency.class);
		whenNew(Dependency.class).withNoArguments().thenReturn(dependency);
		Mockito.when(dependency.message()).thenReturn("I am mocked");
		MockConstructor targetBeingTested = new MockConstructor();
		
		assertThat(targetBeingTested.go()).isEqualTo("I am mocked");
	}

}
