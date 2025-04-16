package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_CssSelector_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the application via URL
        driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/webpage.html");

		//Step3: Identify the element
        WebElement element =driver.findElement(By.cssSelector("input[id=name]"));
        WebElement element1 =driver.findElement(By.cssSelector("input[type=email]"));
        WebElement element2 =driver.findElement(By.cssSelector("input[id=female]"));
        WebElement element3 =driver.findElement(By.cssSelector("input[id=manali]"));
        WebElement element4 =driver.findElement(By.cssSelector("input[id=goa]"));
        
        WebElement element5 =driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[1]/td[2]/input")); //Absulute path //button
        
        //Step4: Perform action
        element.sendKeys("Saurabh");                //First name
        element1.sendKeys("Saurabh1@gmail.com");    //Email
        element2.click();                           //radio
        element3.click();                           //Checkbox
        element4.click();                           // unselect check goa
       
        //Thread
        Thread.sleep(3000);
        
        //Close the bowser
        driver.quit();

	}

}
