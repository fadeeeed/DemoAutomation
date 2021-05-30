package com.automation.pages;

import java.util.HashMap;

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
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[4]/button[2]")
	WebElement nextButton;
	
	public LinkFromNetsuitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	
	public void submitDetails() {
		this.nextButton.click();
	}
	
	public HashMap<WebElement, Boolean> isEnabled(){
		HashMap<WebElement, Boolean> elements = new HashMap<WebElement, Boolean>();
		elements.put(this.dlName, this.dlName.isEnabled());
		elements.put(this.dlEmail, this.dlEmail.isEnabled());
		elements.put(this.cemEmail,this.cemEmail.isEnabled());
		elements.put(this.cemName, this.cemName.isEnabled());
		elements.put(this.clientName, this.clientName.isEnabled());
		return elements;
	}
	
	public HashMap<WebElement, Boolean> isDisplayed(){
		HashMap<WebElement, Boolean> elements = new HashMap<WebElement, Boolean>();
		elements.put(this.dlName, this.dlName.isDisplayed());
		elements.put(this.dlEmail, this.dlEmail.isDisplayed());
		elements.put(this.cemEmail,this.cemEmail.isDisplayed());
		elements.put(this.cemName, this.cemName.isDisplayed());
		elements.put(this.clientName, this.clientName.isDisplayed());
		return elements;
	}
	
}
