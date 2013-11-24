package com.nadeem.app.compare.mock.case3;

import java.io.IOException;

public class MockConstructor {

	public String go() throws IOException {
		Dependency dependency = newDependency();
		return dependency.message();
	}

	private Dependency newDependency() throws IOException {
		return new Dependency();
	}

}
