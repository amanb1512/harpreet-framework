package com.qa.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	
	@FindBy(xpath = "// input[@name = 'email']")
	
	WebElement email ;
	
	@FindBy(xpath= "// input[@id = 'pass']")
	
	WebElement password ;

	
	
	@FindBy(xpath = "// input[@value  = 'Log In']")
	
	WebElement login;
	 
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
		
		
		public String getLoginPageTitle() {
			
		return driver.getTitle();
		}
		public void login( String un,String pwd) {
			
			email.sendKeys(un);
			password.sendKeys(pwd);
			login.click();
		}
	}

