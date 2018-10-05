package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.DriverManager;
import utils.SeleniumDriver;

public class AfterActions {

	@After
	public static void tearDown(Scenario scenario){
		WebDriver driver = DriverManager.getDriver();
		if(scenario.isFailed()){
			System.out.println("Scenario: " + scenario.getName()+ ": FAIL");
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
		}else{
			System.out.println("Scenario: " + scenario.getName()+ ": PASS");
		}
		DriverManager.tearDown();
	}
	
}
