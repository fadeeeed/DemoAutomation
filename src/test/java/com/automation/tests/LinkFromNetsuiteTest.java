package com.automation.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.LinkFromNetsuitePage;

public class LinkFromNetsuiteTest extends HomePageTest {
	
	String dlName = "test_dl";
	String cemName = "test_cem";
	String clientName = "test_client";
	String dlEmail = "test_dl@3pillarglobal.com";
	String cemEmail = "test_cem@3pillarglobal.com";
	
	@Test(priority=2)
	public void linkNetsuiteAssertions() {
		LinkFromNetsuitePage netsuite = new LinkFromNetsuitePage(driver);
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(netsuite.getDlName().isEnabled(), true , "Dl Name is not selectable");
		netsuite.setDlName(dlName);
		soft.assertEquals(netsuite.getDlName().getAttribute("value"), dlName,"Dl name is not set");
		
		soft.assertEquals(netsuite.getCemName().isEnabled(), true,"Ceme name is not selectable");
		netsuite.setCemName(cemName);
		soft.assertEquals(netsuite.getCemName().getAttribute("value"),cemName,"Cem Name is not set");
		
		soft.assertEquals(netsuite.getClientName().isEnabled(), true,"Client Name is not selectable");
		netsuite.setClientName(clientName);
		soft.assertEquals(netsuite.getClientName().getAttribute("value"), clientName,"Client Name is not set");
		
		soft.assertEquals(netsuite.getDlEmail().isEnabled(), true,"Dl Email is not selectable");
		netsuite.setDlEmail(dlEmail);
		soft.assertEquals(netsuite.getDlEmail().getAttribute("value"), dlEmail,"Dl Email is not set");
		
		soft.assertEquals(netsuite.getCemEmail().isEnabled(), true,"Cem Email is not selectable");
		netsuite.setCemEmail(cemEmail);
		soft.assertEquals(netsuite.getCemEmail().getAttribute("value"),cemEmail,"CemEmail is not set");
		
		//soft.assertEquals(netsuite.getCrossButton().isEnabled(), true, "Cross button is not clickable");
		
		soft.assertEquals(netsuite.getCancelButton().isEnabled(), true, "Cancel button is not clickable");
		
		netsuite.clickNext();
		
		soft.assertAll();
	}
	
}