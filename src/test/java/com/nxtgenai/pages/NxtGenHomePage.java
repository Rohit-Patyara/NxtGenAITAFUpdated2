package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nxtgeni.objectrepository.ObjectRepository;



public class NxtGenHomePage {

	public WebDriver driver;
	public Actions mouseHover;

	public NxtGenHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(linkText=ObjectRepository.homeLink) 
	@CacheLookup
	WebElement home;

	@FindBy(linkText=ObjectRepository.courseOfferedLink) 
	@CacheLookup
	WebElement courseOffered;

	@FindBy(partialLinkText = ObjectRepository.seleniumAutomationCurriculumLink) 
	@CacheLookup
	WebElement seleniumAutomationCurriculum;

	@FindBy(partialLinkText = ObjectRepository.automationToolsCurriculumLink) 
	@CacheLookup
	WebElement automationToolsCurriculum;
	
	@FindBy(linkText = ObjectRepository.demoSitesLink) 
	@CacheLookup
	WebElement demoSites;

	@FindBy(linkText = ObjectRepository.practiceAutomationLink) 
	@CacheLookup
	WebElement practiceAutomation;

	@FindBy(partialLinkText = ObjectRepository.registrationFormLink) 
	@CacheLookup
	WebElement registrationForm;

	@FindBy(partialLinkText = ObjectRepository.alertPopUpLink) 
	@CacheLookup
	WebElement alertPopUp;

	@FindBy(partialLinkText = ObjectRepository.multipleWindowsLink) 
	@CacheLookup
	WebElement multipleWindows;

	@FindBy(partialLinkText = ObjectRepository.webTableLink) 
	@CacheLookup
	WebElement webTable;

	@FindBy(partialLinkText = ObjectRepository.mouseEventLink) 
	@CacheLookup
	WebElement mouseEvent;
		
	@FindBy(partialLinkText = ObjectRepository.progressBarLink) 
	@CacheLookup
	WebElement progressBar;	
	
	@FindBy(partialLinkText = ObjectRepository.dynamicTransactionLink) 
	@CacheLookup
	WebElement dynamicTransaction;
	
	@FindBy(partialLinkText = ObjectRepository.iFramesLink) 
	@CacheLookup
	WebElement iFrames;
	
	@FindBy(linkText = ObjectRepository.aboutMeLink) 
	@CacheLookup
	WebElement aboutMe;

	@FindBy(linkText = ObjectRepository.techTalkLink) 
	@CacheLookup
	WebElement techTalk;

	@FindBy(linkText = ObjectRepository.testimonialsLink) 
	@CacheLookup
	WebElement testimonials;

	@FindBy(partialLinkText = ObjectRepository.pythonForAutomationLink) 
	@CacheLookup
	WebElement pythonForAutomation;

	// Reusuable methods	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");	
	}

	public void closeBrowser() {		
		driver.close();
		System.out.println("Browser is Closed");	
	}

	public void navigateToHomePage() {		
		home.click();
		System.out.println("Page Navigated to Home Page");		
	}
		
	public void navigateToSeleniumAutomationCurriculum() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(courseOffered).perform();	
		seleniumAutomationCurriculum.click();
		System.out.println("Page Navigated to A to Z Selenium Automation Curriculum Successfully");	
	}

	public void navigateToAutomationToolsCurriculum() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(courseOffered).perform();	
		automationToolsCurriculum.click();
		System.out.println("Page Navigated to A to Z QA Automation Tools Curriculum Successfully");	
	}
		

	public void navigateToRegistrationForm() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		registrationForm.click();	
		System.out.println("Page Navigated to Registration Form Successfully");	
		
	}

	public void navigateToAlertPopUp() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		alertPopUp.click();		
		System.out.println("Page Navigated to Alert and PopUp Successfully");	
	}

	public void navigateToMultipleWindows() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		multipleWindows.click();	
		System.out.println("Page Navigated to Multiple Windows Successfully");	
	}

	public void navigateToWebTable() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();			
		mouseHover.moveToElement(practiceAutomation).perform();	
		webTable.click();		
		System.out.println("Page Navigated to Web Table Successfully");	
	}
	
	public void navigateToMouseEvent() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();			
		mouseHover.moveToElement(practiceAutomation).perform();	
		mouseEvent.click();		
		System.out.println("Page Navigated to Mouse Event Successfully");	
	}	
	
	public void navigateToProgressBar() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();			
		mouseHover.moveToElement(practiceAutomation).perform();	
		progressBar.click();		
		System.out.println("Page Navigated to Progress Bar Successfully");	
	}
	
	public void navigateToDynamicTransaction() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();			
		mouseHover.moveToElement(practiceAutomation).perform();	
		dynamicTransaction.click();		
		System.out.println("Page Navigated to Dynamic Transaction Successfully");	
	}
	
	public void navigateToFrames() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();			
		mouseHover.moveToElement(practiceAutomation).perform();	
		iFrames.click();		
		System.out.println("Page Navigated to Frame Successfully");	
	}

	public void navigateToTechTalk() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();		
		techTalk.click();		
		System.out.println("Page Navigated to Tech Talk Successfully");	
	}

	public void navigateToTestimonials() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();		
		testimonials.click();	
		System.out.println("Page Navigated to Testimonials Successfully");	
	}

	public void navigateToPythonForAutomation() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		pythonForAutomation.click();	
		System.out.println("Page Navigated to Python For Automation Successfully");	
	}	

}
