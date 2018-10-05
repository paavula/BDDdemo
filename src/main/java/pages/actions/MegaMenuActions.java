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

public class MegaMenuActions extends BasePage<Object> {

	MegaMenuLocators megamenuLocators = null;

	public MegaMenuActions() {
		this.megamenuLocators = new MegaMenuLocators();
		PageFactory.initElements(DriverManager.getDriver(), megamenuLocators);
	}
	
	public void moveToMenu(WebElement ele){
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();	
	}

	/**
	 * This method is for clickDegreesNProgram.
	 */
	public void clickDegreesNProgram() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.degNProgLinkElement, 2);
		moveToMenu(megamenuLocators.degNProgLinkElement);
	}
	
	/**
	 * This method is for getTxtDegreesNProgram Menu text.
	 */
	public String getTxtDegreesNProgram() {
		//initializeElements(this);
		// wait for the page to load
		waitForElementToVisible(megamenuLocators.degNProgLinkElement, 2);
		moveToMenu(megamenuLocators.degNProgLinkElement);
			return megamenuLocators.degNProgLinkElement.getText();	
	}


/**
 * This method is for clickCapellaExp.
 */
public void clickCapellaExp() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.cplExpLinkElement, 2);
	moveToMenu(megamenuLocators.cplExpLinkElement);
	}

/**
 * This method is for getTxtCapellaExp Menu text.
 */
public String getTxtCapellaExp() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.cplExpLinkElement, 2);
	moveToMenu(megamenuLocators.cplExpLinkElement);
		return megamenuLocators.cplExpLinkElement.getText();	
}

/**
 * This method is for clickFinancialLink.
 */
public void clickFinancialLinkElement() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.financialLinkElement, 2);
	moveToMenu(megamenuLocators.financialLinkElement);
}

/**
 * This method is for getTxtFinancialLink Menu text.
 */
public String getTxtFinancialLink() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.financialLinkElement, 2);
	moveToMenu(megamenuLocators.financialLinkElement);
		return megamenuLocators.financialLinkElement.getText();	
}

/**
 * This method is for clickApply.
 */
public void clickApply() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.applyLinkElement, 2);
	
	moveToMenu(megamenuLocators.applyLinkElement);
}

/**
 * This method is for getTxtApplyLink Menu text.
 */
public String getTxtApplyLink() {
	//initializeElements(this);
	// wait for the page to load
	waitForElementToVisible(megamenuLocators.applyLinkElement, 2);
	moveToMenu(megamenuLocators.applyLinkElement);
		return megamenuLocators.applyLinkElement.getText();	
}

@Override
public ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
