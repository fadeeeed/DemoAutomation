package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkFromNetsuitePage {
	
	private WebDriver driver;
	
	@FindBy(name="dlName")
	WebElement dlName;
	
	@FindBy(name="cemName")
	WebElement cemName;
	
	@FindBy(name="client")
	WebElement clientName;
	
	@FindBy(name="dlEmail")
	WebElement dlEmail;
	
	@FindBy(name="cemEmail")
	WebElement cemEmail;
	
	@FindBy(xpath="//*[contains(text(), 'CANCEL')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//*[contains(text(), 'NEXT')]")
	WebElement nextButton;
	
	public LinkFromNetsuitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getDlName() {
		return this.dlName;
	}

	public WebElement getCemName() {
		return cemName;
	}

	public WebElement getClientName() {
		return clientName;
	}

	public WebElement getDlEmail() {
		return dlEmail;
	}

	public WebElement getCemEmail() {
		return cemEmail;
	}


	public WebElement getNextButton() {
		return nextButton;
	}
	
	public void clickNext() {
		this.nextButton.click();
	}

	public void setDlName(String dlName) {
		this.dlName.sendKeys(dlName);;
	}

	public void setCemName(String cemName) {
		this.cemName.sendKeys(cemName);
	}

	public void setClientName(String clientName) {
		this.clientName.sendKeys(clientName);;
	}

	public void setDlEmail(String dlEmail) {
		this.dlEmail.sendKeys(dlEmail);;
	}

	public void setCemEmail(String cemEmail) {
		this.cemEmail.sendKeys(cemEmail);;
	}

}
