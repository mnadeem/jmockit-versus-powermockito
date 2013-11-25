package com.nadeem.app.compare.mock.mockito.case8;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.nadeem.app.compare.mock.case8.Dependency;
import com.nadeem.app.compare.mock.case8.MockPrivateStaticFinalField;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateStaticFinalField.class)
public class MockPrivateStaticFinalFieldTest {

	@Mock
	private Dependency mockedDependency;

	@Before
	public void doBeforeEachTest() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldMockSuccessfully() {
		Whitebox.setInternalState(MockPrivateStaticFinalField.class, "DEPENDENCY", this.mockedDependency);
		when(mockedDependency.message()).thenReturn("I am mocked!");
		
		MockPrivateStaticFinalField mockPrivateStaticFinalField = new MockPrivateStaticFinalField();
		assertThat(mockPrivateStaticFinalField.go()).isEqualTo("I am mocked!");

	}

}
