package SeleniumPracticeSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) {
        
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Eclipse/Google Chrome Drivers_87/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		thread.sleep(3000);
	
		driver.manage().window().maximize();
		
		
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		String CurrentTitle=driver.getTitle();
		System.out.println(CurrentTitle);
	

		
	}

}
