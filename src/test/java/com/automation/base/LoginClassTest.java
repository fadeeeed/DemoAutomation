package com.automation.base;



import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.config.ConfigFileReader;

public class LoginClassTest {
	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div[2]/button")
	WebElement loginToEngage;
	
	@FindBy(id="identifierId")
	WebElement loginEmail;
	
	@FindBy(id="identifierNext")
	WebElement emailNextButton;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
	WebElement password;
	
	@FindBy(id="passwordNext")
	WebElement passwordNext;
	
	
	ConfigFileReader config = new ConfigFileReader();
	protected Properties properties = config.initialize();
	public WebDriver login() {
	
		driver = new FirefoxDriver();
		
		PageFactory.initElements(driver,this);
		
		driver.get(properties.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		
		loginToEngage.click();
		
		String mainWindowHandle = driver.getWindowHandle();
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    
	    Iterator<String> iterator = allWindowHandles.iterator();
	 
	    
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
		while (iterator.hasNext()) {
	    	String ChildWindow = iterator.next();
	        
	    	if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	        	driver.switchTo().window(ChildWindow);
	      
	        	loginEmail.sendKeys(properties.getProperty("email"));
	     
	        	emailNextButton.click();
	        	
	        	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        	
	        	password.sendKeys(properties.getProperty("password"));
	        	
	        	passwordNext.click();
	        }
	    }
	    
		
	    driver.switchTo().window(mainWindowHandle);
	    return driver;
	    
	    
	}
}
