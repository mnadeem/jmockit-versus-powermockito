package com.nadeem.app.compare.mock.jmockit.case6;

import static junit.framework.Assert.assertEquals;
import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case6.DependencyContainingStatic;
import com.nadeem.app.compare.mock.case6.MockStatic;

public class MockStaticTest {

	@Test
	public void mockStaticeBehaviorBased() {

		final MockStatic mockStatic = new MockStatic();

		new Expectations() {
			DependencyContainingStatic dependencyContainingStatic;
			{
				invoke(dependencyContainingStatic, "world");
				result = "Static Jmockit!";
			}
		};
		assertEquals("Hello Static Jmockit!", mockStatic.go());
	}

	@Test
	public void mockStaticeBehaviorBased2(@Mocked final DependencyContainingStatic dependency) throws IOException {
		final MockStatic mockStatic = new MockStatic();
		new Expectations() {
			{
				invoke(dependency, "world");
				result = "Static Jmockit!";
			}
		};
		assertThat(mockStatic.go()).isEqualTo("Hello Static Jmockit!");
	}
	
	@Test
	public void mockPrivateStateBased() throws IOException {
		new MockedDependencyContainingStatic();
		final MockStatic mockPrivate = new MockStatic();

		assertEquals("Hello Jmockit!", mockPrivate.go());
	}

	private static class MockedDependencyContainingStatic extends MockUp<DependencyContainingStatic> {

		@Mock
		public String world() {
			return "Jmockit!";
		}
	}
}
