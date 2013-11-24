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
        final MockPrivateVoid service = new MockPrivateVoid();
        new Expectations(service) {{
            invoke(service, "crashHorribly");
        }};
        assertEquals("I am original!", service.go());
    }

	@Test
    public void mockPrivateStateBased() throws IOException {
		new MockedMockPrivateVoid();
        final MockPrivateVoid service = new MockPrivateVoid();
       
        assertEquals("I am original!", service.go());
    }

	private static class MockedMockPrivateVoid extends MockUp<MockPrivateVoid> {
		
		@Mock
		void crashHorribly() {
			
		}
	}
	
}
