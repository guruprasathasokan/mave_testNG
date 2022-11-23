package org.testng;

import org.testng.annotations.Test;

public class TimeOut_Concept {

	@Test(timeOut = 10000)
	public void facebookLogin() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("User Name");
		Thread.sleep(3000);
		System.out.println("Password");
		Thread.sleep(4000);
		System.out.println("Login");
	}
}
