package com.nadeem.app.compare.mock.case4;

import java.io.IOException;

public class MockPrivate {
	
	public String go() throws IOException {
		crashHorribly();
		return "I am original!";
	}
	
	private void crashHorribly() throws IOException {
        throw new IOException();
    }

}
