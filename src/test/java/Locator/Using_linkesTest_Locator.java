package Locator;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_linkesTest_Locator {

	public static void main(String[] args) {
		
		//Set up The browser       
		WebDriverManager.chromedriver().setup();
        
        //Launch the Browse
        WebDriver driver = new ChromeDriver();
        
        //Maximize the browse
        //driver.manage().window().setSize(new org.openqa.selenium.Dimension(1000, 1000));
        //driver.manage().window().setPosition(new Point(100, 100));
        
        
        //Navigate to the url
        driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/webpage.html");
        
        //Identify the element using the LinkText
        WebElement linktext = driver.findElement(By.linkText("Contact Us"));
        
        //Step5: Perform the action
        linktext.click();
        
        //Step5: close the Browser
        driver.quit();
	}

}
