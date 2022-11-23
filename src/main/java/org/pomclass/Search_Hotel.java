package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement loc;

	public Search_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	@FindBy(id = "Submit")
	WebElement submit;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkInDate;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;

}
