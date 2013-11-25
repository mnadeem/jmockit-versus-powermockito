package com.nadeem.app.compare.mock.jmockit.case10;

import mockit.Cascading;
import mockit.Verifications;

import org.junit.Test;

import com.nadeem.app.compare.mock.cas10.Fluent;

public class FluentTest {

	@Test
    public void doSomething(final @Cascading Fluent fluent) {
        fluent.say().hello().world();

        new Verifications() {{

        	fluent.say(); times = 1;
        	fluent.say().hello(); times = 1;
        	fluent.say().hello().world(); times = 1;
        }};
    }

}
