package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_className_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the bowser
				WebDriverManager.chromedriver().setup();
				
				//Launch the crime browser 
		        WebDriver driver = new ChromeDriver();
		        
		        //navigate to URL
		        driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/webpage.html");
		        
		        //Maximize the browser
		        driver.manage().window().maximize();
		        
		        //Identify the webElement using class name
		        //WebElement element = driver.findElement(By.className("123 456 789 emailtxt"));
		        WebElement element = driver.findElement(By.className("emailtxt"));
		        
		        
		        //Perform the action
		        element.sendKeys("Saurabh@gmail.com");
		       // element.click();
		        
		        //Sleep 
		        Thread.sleep(5000);
		        driver.close();

	}

}
