package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_ByAxis {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the url
		driver.navigate().to("https://www.amazon.in/");
		
		//Step3: Identify the element
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("iphone 15");
		
		//trasnsvering to the SVG tab of Search Icon using ancestor and descendant
		//WebElement element1 = driver.findElement(By.xpath("//input[@type='text']/ancestor::form/descendant::button"));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/../../../following-sibling::div/descendant::input")).click();
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/../../../ancestor::form/descendant::input")).click();
		
		
		
		//element1.click();
		
		//thread
		Thread.sleep(3000);
		
		//Close the browser
		//driver.close();
		


	}

}