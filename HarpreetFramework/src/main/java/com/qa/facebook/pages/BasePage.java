package com.qa.facebook.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public    class BasePage {
	
	public Properties prop ;
	
	public WebDriver driver;
	
	public 	WebDriver   initializeDriver(){
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().fullscreen();
	
		return driver;	
	 

	 
	 
}
	
	public 	Properties  initializeProperties(){
		
		 prop = new Properties();
		
		 try {
			FileInputStream ip  = new  FileInputStream("C:\\Workspace\\HarpreetFramework\\src\\main\\java\\com\\qa\\facebook\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
	return prop;


	}
}