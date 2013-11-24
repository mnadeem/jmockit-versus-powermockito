package com.nadeem.app.compare.mock.case5;

public class MockPrivateNonVoid {
	
	public String go() {
		return "Hello " + world();
	}

	private String world() {
		return "World!";
	}

}
