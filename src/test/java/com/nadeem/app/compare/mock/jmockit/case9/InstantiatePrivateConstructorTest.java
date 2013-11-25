package com.nadeem.app.compare.mock.jmockit.case9;

import static junit.framework.Assert.assertEquals;
import mockit.Deencapsulation;

import org.junit.Test;

import com.nadeem.app.compare.mock.case9.InstantiatePrivateConstructor;

public class InstantiatePrivateConstructorTest {

	@Test
	public void test() {
		
		InstantiatePrivateConstructor instance = Deencapsulation.newInstance(InstantiatePrivateConstructor.class);
		assertEquals("It seems i am instantiated!", instance.go());
	}

}
