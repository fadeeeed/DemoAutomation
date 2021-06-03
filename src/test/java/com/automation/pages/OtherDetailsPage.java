package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherDetailsPage {
	private WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/label[2]/span[1]/span[1]/input")
	WebElement ehiNo;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div[1]/label[1]/span[1]/span[1]/input")
	WebElement ehiYes;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/label[2]/span[1]/span[1]/input")
	WebElement earNo;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input")
	WebElement earYes;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[1]/span[1]/span[1]/input")
	WebElement sustained;
	
	@FindBy(name="ehiExemptionReason")
	WebElement exemptionReason;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[2]/span[1]/span[1]/input")
	WebElement shortTerm;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[3]/span/div/div/input")
	WebElement dateWidget;
	
	@FindBy(xpath="//*[contains(text(), 'OK')]")
	WebElement currentDate;
	
	@FindBy(xpath="//*[contains(text(), 'PREVIOUS')]")
	WebElement previousButton;
	
	@FindBy(xpath="//*[contains(text(), 'CANCEL')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//*[contains(text(), 'ADD')]")
	WebElement addButton;
	
	

	public OtherDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setExemptionReason(String exemptionReason) {
		this.exemptionReason.sendKeys(exemptionReason);
	}

	public WebElement getEhiNo() {
		return ehiNo;
	}
	public WebElement getEarNo() {
		return earNo;
	}
	public WebElement getEarYes() {
		return earYes;
	}
	public WebElement getSustained() {
		return sustained;
	}
	public WebElement getPreviousButton() {
		return previousButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public WebElement getEhiYes() {
		return this.ehiYes;
	}

	public WebElement getExemptionReason() {
		return this.exemptionReason;
	}

	public WebElement getShortTerm() {
		return this.shortTerm;
	}

	public WebElement getDateWidget() {
		return this.dateWidget;
	}

	public WebElement getCurrentDate() {
		return this.currentDate;
	}

	public WebElement getAddButton() {
		return addButton;
	}
	
	
}
