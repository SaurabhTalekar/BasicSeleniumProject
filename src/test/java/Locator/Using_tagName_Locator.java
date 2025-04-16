package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_tagName_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the bowser
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser 
        WebDriver driver = new ChromeDriver();
        
        //navigate to URL
        driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/register.html");
        
        //Maximize the browser
        driver.manage().window().maximize();
        
        //Identify the webElement
        WebElement element = driver.findElement(By.tagName("input"));
        //WebElement element1 = driver.findElement(By.tagName("a"));
        
        //Perform the action
        element.sendKeys("Saurabh@gmail.com");
        element.click();
        
        //Sleep
       Thread.sleep(5000);
        driver.close();
        
	}
	
	

}
