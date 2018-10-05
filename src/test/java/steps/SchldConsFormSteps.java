package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.MegaMenuActions;
import pages.actions.SchldConsFormActions;
//import pages.actions.CarsGuideHomePageActions;
//import pages.actions.CarsSearchPageActions;
import pages.locators.MegaMenuLocators;
import setup.TestSetUp;
import utils.ErrorUtil;
import utils.SeleniumDriver;

public class SchldConsFormSteps extends TestSetUp {

	MegaMenuLocators megamenuLocators = new MegaMenuLocators();
	SchldConsFormActions schldconsFormActions = new SchldConsFormActions();
	
	@Given("^I am on the Capella Home page \"([^\"]*)\"$")
	public void i_am_on_the_Capella_Home_page(String websiteURL) throws Throwable {
		navigateToURL(websiteURL);
	}

	@Given("^\"([^\"]*)\" Menu link available on Home Page Header$")
	public void menu_link_available_on_Home_Page_Header(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean askQslinkAvlb = schldconsFormActions.verifyAskaQuestionMenu();
		try
		{
	    Assert.assertTrue(askQslinkAvlb);
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	}

	@When("^I click on ask a question menu$")
	public void i_click_on_ask_a_question_menu() throws Throwable {
		schldconsFormActions.clickAskaQuestion();
	}

	@Then("^I should see the \"([^\"]*)\" link under the menu$")
	public void i_should_see_the_link_under_the_menu(String arg1) throws Throwable {
	    
		boolean scConslinkAvlb = schldconsFormActions.verifySchldConsLink();
		try
		{
	    Assert.assertTrue(scConslinkAvlb);
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	}

	@When("^I click on ask a schedule consultation link$")
	public void i_click_on_ask_a_schedule_consultation_link() throws Throwable {
		schldconsFormActions.clickSchldConsLink();
	}

	@Then("^I should see the schedule consultation modal pop up form$")
	public void i_should_see_the_schedule_consultation_modal_pop_up_form() throws Throwable {
		Thread.sleep(2000);
		boolean scConsFormAvlb = schldconsFormActions.verifySchldConsForm();
		Thread.sleep(1000);
		try
		{
	    Assert.assertTrue(scConsFormAvlb);
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	}

	@When("^I select \"([^\"]*)\" as Degree$")
	public void i_select_as_Degree(String degVal) throws Throwable {
		Thread.sleep(1000);
		schldconsFormActions.selectDegree(degVal);
	}

	@When("^\"([^\"]*)\" as Area of Study in form$")
	public void as_Area_of_Study_in_form(String aosVal) throws Throwable {
		Thread.sleep(1000);
		schldconsFormActions.selectAOS(aosVal);
	}

	@Then("^I should see unrestricted RN license question provided to user$")
	public void i_should_see_unrestricted_RN_license_question_provided_to_user() throws Throwable {
		boolean rnLicenseAvlb = schldconsFormActions.verifyLicenseQuestion();
		Thread.sleep(2000);
		try
		{
	    Assert.assertTrue(rnLicenseAvlb);
		}
		catch(Throwable t){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(t);
		}
	}

}
