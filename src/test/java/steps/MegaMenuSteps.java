package steps;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.MegaMenuActions;
//import pages.actions.CarsGuideHomePageActions;
//import pages.actions.CarsSearchPageActions;
import pages.locators.MegaMenuLocators;
import setup.TestSetUp;
import utils.ErrorUtil;
import utils.SeleniumDriver;

public class MegaMenuSteps extends TestSetUp {

	MegaMenuLocators megamenuLocators = new MegaMenuLocators();
	MegaMenuActions megamenuActions = new MegaMenuActions();
	
	@Given("^I am on the Home page \"([^\"]*)\" of Capella Home Page website$")
	public void i_am_on_the_Home_page_of_Capella_Home_Page_website(String websiteURL) throws Throwable {
		//SeleniumDriver.openPage(websiteURL);
		navigateToURL(websiteURL);
	    //throw new PendingException();
	}
	
	@When("^I move to Degrees & Programs Menu$")
	public void i_move_to_Degrees_Programs_Menu() throws Throwable {
		
		megamenuActions.clickDegreesNProgram();
	    //throw new PendingException();
	}
	
	
	@Then("^I should see the \"([^\"]*)\" text on Degrees & Programs Menu$")
	public void i_should_see_the_text_on_Degrees_Programs_Menu(String expectedMenuText) throws Throwable {
		boolean result= megamenuActions.getTxtDegreesNProgram().contains(expectedMenuText);
		System.out.println(expectedMenuText);
		System.out.println(megamenuActions.getTxtDegreesNProgram());
		try
		{
		Assert.assertEquals(result, true, "Title didn't match");
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	    //throw new PendingException();
	}

	@When("^I move to Capella Experience Menu$")
	public void i_move_to_Capella_Experience_Menu() throws Throwable {
		megamenuActions.clickCapellaExp();
	    //throw new PendingException();
	}
	
	
	@Then("^I should see \"([^\"]*)\" on Capella Experience Menu$")
	public void i_should_see_on_Capella_Experience_Menu(String expectedMenuText) throws Throwable {
		boolean result= megamenuActions.getTxtCapellaExp().contains(expectedMenuText);
		System.out.println(expectedMenuText);
		System.out.println(megamenuActions.getTxtCapellaExp());
		try
		{
		Assert.assertEquals(result, true, "Title didn't match");
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	    //throw new PendingException();
	}

	@When("^I move to Financing Menu$")
	public void i_move_to_Financing_Menu() throws Throwable {
		megamenuActions.clickFinancialLinkElement();
	    //throw new PendingException();
	}

	
	@Then("^I should see \"([^\"]*)\" on Capella Financing Menu$")
	public void i_should_see_on_Capella_Financing_Menu(String expectedMenuText) throws Throwable {
		boolean result= megamenuActions.getTxtFinancialLink().equals(expectedMenuText);
		System.out.println(expectedMenuText);
		System.out.println(megamenuActions.getTxtFinancialLink());
		try
		{
		Assert.assertEquals(result, true, "Title didn't match");
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
			throw t;
		}
		
	}

	@When("^I move to Apply Menu$")
	public void i_move_to_Apply_Menu() throws Throwable {
		megamenuActions.getTxtApplyLink();
	    //throw new PendingException();
	}

	
	@Then("^I should see \"([^\"]*)\" on Capella Apply Menu$")
	public void i_should_see_on_Capella_Apply_Menu(String expectedMenuText) throws Throwable {
		boolean result= megamenuActions.getTxtApplyLink().contains(expectedMenuText);
		System.out.println(expectedMenuText);
		System.out.println(megamenuActions.getTxtApplyLink());
		try
		{
		Assert.assertEquals(result, true, "Title didn't match");
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	    //throw new PendingException();
	}
	
}
