package com.nadeem.app.compare.mock.case6;

public class MockStatic {

	public String go() {
		return "Hello " + world();
	}

	public static String world() {
		return "Static World!";
	}
}
