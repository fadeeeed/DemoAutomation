package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginAssertions {
	
	WebDriver driver;
	@Test
	public void demoAssert() {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		SoftAssert soft = new SoftAssert();
		
		
		soft.assertEquals(driver.getCurrentUrl(), "https://www.google");
		soft.assertAll();
	}
	
}

