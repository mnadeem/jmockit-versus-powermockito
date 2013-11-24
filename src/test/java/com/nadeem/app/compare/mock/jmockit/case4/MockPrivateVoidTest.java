package com.nadeem.app.compare.mock.jmockit.case4;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

import com.nadeem.app.compare.mock.case4.MockPrivateVoid;

public class MockPrivateVoidTest {

	@Test
    public void mockPrivateBehaviorBased() throws IOException {
        final MockPrivateVoid mockPrivate = new MockPrivateVoid();
        new Expectations(mockPrivate) {{
            invoke(mockPrivate, "crashHorribly");
        }};
        assertEquals("I am original!", mockPrivate.go());
    }

	@Test
    public void mockPrivateStateBased() throws IOException {
		new MockedMockPrivateVoid();
        final MockPrivateVoid mockPrivate = new MockPrivateVoid();
       
        assertEquals("I am original!", mockPrivate.go());
    }

	private static class MockedMockPrivateVoid extends MockUp<MockPrivateVoid> {

		@Mock
		void crashHorribly() {
			
		}
	}
	
}
