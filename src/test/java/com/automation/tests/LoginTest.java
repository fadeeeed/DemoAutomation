package com.automation.tests;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

	static Logger log = Logger.getLogger(BaseTest.class.getName());
	
	@Test(priority=0)
	public void loginAssertions() {
		
		LoginPage logginIn = new LoginPage(driver);
		
		logginIn.login();
		
	}
}
