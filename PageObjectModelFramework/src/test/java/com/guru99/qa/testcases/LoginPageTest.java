package com.guru99.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.pages.LoginPage;
import com.guru99.qa.pages.NewCustomer;
import com.guru99.qa.testbase.TestBase;



public class LoginPageTest extends TestBase {
	
	LoginPage LoginPage;
	
	NewCustomer home;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	
	{
		initialisation();
		
		LoginPage LoginPage = new LoginPage();
	}
	
	@Test
	public void validateLoginPage()
	{
		String Title = LoginPage.validateLoginPage();
		
		Assert.assertEquals(Title, "Guru99 Bank Home Page");
		
		String Expected = "Guru99 Bank Home Page";
		
		 if (Title.equals(Expected)) {
			 
             System.out.println("Title Matched--->Test Passed!");
  } 
		 
		 else 
		 
		 {
             System.out.println("Test Failed--Title Not Matched");
  }
	
	}
	
	@Test
	public void ValidateCurrentUrl()
	
	{
		String CurrentURL= driver.getCurrentUrl();
		
		Assert.assertEquals(CurrentURL, "http://demo.guru99.com/V4/" );
		String ExpectedURL= "http://demo.guru99.com/V4/";
		System.out.println("URL matching --> Part executed");
		
		
		if(CurrentURL.equals(ExpectedURL))
			
		{
			System.out.println("URL Title Matched--->Test Passed!");
		  } 
				 
				 else 
				 
				 {
		          System.out.println("Test Failed--Title URL Not Matched");
		         }
	}
	
	@Test
	public void logintest()
	
	{
		LoginPage.Login(prop.getProperty("username"),prop.getProperty("mAnames"));
		//Login.LoginPage(prop.getProperty(username)),
		//NewCustomer.Login(prop.getProperty(username),prop.getProperty(username));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
