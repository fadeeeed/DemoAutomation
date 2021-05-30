package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.HomePage;

public class HomePageTest extends LoginTest {
	
	
	@Test(priority=1)
	public void homePageAssertions() {
		
		HomePage home = new HomePage(driver);
		SoftAssert soft = new SoftAssert();
		
		Assert.assertEquals(home.getAddNewProductButton().isEnabled(), true, "Add New Product Button Is Not enabled");
		home.addNewProductButton();
		
		soft.assertEquals(driver.getCurrentUrl(), "https://stage-engage.3pillarglobal.com/projects/add", "Url is not valid");
		soft.assertAll();
		
	}
}
