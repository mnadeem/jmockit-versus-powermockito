package com.nadeem.app.compare.mock.mockito.case10;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.nadeem.app.compare.mock.cas10.Fluent;

public class FluentTest {

	@Test
    public void doSomething() {
        Fluent fluent = mock(Fluent.class, Mockito.RETURNS_DEEP_STUBS);
        Fluent say		= fluent.say();
        Fluent hello 	= say.hello();
        hello.world();

        verify(fluent, times(1)).say();
        verify(say, times(1)).hello();
        verify(hello, times(1)).world();
    }

}
