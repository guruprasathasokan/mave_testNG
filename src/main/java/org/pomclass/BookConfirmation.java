package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmation {

	public WebDriver driver;

	@FindBy(id = "search_hotel")
	private WebElement sh;

	public BookConfirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSh() {
		return sh;
	}
	

}
