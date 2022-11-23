package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThridPage {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;

	public ThridPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getResume() {
		return resume;
	}

	@FindBy(id = "continue")
	private WebElement resume;
}
