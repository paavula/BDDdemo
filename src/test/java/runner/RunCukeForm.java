package runner;

import java.io.File;


//import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;

//import com.cucumber.listener.ExtentCucumberFormatter;

//import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/json/output.json"},
		features = {"src/test/resources/features/SchldConsForm.feature"}, 
		glue = {"steps"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome=true
		//tags = "@Used-Search-Cars_Positive"
		)


public class RunCukeForm extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows-8");
        Reporter.setTestRunnerOutput("Sample test runner output message");
		//Reporter.loadXMLConfig(new File("D:\\AutomationProjects\\CucumberPageObjects\\src\\test\\resources\\extent-config.xml"));
	}
}
