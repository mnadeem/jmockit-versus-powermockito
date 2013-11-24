package com.nadeem.app.compare.mock.jmockit.case5;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

import com.nadeem.app.compare.mock.case5.MockPrivateNonVoid;

public class MockPrivateNonVoidTest {

	@Test
	public void mockPrivateBehaviorBased() {

		final MockPrivateNonVoid mockPrivateNonVoid = new MockPrivateNonVoid();
		new Expectations(mockPrivateNonVoid) {
			{
				invoke(mockPrivateNonVoid, "world");
				result = "Jmockit!";
			}
		};
		assertEquals("Hello Jmockit!", mockPrivateNonVoid.go());
	}

	@Test
	public void mockPrivateStateBased() throws IOException {
		new MockedMockPrivateNonVoid();
		final MockPrivateNonVoid mockPrivate = new MockPrivateNonVoid();

		assertEquals("Hello Jmockit!", mockPrivate.go());
	}

	private static class MockedMockPrivateNonVoid extends
			MockUp<MockPrivateNonVoid> {

		@Mock
		String world() {
			return "Jmockit!";
		}
	}

}
