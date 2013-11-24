package com.nadeem.app.compare.mock.mockito.case7;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.spy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case7.MockPrivateStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateStatic.class)
public class MockPrivateStaticTest {

	@Test
	public void shouldMockPrivateStatic() throws Exception {
		spy(MockPrivateStatic.class);
		doReturn("PowerMockito!").when(MockPrivateStatic.class, "world");
		assertThat(MockPrivateStatic.go()).isEqualTo("Hello PowerMockito!");
	}

}
