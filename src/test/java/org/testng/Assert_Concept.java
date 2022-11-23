package org.testng;

import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	public void assert_Concept() {

		String act = "Guru Prasath A";
		String exp = "Guru Prasath A";
		
		Assert.assertEquals(act, exp);
		System.out.println("Input Correct");
	}
	
	
}
