package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef {
	
	
	WebDriver driver;
	
	
	@Given("^user is on Guru(\\d+) home page$")
	public void user_is_on_Guru_home_page(int arg1)  {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Eclipse/Google Chrome Drivers_87/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	    
	}

	@Then("^user enters username$")
	public void user_enters_username() throws InterruptedException  {
		
		
		driver.findElement(By.name("uid")).sendKeys("mngr300657");
		Thread.sleep(3000);
		
	}

	@Then("^user enters passowrd$")
	public void user_enters_passowrd() throws InterruptedException  {
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("mAnames");
	    
	}

	@Then("^user clicks on Reset button$")
	public void user_clicks_on_Reset_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("btnReset")).click();
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

	
	
}
