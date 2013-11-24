package com.nadeem.app.compare.mock.mockito.case4;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import static org.powermock.api.support.membermodification.MemberModifier.suppress;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nadeem.app.compare.mock.case4.MockPrivate;


@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivate.class)
public class MockPrivateTest {

	@Test
	public void shouldMockPrivateBySpying() throws Exception {
		MockPrivate spy = PowerMockito.spy(new MockPrivate());
		PowerMockito.doNothing().when(spy, method(MockPrivate.class, "crashHorribly")).withNoArguments();
		assertThat(spy.go()).isEqualTo("I am original!");
	}

	@Test
	public void shouldMockPrivateBySupressing() throws Exception {
		suppress(method(MockPrivate.class, "crashHorribly"));
		MockPrivate mockPrivate = new MockPrivate();
		
		assertThat(mockPrivate.go()).isEqualTo("I am original!");
	}

}
