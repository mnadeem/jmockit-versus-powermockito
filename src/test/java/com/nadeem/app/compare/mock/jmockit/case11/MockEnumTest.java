package com.nadeem.app.compare.mock.jmockit.case11;

import static org.fest.assertions.api.Assertions.assertThat;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case11.EnumDependency;
import com.nadeem.app.compare.mock.case11.MockEnum;

public class MockEnumTest {

	@Test
    public void doSomething(@Mocked final EnumDependency toDep) {
		MockEnum service = new MockEnum();
        new Expectations() {{
        	EnumDependency.DEP.message();
            result = "I am mocked!";
        }};
        assertThat(service.go()).isEqualTo("I am mocked!");
    }

}
