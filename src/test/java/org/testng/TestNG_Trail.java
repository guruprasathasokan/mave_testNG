package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Trail {

	@BeforeSuite
	private void propertySettings() {
		System.out.println("Properties");
	}

	@BeforeTest
	private void webdriverLaunch() {
		System.out.println("Chrome");
	}

	@BeforeClass
	public void urlLaunch() {
		System.out.println("Facebook");
	}

	@BeforeMethod
	public void loginPage() {
		System.out.println("Login");
	}

	@Test (priority = 2)
	public void changeDp() {
		System.out.println("Changing DP");
	}

	@Test (priority = 0)
	public void messagingFriends() {
		System.out.println("Messaging Friends");
	}

	@Test(priority = 1, invocationCount = 3)
	public void uploadingPhoto() {
		System.out.println("Upload Photo");
	}

	@AfterMethod
	public void logoutPage() {
		System.out.println("Logout");
	}

	@AfterClass
	public void screenshotPhoto() {
		System.out.println("Screen Shot");
	}

	@AfterTest
	public void closeSinglePage() {
		System.out.println("Close");
	}

	@AfterSuite
	private void quitWebpage() {
		System.out.println("Quit");
	}
}
