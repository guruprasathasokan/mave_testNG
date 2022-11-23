package org.pomclass_youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	
	
	public static WebDriver driver;
	
	@FindBy (name="search_query")
	private WebElement search;
	

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy (xpath = "//button[@aria-label='Search']")
	private WebElement searchBtn;
	
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);	
	}

}
