package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon_Class {

	public static WebDriver driver;

	@Test(priority = 0)
	@Parameters({ "input1", "input2", "input3", "input4" })
	public void webLauncher(String input1, String input2, String input3,
			@Optional("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0") String input4) {
		System.setProperty(input1, System.getProperty(input2) + input3);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(input4);
	}

	@Test(priority = 2)
	@Parameters({ "element", "password" })
	private void passingPassword(String element1, String password, String element2) {
		driver.findElement(By.id(element1)).sendKeys(password);
		driver.findElement(By.id(element2)).click();
	}

	@Test(priority = 1)
	private void passingUserName(String element3, String  email, String element4 ) {
		driver.findElement(By.id("ap_email")).sendKeys("guruprasath.asokan.dir@gmail.com");
		driver.findElement(By.id("continue")).click();
	}

}
