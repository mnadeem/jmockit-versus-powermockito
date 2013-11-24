package com.nadeem.app.compare.mock.mockito.case6;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case6.DependencyContainingStatic;
import com.nadeem.app.compare.mock.case6.MockStatic;


@RunWith(PowerMockRunner.class)
@PrepareForTest(DependencyContainingStatic.class)
public class MockStaticTest {
	
	@Test
	public void shouldMockStatic() throws Exception {

		mockStatic(DependencyContainingStatic.class);
		MockStatic mockStatic = new MockStatic();
		when(DependencyContainingStatic.world()).thenReturn("Static PowerMockito!");

		assertThat(mockStatic.go()).isEqualTo("Hello Static PowerMockito!");
	}

}
