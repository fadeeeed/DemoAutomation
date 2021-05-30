package com.automation.tests;

import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.LinkFromNetsuitePage;

public class LinkFromNetsuiteTest extends HomePageTest {
	
	
	String dlName = "test_dl";
	String cemName = "test_cem";
	String clientName = "test_client";
	String dlEmail = "test_dl@3pillarglobal.com";
	String cemEmail = "test_cem@3pillarglobal.com";
	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority=2)
	public static void linkNetsuiteAssertions() {
		LinkFromNetsuitePage netsuite = new LinkFromNetsuitePage(driver);
		SoftAssert soft = new SoftAssert();
		
		HashMap<WebElement, Boolean> elements = new HashMap<WebElement, Boolean>();
		elements = netsuite.isDisplayed();	 
		
		soft.equals(elements.get("dlName"));
		
		soft.equals(elements.get("dlEmail"));
		
		soft.equals(elements.get("cemName"));
		
		soft.equals(elements.get("cemEmail"));
		
		soft.equals(elements.get("clientName"));
		
		soft.assertAll();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority=3)
	public void isEnabled() {
		LinkFromNetsuitePage netsuite = new LinkFromNetsuitePage(driver);
		SoftAssert soft = new SoftAssert();
		
		HashMap<WebElement, Boolean> elements = new HashMap<WebElement, Boolean>();
		elements = netsuite.isEnabled();	 
		
		soft.equals(elements.get("dlName"));
		
		soft.equals(elements.get("dlEmail"));
		
		soft.equals(elements.get("cemName"));
		
		soft.equals(elements.get("cemEmail"));
		
		soft.equals(elements.get("clientName"));
		
		soft.assertAll();
	}
	
	@Test(priority=4)
	public void fieldAssertions() {
		LinkFromNetsuitePage netsuite = new LinkFromNetsuitePage(driver);
		SoftAssert soft = new SoftAssert();
		
		netsuite.setDlName(dlName);
		netsuite.setCemName(cemName);
		netsuite.setClientName(clientName);
		netsuite.setDlEmail(dlEmail);
		netsuite.setCemEmail(cemEmail);
		
		soft.assertEquals(netsuite.getDlName().getAttribute("value"), dlName,"Dl name is not set");
		soft.assertEquals(netsuite.getCemEmail().getAttribute("value"),cemEmail,"CemEmail is not set");
		soft.assertEquals(netsuite.getCemName().getAttribute("value"),cemName,"Cem Name is not set");
		soft.assertEquals(netsuite.getClientName().getAttribute("value"), clientName,"Client Name is not set");
		soft.assertEquals(netsuite.getDlEmail().getAttribute("value"), dlEmail,"Dl Email is not set");
		
		netsuite.getNextButton().click();
		soft.assertAll();
	}
}
