package com.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.base.HomePage;
import com.automation.base.LoginPage;

public class HomePageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void homePageAssertions() {
		LoginPage logginIn = new LoginPage(driver);
		logginIn.login();
		HomePage home = new HomePage(driver);
		home.addNewProductButton();
		System.out.println("Driver in homeAssertion "+  driver.getCurrentUrl());
	}
	
}
