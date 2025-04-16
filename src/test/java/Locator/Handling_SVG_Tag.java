package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_SVG_Tag {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to URL
		driver.navigate().to("https://www.flipkart.com/");
		
		//Step3: Identify the web-element
		WebElement element = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Thread.sleep(3000);
		element.sendKeys("Puma Shoes");
	
		//Identify the svg tag and perform action
		WebElement element1 = driver.findElement(By.xpath("//*[name()='svg'][@fill='none']"));
		element1.click();
		
		//Thread
		Thread.sleep(5000);

		//Step4: close the browser
		driver.close();
		
	}

}
