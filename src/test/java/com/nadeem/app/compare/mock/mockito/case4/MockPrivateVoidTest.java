package com.nadeem.app.compare.mock.mockito.case4;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import static org.powermock.api.support.membermodification.MemberModifier.suppress;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case4.MockPrivateVoid;


@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateVoid.class)
public class MockPrivateVoidTest {

	@Test
	public void shouldMockPrivateBySpying() throws Exception {
		MockPrivateVoid spy = PowerMockito.spy(new MockPrivateVoid());
		PowerMockito.doNothing().when(spy, method(MockPrivateVoid.class, "crashHorribly")).withNoArguments();
		assertThat(spy.go()).isEqualTo("I am original!");
	}

	@Test
	public void shouldMockPrivateBySupressing() throws Exception {
		suppress(method(MockPrivateVoid.class, "crashHorribly"));
		MockPrivateVoid mockPrivate = new MockPrivateVoid();
		
		assertThat(mockPrivate.go()).isEqualTo("I am original!");
	}

}
