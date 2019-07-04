package Locators;



import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class locatorsTest {
	public WebDriver driver;
	
	@Test
	public void getChrome() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Drivers\\chromedriver.exe");
		// ChromeDriverService service = ChromeDriverService.createDefaultService();
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.guru99.com/");		
		driver.findElement(By.xpath("//a[.='SAP Beginner']/ancestor::div[1]")).isDisplayed();		
		driver.findElement(By.xpath("//a[.='SAP Beginner']/ancestor::div[1]//child::a")).isDisplayed();		
		driver.findElement(By.xpath("//*[@type='submit']//preceding::input")).isDisplayed();
		
		

		
		 

		
		  driver.get("http://demo.guru99.com/v1");
		  
		  driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).
		  isDisplayed();
		  driver.findElement(By.xpath("//input[@type='submit']/preceding::input")).
		  isDisplayed();
		  driver.findElement(By.xpath("//input[@type='submit']/following-sibling::input"))
		  .isDisplayed();
		  driver.findElement(By.xpath("//td[text()='UserID']")).isDisplayed();
		  driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).
		  isDisplayed();
		  driver.findElement(By.xpath("//*[contains(@name,'btn')]")).isDisplayed();
		  driver.findElement(By.xpath("//*[@type='submit' or @name='btnReset']")).
		  isDisplayed();
		  driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).
		  isDisplayed();

		  

		  driver.get("http://demo.guru99.com/test/facebook.html");
		  driver.findElement(By.id("pass")).isDisplayed();
		  driver.findElement(By.cssSelector("input#pass")).isDisplayed();//CSS with  ID, we use #
		  driver.findElement(By.cssSelector("input.inputtext")).isDisplayed();//CSS  with class, we use .
		  driver.findElement(By.cssSelector("input[id*='pass']")).isDisplayed(); //CSS	  with text contains we use *
		  driver.findElement(By.cssSelector("input[id^='pass']")).isDisplayed(); //CSS	  with starts with we use ^
		  driver.findElement(By.cssSelector("input[id$='pass']")).isDisplayed(); //  CSS with ends with we use $
		 		
		
	}
	
	
	
	
	

}
