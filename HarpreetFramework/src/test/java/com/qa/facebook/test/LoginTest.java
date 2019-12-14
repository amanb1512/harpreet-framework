package com.qa.facebook.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.facebook.pages.BasePage;
import com.qa.facebook.pages.LoginPage;



public class LoginTest {
	
	
	public BasePage basePage;
	
	public WebDriver driver;
	
	public Properties prop;
	 public LoginPage loginPage;
	
	@BeforeMethod
	
	public void setUp() {
		
		basePage = new BasePage();
		
		prop=  basePage.initializeProperties();
	 
		driver = 	basePage.initializeDriver();
		
		
		driver.get(prop.getProperty("url"));
		
		loginPage = new LoginPage(driver);
	 
	 
		
	}
 
	
	@Test(priority = 1)
	
	public void verifyLoginPageTitleTest() {
		
	String title =	loginPage.getLoginPageTitle();
	System.out.println("the login page title is: " +title);
	
	Assert.assertEquals(title, "facebook login");
	
	}
	@Test(priority = 2)
	
	public void loginCorrectCredentialTest() {
		
		loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
		
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	


	
}
