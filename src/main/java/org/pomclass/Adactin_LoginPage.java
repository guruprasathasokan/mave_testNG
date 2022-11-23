package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_LoginPage {

	public WebDriver driver;

	public Adactin_LoginPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id = "username")
	private WebElement userid;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement submit;

}
