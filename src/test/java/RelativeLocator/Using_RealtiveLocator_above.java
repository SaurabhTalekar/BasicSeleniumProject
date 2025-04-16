package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_RealtiveLocator_above {

	
public static void main(String[] args) throws InterruptedException {
			
			//Open the browser
			WebDriver driver = new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Navigate to the url
			driver.get("https://www.facebook.com/login/");
			
			//Identifying the password field
			WebElement element = driver.findElement(By.id("pass"));
			
			//Identify the Webelement using the relative locator
			driver.findElement(RelativeLocator.with(By.tagName("input")).above(element)).sendKeys("Saurabh");
			
			Thread.sleep(3000);
			
			driver.quit();  

	}

}
