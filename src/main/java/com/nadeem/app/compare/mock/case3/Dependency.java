package com.nadeem.app.compare.mock.case3;

import java.io.IOException;

public class Dependency {

	private String message;

	public Dependency() throws IOException {
		crashHorribly();
	}

	private void crashHorribly() throws IOException {
		throw new IOException("Made to crash horribly");		
	}

	public String message() {
		return this.message;
	}
}
