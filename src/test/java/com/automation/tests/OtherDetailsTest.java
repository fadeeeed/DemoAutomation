package com.automation.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.OtherDetailsPage;

public class OtherDetailsTest extends EngageProductDetailsTest {
	String reason = "Product_testing";
	
	@Test(priority=6)
	public void otherDetailsAssertions() {
		OtherDetailsPage other = new OtherDetailsPage(driver);
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(other.getEhiYes().isDisplayed(),true,"EHI Yes Button is not visible");
		soft.assertEquals(other.getEhiYes().isEnabled(), true,"EHI Yes Button is not Enabled");
		
		other.getEhiYes().click();
		
		soft.assertEquals(other.getExemptionReason().isDisplayed(), true,"Exemption reason is not visible");
		soft.assertEquals(other.getExemptionReason().isEnabled(), true,"Exemption reason is not enabled");
		other.setExemptionReason(reason);
		soft.assertEquals(other.getExemptionReason().getAttribute("value"), reason,"Value is not set in exemption reason");
		
		soft.assertEquals(other.getShortTerm().isEnabled(), true,"Short term button is not enabled");
		other.getShortTerm().click();
		
		soft.assertEquals(other.getDateWidget().isEnabled(), true,"Date Widget is not available");
		other.getDateWidget().click();
		other.getCurrentDate().click();
		soft.assertEquals(other.getDateWidget().getAttribute("value"), java.time.LocalDate.now(), "Date is not selected properly");
		
		soft.assertEquals(other.getAddButton().isEnabled(), true,"Add Button is not enabled");
		other.getAddButton().click();
		
		soft.assertAll();
	}
}
