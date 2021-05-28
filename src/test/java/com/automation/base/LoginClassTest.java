package com.automation.base;



import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.config.ConfigFileReader;

public class LoginClassTest {
	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div[2]/button")
	WebElement loginToEngage;
	
	@FindBy(id="identifierId")
	WebElement loginEmail;
	
	@FindBy(id="identifierNext")
	WebElement emailNextButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="passwordNext")
	WebElement passwordNext;
	
	
	ConfigFileReader config = new ConfigFileReader();
	protected Properties properties = config.initialize();
	public WebDriver login() {
	
		driver = new ChromeDriver();
		
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
	        	
	        	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys(");
	        	//password.sendKeys(properties.getProperty("password"));
	        	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(password)).sendKeys(properties.getProperty("password"));
	        	passwordNext.click();
	        }
	    }
	    
		
	    driver.switchTo().window(mainWindowHandle);
	    return driver;
	    
	    
	}
}
