package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_Locator_StartsWith {

	public static void main(String[] args) throws InterruptedException {
		
		// configure
		WebDriverManager.chromedriver().setup();
		
		//open browser
		WebDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
				
		//navigate to url
		driver.get("https://www.facebook.com/");
				
		//finding element using starts-with
		WebElement emailTextfield = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email')]"));
				
		// send-keys		
		emailTextfield.sendKeys("albin@facebook");


		//using text()&value
		WebElement CreateaccButton = driver.findElement(By.xpath("//a[starts-with(text(),'Create new')]"));
				
		
				
		//perform-Action
	    CreateaccButton.click();
	    
	    Thread.sleep(2000);
	    
	    //Step: Close the browser
	    driver.quit();

	}

}
