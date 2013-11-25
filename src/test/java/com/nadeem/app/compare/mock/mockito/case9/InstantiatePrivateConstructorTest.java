package com.nadeem.app.compare.mock.mockito.case9;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.nadeem.app.compare.mock.case9.InstantiatePrivateConstructor;

@RunWith(PowerMockRunner.class)
@PrepareForTest(InstantiatePrivateConstructor.class)
public class InstantiatePrivateConstructorTest {

	@Test
	public void test() {
		
		InstantiatePrivateConstructor instantiatePrivateConstructor = Whitebox.newInstance(InstantiatePrivateConstructor.class);
		
		assertThat(instantiatePrivateConstructor.go()).isEqualTo("It seems i am instantiated!");
	}

}
