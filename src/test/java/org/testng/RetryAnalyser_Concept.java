package org.testng;

import org.testng.annotations.Test;

public class RetryAnalyser_Concept {

	@Test
	public void userName() {

		String act=" Guru Prasath A";
		String exp = "Guru Prasath A";
	
		Assert.assertEquals(act, exp);
	}
	
	@Test (retryAnalyzer = Rerun.class)
	public void password() {

		String act = "Asokan4#";
		String exp = "Ashokan4#";
		
		Assert.assertEquals(act, exp);
		
	}
}
