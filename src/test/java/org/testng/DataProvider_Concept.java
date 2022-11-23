package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	@Test (dataProvider = "details")
	public void login_Page(String username, long no) {
		System.out.println("User Name is:" + username);
		System.out.println("Account Number is:" + no);
	}
	@DataProvider
	private Object[][] details() {
		return new Object[][] {
				{ "Guru Prasath Asokan", 12345678 }, { "Hafila Thameem", 87654321 },
				{ "Niranjana Neithier", 98765432 } };
	}
}
