package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.NewProject_Apache.BaseClass;

public class Test_Runner extends BaseClass{

	public static void main(String[] args) {
		
		webLauncher("chrome");
		getUrl("https://letcode.in/frame");
		WebElement firstFrame = driver.findElement(By.id("firstFr"));
		frameWebelement(firstFrame);
		WebElement fname = driver.findElement(By.name("fname"));
		passingInput(fname, "Guru");
		WebElement lastName = driver.findElement(By.name("lname"));
		passingInput(lastName, "Prasath");
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		frameWebelement(innerFrame);
		WebElement email = driver.findElement(By.name("email"));
		passingInput(email, "guruprasath985@gmail.com");
		frameExit();
		
		
	}
	
}
