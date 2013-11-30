package com.nadeem.app.compare.mock.mockito.case14;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@SuppressStaticInitializationFor("com.nadeem.app.compare.mock.case14.MockStaticInitializer")
public class MockStaticInitializerTest {

	@Test
	public void needToFigureOutHowToMockStaticBlock() {
		fail("Not yet implemented");
	}

}
