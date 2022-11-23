package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameteriezed_Text_Concept01 {

	@Test
	@Parameters ({"username" , "accountno"})
	public void facebook(String username, long accountno) {

		System.out.println(username);
		System.out.println(accountno);
	}
	
}
