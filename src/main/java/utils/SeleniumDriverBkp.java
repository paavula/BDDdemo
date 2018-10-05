package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriverBkp {

	private static SeleniumDriverBkp seleniumDriver;

	// init Webdriver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 60;
	public final static int PAGE_LOAD_TIMEOUT = 60;

	private SeleniumDriverBkp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriverBkp();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			//driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
