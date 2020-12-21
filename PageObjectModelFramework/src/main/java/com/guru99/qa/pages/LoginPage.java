package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory --Object Repository
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement Loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String validateLoginPage()
	{
		return driver.getTitle();
	}
	
	public String ValidateCurrentUrl()
	
	{
		return driver.getCurrentUrl();
	}
	
	public NewCustomer Login(String UserName, String PassWord)
	
	{
		username.sendKeys(UserName);
		password.sendKeys(PassWord);
		Loginbutton.click();
		
		return new NewCustomer();
	}
}
