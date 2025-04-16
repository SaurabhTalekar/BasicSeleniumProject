package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_ByContains {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup the browser
		WebDriverManager.chromiumdriver().setup();
		
		//Step1: Open the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the application
		driver.navigate().to("https://www.facebook.com/login/");
		
		//Step3: Identify the element using XPath by contains Using  
		
		//Using Attribute
		WebElement element = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));  //UserName field
		
		//Using Text
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'acc')]"));
		
		//Step4: Perform the action
		element.sendKeys("Saurabh");
		element1.click();
		
		//Thread
		Thread.sleep(3000);
		
		//Step5: close the browser
		driver.close();

	}

}
