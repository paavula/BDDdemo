/**
 ******************************************************************************
 * 							  REUSABLE FRAMEWORK
 *  							CONFIDENTIAL
 *							COPYRIGHTS TO TECHASPECT
 *							
 * *****************************************************************************
 */

package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverManagerBkp {
	
	private DriverManagerBkp(){
	}

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	/**
	 * This method is for getDriver.
	 */
	public static WebDriver getDriver() {
		return DriverManagerBkp.driver.get();
	}
	
	/**
	 * This method is for setDriver.
	 * @param driver
	 */
	public static void setDriver(WebDriver driver) {
		DriverManagerBkp.driver.set(driver);
	}


	/**
	 * This method is for maximizing the browser.
	 * @param driver
	 */
	public static void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is for setting implicit wait.
	 * @param driver
	 */
	public static void setImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void tearDown() {
		if (driver != null) {
			driver.get().quit();
		      driver.remove();
		}
	}
}
