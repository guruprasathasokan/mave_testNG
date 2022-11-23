package org.testng;

import org.testng.annotations.Test;

public class Expected_Exception_Concept {

	@Test (expectedExceptions = ArithmeticException.class)
	public void math() {

		int i=20;
		
		System.out.println(i/0);
	}
	
	
}
