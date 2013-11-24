package com.nadeem.app.compare.mock.mockito.case5;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case5.MockPrivateNonVoid;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateNonVoid.class)
public class MockPrivateNonVoidTest {

	@Test
	public void shouldMockPrivateBySpying() throws Exception {
		MockPrivateNonVoid spy = spy(new MockPrivateNonVoid());
		doReturn("PowerMockito!").when(spy, method(MockPrivateNonVoid.class, "world")).withNoArguments();
		assertThat(spy.go()).isEqualTo("Hello PowerMockito!");
	}
}
