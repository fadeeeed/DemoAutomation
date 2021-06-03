package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EngageProductDetailsPage {
	private WebDriver driver;
	
	@FindBy(name="projectName")
	WebElement projectName;
	
	@FindBy(name="sponsorName")
	WebElement sponsorName;
	
	@FindBy(name="sponsorEmail")
	WebElement sponsorEmail;
	
	@FindBy(xpath="//*[contains(text(), 'NEXT')]")   
	WebElement nextButton;
	
	@FindBy(xpath="//*[contains(text(), 'CANCEL')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//*[contains(text(), 'PREVIOUS')]")
	WebElement previousButton;
	
	
	
	public EngageProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}

	public WebElement getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName.sendKeys(sponsorName);
	}

	public WebElement getSponsorEmail() {
		return sponsorEmail;
	}

	public void setSponsorEmail(String sponsorEmail) {
		this.sponsorEmail.sendKeys(sponsorEmail);;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	
}
