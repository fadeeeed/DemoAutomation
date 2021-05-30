package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(id="add-new-project")
	WebElement addNewProductButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddNewProductButton() {
		return addNewProductButton;
	}

	public void addNewProductButton() {
		addNewProductButton.click();
		System.out.println("Driver in homePage: "+this.driver);
	}
}
