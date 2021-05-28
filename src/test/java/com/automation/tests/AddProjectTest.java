package com.automation.tests;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.base.*;
import com.automation.config.ConfigFileReader;

public class AddProjectTest {
	ConfigFileReader config = new ConfigFileReader();
	protected WebDriver driver;
	protected Properties properties = config.initialize();
	
	@Test
	public void f() {
		LoginClassTest logginIn = new LoginClassTest();
		driver = logginIn.login();
	    driver.findElement(By.id("add-new-project")).click();
	    //Adding Project
	    String dLName = "Dummy";
	    String cemName = "Dummy1";
	    String clientName = "Dummy2";
	    String dLEmail = "rupesh.sengar@3pillarglobal.com";
	    String cemEmail = "riti.mishra@3pillarglobal.com";
	    driver.findElement(By.name("dlName")).sendKeys(dLName);
	    driver.findElement(By.name("cemName")).sendKeys(cemName);
	    driver.findElement(By.name("client")).sendKeys(clientName);
	    driver.findElement(By.name("dlEmail")).sendKeys(dLEmail);
	    driver.findElement(By.name("cemEmail")).sendKeys(cemEmail);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[2]")).click();
	    
	    SoftAssert soft = new SoftAssert();
	    String projectName = "Automation1";
	    String sponsorName = "Dummy3";
	    String sponsorEmail = "rupesh.sengar@3pillarglobal.com";
	    driver.findElement(By.name("projectName")).sendKeys(projectName);
	    driver.findElement(By.name("sponsorName")).sendKeys(sponsorName);
	    driver.findElement(By.name("sponsorEmail")).sendKeys(sponsorEmail);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[3]")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/label[1]/span[1]/span[1]/input")).click();
	    driver.findElement(By.name("ehiExemptionReason")).sendKeys("test");
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[2]/span[1]/span[1]/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[3]/span/div/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/button[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[3]")).click();
	    //driver.get("https://stage-engage.3pillarglobal.com/projects");
	 
	}
}
