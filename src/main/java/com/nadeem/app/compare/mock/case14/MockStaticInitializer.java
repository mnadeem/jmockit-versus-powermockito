package com.nadeem.app.compare.mock.case14;

public class MockStaticInitializer {
	

	static {
		System.setProperty("key", "Original Value");
	}

	public static String go() {
		return System.getProperty("key");
	}

}
