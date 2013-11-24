package com.nadeem.app.compare.mock.case1;

import java.io.IOException;

public class MockDependency {

	private Dependency dependency;
	
	public MockDependency(Dependency dependency) {
		this.dependency = dependency;
	}
	
	public String go() throws IOException {
		return this.dependency.message();
	}

}
