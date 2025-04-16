package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the application via URL
		driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/register.html");
		
		//Step3: Identify the WeElement using ID Locator
        WebElement element = driver.findElement(By.id("name"));
        WebElement element1 = driver.findElement(By.id("check-female"));
        WebElement element2 = driver.findElement(By.id("check-Hyderabad"));
        
        //Step4: Validate the element
        boolean result = element.isDisplayed();
        if (result == true) {
        	System.out.println("Text field is present");
        }else {
        	System.out.println("Text field is not present");
        }
        //radio button
        boolean result1 = element1.isDisplayed();
        if (result1 == true) {
        	System.out.println("Radio button is present");
        }else {
        	System.out.println("Radio button is not present");
        }
        //checkbox
        boolean result2 = element2.isDisplayed();
        if (result2 == true) {
        	System.out.println("checkbox is present");
        }else {
        	System.out.println("checkbox is not present");
        } 
        
        //Strp5: Enter the data
        element.sendKeys("Saurabh Vijay Talekar");
        element1.click();
        element2.click();
        
        Thread.sleep(3000);
        //Close the browser
        driver.quit();
        
        //Execution completed message
        System.out.println("********Execution completed*********");
        
	}

}




 