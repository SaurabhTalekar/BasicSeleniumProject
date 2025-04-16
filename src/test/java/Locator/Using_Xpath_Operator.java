package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_Operator {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the URL
		driver.navigate().to("https://www.flipkart.com/");
		
		//Step3: Identify the WebElement
		WebElement element = driver.findElement(By.xpath("//input[@class='Pke_EE' and @type='text']"));
		element.sendKeys("iphone 15");
		Thread.sleep(5000);
		
		//Identify the svg
		WebElement element1 = driver.findElement(By.xpath("(//*[name() = 'svg'])[1]"));
		element1.click();
		Thread.sleep(5000);
		
		//click on the searched mb
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)' or @class=k]"));
		element2.click();
		Thread.sleep(5000);
		
		//Thread
		Thread.sleep(5000);

		//Step4: close the browser
		driver.close();
		
		
		

	}

}
