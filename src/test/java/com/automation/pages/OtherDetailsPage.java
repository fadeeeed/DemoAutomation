package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherDetailsPage {
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/label[1]/span[1]/span[1]/input")
	WebElement ehiYes;
	
	@FindBy(name="ehiExemptionReason")
	WebElement exemptionReason;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[2]/span[1]/span[1]/input")
	WebElement shortTerm;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[3]/span/div/div/input")
	WebElement dateWidget;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/button[2]")
	WebElement currentDate;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[4]/button[3]")
	WebElement addButton;

	public OtherDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setExemptionReason(String exemptionReason) {
		this.exemptionReason.sendKeys(exemptionReason);;
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
