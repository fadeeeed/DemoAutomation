package com.automation.tests;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

	static Logger log = Logger.getLogger(BaseTest.class.getName());
	
	@Test(priority=0)
	public void loginAssertions() {
		
		log.info("Login Test Execution Started");
		
		LoginPage logginIn = new LoginPage(driver);
		
		logginIn.login();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://stage-engage.3pillarglobal.com/projects", "Loggin Unsuccessful");
		
		log.info("Login Test Execution SuccessFull");
	}
}
