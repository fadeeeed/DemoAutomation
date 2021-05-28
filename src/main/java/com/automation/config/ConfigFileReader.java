package com.automation.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/** This is the MainClass and is being inherited in all the logic pages. */
public class ConfigFileReader {
	
	protected static Properties properties;
	private final String propertyFilePath= "C:\\Users\\rupesh.sengar\\eclipse-workspace\\demoAutomationSprint\\configs\\Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} 
	}
	public Properties initialize() {
		return properties;
	}
}