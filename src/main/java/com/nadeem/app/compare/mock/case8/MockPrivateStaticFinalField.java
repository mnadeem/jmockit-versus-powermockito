package com.nadeem.app.compare.mock.case8;

public class MockPrivateStaticFinalField {
	
	private static final Dependency DEPENDENCY = new Dependency();
	
	public String go() {		
		return DEPENDENCY.message();
	}	

}
