package org.sdp;

import org.openqa.selenium.WebDriver;
import org.pomclass.Adactin_LoginPage;
import org.pomclass.BookConfirmation;
import org.pomclass.HotelBooking;
import org.pomclass.Search_Hotel;
import org.pomclass.ThridPage;

public class Page_Object_Model {

	public WebDriver driver;// driver

	private Adactin_LoginPage lp;// loginpage

	public Page_Object_Model(WebDriver driver2) {
		this.driver = driver2;
	}

	public Adactin_LoginPage getLp() {

		if (lp == null) {
			lp = new Adactin_LoginPage(driver);
		}
		return lp;
	}

	private Search_Hotel sh;// search hotel

	public Search_Hotel getSearchHotel() {

		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	private ThridPage tp;// ThirdPage

	public ThridPage getSelectHotel() {

		if (tp == null) {
			tp = new ThridPage(driver);
		}

		return tp;
	}

	private HotelBooking hb;// HotelBooking

	public HotelBooking getHotelBooking() {

		if (hb == null) {
			hb = new HotelBooking(driver);
		}

		return hb;

	}

	private BookConfirmation bc;// BookConfirmation

	public BookConfirmation getBookConfirmation() {
		if (bc == null) {
			bc = new BookConfirmation(driver);
		}

		return bc;
	}

}
