package com.nadeem.app.compare.mock.case2;

import java.io.IOException;

public class MockMultipleDependencies {

	private DependencyOne dependencyOne;
	private DependencyTwo dependencyTwo;
	
	public MockMultipleDependencies() {

	}
	
	public String go() throws IOException {
		return this.dependencyOne.message() + " "+ this.dependencyTwo.message();
	}

	public DependencyOne getDependencyOne() {
		return dependencyOne;
	}

	public void setDependencyOne(DependencyOne dependencyOne) {
		this.dependencyOne = dependencyOne;
	}

	public DependencyTwo getDependencyTwo() {
		return dependencyTwo;
	}

	public void setDependencyTwo(DependencyTwo dependencyTwo) {
		this.dependencyTwo = dependencyTwo;
	}
}
