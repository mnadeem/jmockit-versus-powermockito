package com.nadeem.app.compare.mock.jmockit.case8;

import static junit.framework.Assert.assertEquals;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

import com.nadeem.app.compare.mock.case8.Dependency;
import com.nadeem.app.compare.mock.case8.MockPrivateStaticFinalField;

public class MockPrivateStaticFinalFieldTest {

	@Test
	public void mockPrivateStaticeBehaviorBased() {

		final MockPrivateStaticFinalField mockStatic = new MockPrivateStaticFinalField();

		new Expectations() {
			@Mocked("message") Dependency dep;			

			{
				setField(MockPrivateStaticFinalField.class, "DEPENDENCY", dep);
				dep.message();
				result = "Private Static Final Jmockit Mocked!";
			}
		};
		assertEquals("Private Static Final Jmockit Mocked!", mockStatic.go());
	}

}
