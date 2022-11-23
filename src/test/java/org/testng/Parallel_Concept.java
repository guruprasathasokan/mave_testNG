package org.testng;

import org.testng.annotations.Test;

public class Parallel_Concept {

	@Test 
	public void userName() {
		System.out.println("User Name");
	}
	
	@Test
	public void password() {
		System.out.println("Password");
	}

	@Test
	public void login() {
		System.out.println("Login");
	}
}
