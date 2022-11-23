package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {

	@Test
	public void softAssert_Concept() {

		String exp = "Guru Prasath A";
		String act = "Guru Prasath Asokan";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(act, exp);
		System.out.println("Print Anyways");
	}	
}
