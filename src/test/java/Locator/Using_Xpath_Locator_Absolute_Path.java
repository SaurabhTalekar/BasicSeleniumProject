package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_Locator_Absolute_Path {

	public static void main(String[] args) throws InterruptedException {
		
		        //Configure the browser
				WebDriverManager.chromedriver().setup();
				
				//Step1: Launch the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Step2: Navigate to the application via URL
		        driver.navigate().to("https://www.facebook.com/login/");

				//Step3: Identify the element
		        
		        //Absolute XPath
		        WebElement element =driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/form/div/div/input"));
		        
		        //Step4: Perform action
		        element.sendKeys("Saurabh");             
		        
		        //Thread
		        Thread.sleep(3000);
		        
		        //Step5: Close the bowser
		        driver.quit();


	}

}
