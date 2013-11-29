package com.nadeem.app.compare.mock.jmockit.case14;

import static org.fest.assertions.api.Assertions.assertThat;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

import com.nadeem.app.compare.mock.case14.MockStaticInitializer;

public class MockStaticInitializerTest {

	@Test
	public void test() {
		new MockedMockStaticInitializer();
		assertThat(MockStaticInitializer.go()).isEqualTo("Mocked Value");
		
	}
	
	private class MockedMockStaticInitializer extends MockUp<MockStaticInitializer> {

		@Mock
		public void $clinit() {
			System.setProperty("key", "Mocked Value");
		}
		
	}

}
