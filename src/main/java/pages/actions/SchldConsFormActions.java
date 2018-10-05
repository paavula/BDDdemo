package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.MegaMenuLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.SeleniumDriver;

public class SchldConsFormActions extends BasePage<Object> {

	MegaMenuLocators megamenuLocators = null;
	Select sel;

	public SchldConsFormActions() {
		this.megamenuLocators = new MegaMenuLocators();
		PageFactory.initElements(DriverManager.getDriver(), megamenuLocators);
	}
	
	public void moveToMenu(WebElement ele){
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();	
	}
	
	/**
	 * This method is for verifyAskaQuestionMenu.
	 */
	public boolean verifyAskaQuestionMenu() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.askaQuestionElement, 2);
		return megamenuLocators.askaQuestionElement.isDisplayed();
	}
	
	/**
	 * This method is for verifySchldConsLink.
	 */
	public boolean verifySchldConsLink() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.scheduleConsultationLinkElement, 2);
		return megamenuLocators.scheduleConsultationLinkElement.isDisplayed();
	}

	/**
	 * This method is for clickAskaQuestion.
	 */
	public void clickAskaQuestion() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.askaQuestionElement, 2);
		megamenuLocators.askaQuestionElement.click();
	}
	
	/**
	 * This method is for clickSchldConsLink.
	 */
	public void clickSchldConsLink() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.scheduleConsultationLinkElement, 2);
		megamenuLocators.scheduleConsultationLinkElement.click();
	}
	
	/**
	 * This method is for verifySchldConsForm.
	 */
	public boolean verifySchldConsForm() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.scheduleConsultationFormElement, 2);
		return megamenuLocators.scheduleConsultationFormElement.isDisplayed();
	}


	/**
	 * This method is for selectDegree.
	 * @throws InterruptedException 
	 */
	public void selectDegree(String degree) throws InterruptedException {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.degreeFormElement, 2);
		sel = new Select(megamenuLocators.degreeFormElement);
		Thread.sleep(1000);
		sel.selectByVisibleText(degree);
		//megamenuLocators.degreeFormElement.sendKeys(degree);
		
	}
	
	/**
	 * This method is for selectAOS.
	 * @throws InterruptedException 
	 */
	public void selectAOS(String aos) throws InterruptedException {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.aosFormElement, 2);
		sel = new Select(megamenuLocators.aosFormElement);
		Thread.sleep(1000);
		sel.selectByVisibleText(aos);
		//megamenuLocators.aosFormElement.sendKeys(aos);
	}
	
	/**
	 * This method is for verifyLicenseQuestion.
	 */
	public boolean verifyLicenseQuestion() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.licenseQuestionFormElement, 2);
		return megamenuLocators.licenseQuestionFormElement.isDisplayed();
	}

@Override
public ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
