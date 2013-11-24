package com.nadeem.app.compare.mock.jmockit.case7;

import static junit.framework.Assert.assertEquals;
import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

import com.nadeem.app.compare.mock.case7.MockPrivateStatic;

public class MockPrivateStaticTest {

	@Test
	public void mockPrivateStaticeBehaviorBased() {

		final MockPrivateStatic mockStatic = new MockPrivateStatic();

		new Expectations(mockStatic) {

			{
				invoke(mockStatic, "world");
				result = "Private Static Jmockit!";
			}
		};
		assertEquals("Hello Private Static Jmockit!", MockPrivateStatic.go());
	}

	@Test
	public void mockPrivateStaticeBehaviorBased2() throws IOException {
		
		final MockPrivateStatic mockStatic = new MockPrivateStatic();
		new Expectations(mockStatic) {
			{
				invoke(MockPrivateStatic.class, "world");
				result = "Private Static Jmockit!";
			}
		};
		assertThat(MockPrivateStatic.go()).isEqualTo("Hello Private Static Jmockit!");
	}
	
	@Test
	public void mockPrivateStateBased() throws IOException {
		new MockedMockPrivateStatic();

		assertEquals("Hello Private Static Jmockit!", MockPrivateStatic.go());
	}
	
	private static class MockedMockPrivateStatic extends MockUp<MockPrivateStatic> {

		@Mock
		String world() {
			return "Private Static Jmockit!";
		}
	}

}
