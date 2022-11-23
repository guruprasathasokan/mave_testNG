package org.browser;

import org.openqa.selenium.WebDriver;
import org.pomclass_youtube.Home_Page;

import com.NewProject_Apache.BaseClass;

public class Runner_Youtube extends BaseClass {

	
	public static void main(String[] args) {
	
		webLauncher("chrome");
		getUrl("https://www.youtube.com/");
		Home_Page hp = new Home_Page(driver);
		passingInput(hp.getSearch(), "enadhuiyire song");
		button(hp.getSearchBtn());
		
		
		
		
	}
	
}
