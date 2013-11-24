package com.nadeem.app.compare.mock.case7;

public class MockPrivateStatic {

	public static String go() {
		return "Hello " + world();
	}

	private static String world() {
		return "Private Static!";
	}
}
