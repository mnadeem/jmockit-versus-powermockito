package com.nadeem.app.compare.mock.case2;

import java.io.IOException;

public class DependencyTwo {
	
	public String message() throws IOException {
		crashHorribly();
		return "I am original Two";
	}
	
	private void crashHorribly() throws IOException {
		throw new IOException("Made to crash horribly");		
	}
}
