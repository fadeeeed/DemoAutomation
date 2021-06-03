package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.EngageProductDetailsPage;


public class EngageProductDetailsTest extends LinkFromNetsuiteTest {
	String projectName = "test_project";
	String sponsorName = "test_sponsor";
	String sponsorEmail = "test_sponsor_email@3pillarglobal.com";
	
	
	@Test(priority=3)
	public void checkRequiredField() {
		EngageProductDetailsPage engage = new EngageProductDetailsPage(driver);
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(engage.getProjectName().isEnabled(),true, "Project name is not selectable");
		engage.setProjectName(projectName);
		soft.assertEquals(engage.getProjectName().getAttribute("value"), projectName, "Project name is not set");
		
		soft.assertEquals(engage.getSponsorName().isEnabled(), true, "Sponsor Name is not selectable");
		engage.setSponsorName(sponsorName);
		soft.assertEquals(engage.getSponsorName().getAttribute("value"), sponsorName, "Sponsor Name is not set");
		
		soft.assertEquals(engage.getSponsorEmail().isEnabled(), true, "Sponsor Email is not selectable");
		engage.setSponsorEmail(sponsorEmail);
		soft.assertEquals(engage.getSponsorEmail().getAttribute("value"), sponsorEmail,"Sponsor Email is not set");
		
		soft.assertEquals(engage.getCancelButton().isEnabled(), true,"Cancel Button is not clickable");
		
		soft.assertEquals(engage.getPreviousButton().isEnabled(), true, "Previous button is not clickable");
		
		
		Assert.assertEquals(engage.getNextButton().isEnabled(), true,"Next button is not clickable");
		
		engage.getNextButton().click();
		soft.assertAll();
	}
}

