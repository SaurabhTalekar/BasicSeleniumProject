package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_Locator_Relative_Path {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the URL
		driver.navigate().to("https://www.facebook.com/login/");
		
		//Step3: identify the WebElement using XPath by Relative Path
		
		//Using Attribute
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		
		//Using Text
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'acc')]"));          //Forget Password? Link
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));   //Sign up for Facebook Link
		
		
		//Step4: Perform the action on WebElement
		element1.sendKeys("Saurabh");
		element2.click();
		
		//Thread
		Thread.sleep(3000);
		
		//Step5: close the browser
		driver.close();

	}

}
