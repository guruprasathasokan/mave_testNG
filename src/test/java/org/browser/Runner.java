package org.browser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pomclass.Adactin_LoginPage;
import org.pomclass.BookConfirmation;
import org.pomclass.HotelBooking;
import org.pomclass.Search_Hotel;
import org.pomclass.ThridPage;
import org.propertyfiles.Adactin_Objects;
import org.propertyfiles.DropDowns_Objects;
import org.propertyfiles.Dropdown_Configuration;
import org.sdp.Page_Object_Model;

import com.NewProject_Apache.BaseClass;

public class Runner extends BaseClass {

	public static WebDriver driver = webLauncher("chrome");
	public static Page_Object_Model pom = new Page_Object_Model(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		String url = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getUrl();
		getUrl(url);
		waitPage(10);
		getTexts();
		// Object 1
		String userName = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getUserName();
		passingInput(pom.getLp().getUserid(), userName);
		String password = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getPassword();
		passingInput(pom.getLp().getPassword(), password);
		button(pom.getLp().getSubmit());
		// Object 2
		button(pom.getSearchHotel().getLoc());
		String loc = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getLocation();
		dropDownsByText(pom.getSearchHotel().getLoc(), loc);
		button(pom.getSearchHotel().getHotel());
		String hotel = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getHotel();
		dropDownsByText(pom.getSearchHotel().getHotel(), hotel);
		button(pom.getSearchHotel().getRoomType());
		String roomType = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getRoomType();
		dropDownsByText(pom.getSearchHotel().getRoomType(), roomType);
		removeInput(pom.getSearchHotel().getCheckInDate());
		String checkInDate = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getCheckInDate();
		passingInput(pom.getSearchHotel().getCheckInDate(), checkInDate);
		removeInput(pom.getSearchHotel().getCheckOutDate());
		String checkOutDate = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getCheckOutDate();
		passingInput(pom.getSearchHotel().getCheckOutDate(), checkOutDate);
		button(pom.getSearchHotel().getAdultsPerRoom());
		String adults = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getAdults();
		dropDownsByText(pom.getSearchHotel().getAdultsPerRoom(), adults);
		button(pom.getSearchHotel().getChildPerRoom());
		String child = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getChild();
		dropDownsByText(pom.getSearchHotel().getChildPerRoom(), child);
		button(pom.getSearchHotel().getSubmit());
		// Object 3
		button(pom.getSelectHotel().getRadioBtn());
		button(pom.getSelectHotel().getResume());
		// Object 4
		String firstName = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getFirstName();
		passingInput(pom.getHotelBooking().getFname(), firstName);
		String lastName = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getLastName();
		passingInput(pom.getHotelBooking().getLname(), lastName);
		String address = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getAddress();
		passingInput(pom.getHotelBooking().getAddress(), address);
		String creditCard = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getCreditCard();
		passingInput(pom.getHotelBooking().getCcnum(), creditCard);
		button(pom.getHotelBooking().getCctype());
		String ccType = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getCcType();
		dropDownsByText(pom.getHotelBooking().getCctype(), ccType);
		button(pom.getHotelBooking().getMonth());
		String month = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getMonth();
		dropDownsByText(pom.getHotelBooking().getMonth(), month);
		button(pom.getHotelBooking().getYear());
		String year = DropDowns_Objects.getDropDown_obj().getDropDown_Con().getYear();
		dropDownsByText(pom.getHotelBooking().getYear(), year);
		String cvv = Adactin_Objects.getAdactin_Objects().getAdactin_Configuration().getCvv();
		passingInput(pom.getHotelBooking().getCvv(), cvv);
		button(pom.getHotelBooking().getBook());
		// Object 5
		scroll("arguments[0].scrollIntoView();", pom.getBookConfirmation().getSh());
		screenShot(
				"C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\Screen Shot\\adactinbooking01.png");

	}
}
