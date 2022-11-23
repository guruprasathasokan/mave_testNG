package com.NewProject_Apache;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	// launching browser
	public static WebDriver driver;

	public static WebDriver webLauncher(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver01\\chromedriverNew.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver01\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	// get
	public static void getUrl(String url) {
		driver.get(url);
	}

	// sendKeys
	public static void passingInput(WebElement element, String input) {

		element.sendKeys(input);
	}

	// click
	public static void button(WebElement btn) {

		btn.click();

	}

	// dropDowns
	private static Select selectObjects(WebElement element) {
		Select s = new Select(element);
		return s;
	}

	public static void dropDownsByText(WebElement element, String word) {
		selectObjects(element).selectByVisibleText(word);
	}

	public static void dropDownsByValue(WebElement element, String value) {
		selectObjects(element).selectByValue(value);
	}

	public static void dropDownsByIndex(WebElement element, int index) {
		selectObjects(element).selectByIndex(index);
	}

	public static void deselectByText(WebElement element, String word) {
		selectObjects(element).deselectByVisibleText(word);
	}

	public static void deleselectByValue(WebElement element, String value) {
		selectObjects(element).deselectByValue(value);
	}

	public static void deselectByIndex(WebElement element, int index) {
		selectObjects(element).deselectByIndex(index);
	}
	
	private static List<WebElement> options;
	public static void getOptions(WebElement element) {
    options = selectObjects(element).getOptions();
    for (WebElement getOptions : options) {
	System.out.println(getOptions.getText());	
	}

	}	
	private static List<WebElement> allOptions;
	public static void getAllSelected(WebElement element) {

		allOptions = selectObjects(element).getAllSelectedOptions();
		for (WebElement allSelectedOptions : allOptions) {
		System.out.println(allSelectedOptions.getText());	
		}
	}
	
	public static void isMultiple(WebElement element) {
		System.out.println(selectObjects(element).isMultiple());
	}
	
	// ScreenShot
	public static void screenShot(String location) throws IOException {

		TakesScreenshot photo = (TakesScreenshot) driver;
		File source = photo.getScreenshotAs(OutputType.FILE);
		File path = new File(location);
		FileUtils.copyFile(source, path);
	}

	// Clear
	public static void removeInput(WebElement element) {

		element.clear();
	}

	// Close
	public static void close() {
		driver.close();
	}

	// Quit
	public static void terminate() {
		driver.quit();
	}

	// Navigate
	public static void navigatePage(String input) {

		driver.navigate().to(input);
	}

	// wait
	public static void waitPage(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// scroll
	public static void scroll(String code, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(code, element);
	}
    
	//navigation
	public static void radioButton(WebElement radioBtn) {
		radioBtn.click();
	}

	public static void getTexts() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getElementTexts(WebElement element) {
		System.out.println(element.getText());
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
	
    //alert
	public static void alert() {
		driver.switchTo().alert();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertPassingInput(String values) {
		driver.switchTo().alert().sendKeys(values);
	}

	public static void alertGetText() {
		Alert alertText = driver.switchTo().alert();
		System.out.println(alertText.getText());
	}

	//frames
	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}

	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void returningParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public static void frameExit() {
		driver.switchTo().defaultContent();
	}
	
	//actions
	public static Actions actionsObject() {
		Actions a = new Actions(driver);
		return a;
	}

	public static void mouseClick() {
		actionsObject().click().perform();
	}

	public static void mouseMoveToElement(WebElement element) {
		actionsObject().moveToElement(element).perform();
	}

	public static void mouseContextClickWebelement(WebElement element) {
		actionsObject().contextClick(element).perform();
	}

	public static void mouseContextClick() {
		actionsObject().contextClick().perform();
	}

	public static void mouseDoubleClick() {
		actionsObject().doubleClick().perform();
	}

	public static void mouseDoubleClickWebelement(WebElement element) {
		actionsObject().doubleClick(element).perform();
	}

	public void mouseDragDrop(WebElement source, WebElement target) {
		actionsObject().dragAndDrop(source, target).perform();
	}

	//robot
	public static Robot robotObject() throws AWTException {
		Robot r = new Robot();
		return r;
	}

	public static void downKey() throws AWTException {
		robotObject().keyPress(KeyEvent.VK_DOWN);
		robotObject().keyRelease(KeyEvent.VK_DOWN);
	}

	public static void upKey() throws AWTException {
		robotObject().keyPress(KeyEvent.VK_UP);
		robotObject().keyRelease(KeyEvent.VK_UP);
	}

	public static void keyEnter() throws AWTException {
		robotObject().keyPress(KeyEvent.VK_ENTER);
		robotObject().keyRelease(KeyEvent.VK_ENTER);
	}

	//window handling
	public static void getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void getWindowHandles(String url) {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String handles : windowHandles) {
			String title = driver.switchTo().window(handles).getTitle();
			System.out.println(title);
		}
		String myWeb = url;
		for (String title : windowHandles) {
			if (driver.switchTo().window(title).equals(myWeb)) {
				break;
			}
		}
	}

	//web-table
	public static List<WebElement> datas;

	public static void webtableAllDatas(List<WebElement> elements) {
		datas = elements;
		for (WebElement allDatas : datas) {
			System.out.println(allDatas.getText());
		}
	}

	public static List<WebElement> rDatas;

	public static void webtableRowDatas(List<WebElement> elements) {
		rDatas = elements;
		for (WebElement rowDatas : rDatas) {
			System.out.println(rowDatas.getText());
		}
	}

	public static List<WebElement> cDatas;

	public static void webtableCoulmnDatas(List<WebElement> elements) {
		cDatas = elements;
		for (WebElement columnDatas : cDatas) {
			System.out.println(columnDatas.getText());
		}
	}
	public static void wetableSingleData(WebElement element) {
		System.out.println(element.getText());
	}

}
