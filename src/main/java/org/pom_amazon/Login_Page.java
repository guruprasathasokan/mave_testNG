package org.pom_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	
	@FindBy (id = "ap_email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getResumeAction() {
		return resumeAction;
	}

	@FindBy (id = "continue")
	private WebElement resumeAction;
}
