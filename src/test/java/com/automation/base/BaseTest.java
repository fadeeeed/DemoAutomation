package com.automation.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.config.ConfigFileReader;


public class BaseTest {

	public static WebDriver driver;
	ConfigFileReader config = new ConfigFileReader();
	protected Properties properties = config.initialize();
	
	static Logger log = Logger.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Driver created Successfully");
	}
}
	
