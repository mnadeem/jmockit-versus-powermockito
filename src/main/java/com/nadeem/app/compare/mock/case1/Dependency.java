package com.nadeem.app.compare.mock.case1;

import java.io.IOException;

public class Dependency {

	public Dependency() {

	}
	
	public String message() throws IOException {
		crashHorribly();
		return "I am original";
	}
	
	private void crashHorribly() throws IOException {
		throw new IOException("Made to crash horribly");		
	}
}
