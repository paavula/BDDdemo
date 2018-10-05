package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import utils.BasePage;
import utils.SeleniumDriver;

public class MegaMenuLocators {
	
	//MegaMenuLocators MegaMenuLocators = null;
	
	/** This variable is for degNProgLinkElement. */
	@FindBy(linkText="DEGREES + PROGRAMS")
	public WebElement degNProgLinkElement;
	
	/** This variable is for capellaExpMenuElement. */
	@FindBy(linkText="CAPELLA EXPERIENCE")
	
	public WebElement cplExpLinkElement;
	
	/** This variable is for financingLinkElement. */
	@FindBy(linkText="FINANCING")
	public WebElement financialLinkElement;
	
	/** This variable is for flexPathLinkElement. */
	@FindBy(linkText="APPLY")
	public WebElement applyLinkElement;
	
	/** This variable is for Ask a Question Link. */
	@FindBy(linkText="ASK A QUESTION")
	public WebElement askaQuestionElement;
	
	/** This variable is for Schedule Consultation Element. */
	@FindBy(linkText="Schedule Consultation")
	public WebElement scheduleConsultationLinkElement;
	
	
	/** This variable is for Form Element. */
	//@FindBy(css=".form-wrapper")
	@FindBy(xpath="/html/body/div[15]/div/div/div[2]/div")
	public WebElement scheduleConsultationFormElement;
	
	/** This variable is for Degree Element. */
	@FindBy(css=".degreeDropdown")
	public WebElement degreeFormElement;
	
	/** This variable is for AOS Element. */
	@FindBy(css=".aosDropdown")
	public WebElement aosFormElement;
	
	/** This variable is for license question Element. */
	@FindBy(css=".nursing-field")
	public WebElement licenseQuestionFormElement;

}
