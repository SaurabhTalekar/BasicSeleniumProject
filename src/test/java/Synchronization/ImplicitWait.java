package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		//Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the website
		driver.get("https://www.swiggy.com/");
		
		//ImpicitWait statement ***3.141.59***
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//Identify the search Webelement
		WebElement search = driver.findElement(By.xpath("//a[@href='/search']"));
		search.click();
		
		//Enter the food name
		WebElement element = driver.findElement(By.xpath("//input[@type='text']")); 
		//element.sendKeys("Biryani");
		
		//Another way of click Enter button using virtual key
		element.sendKeys("Biryani"+Keys.ENTER);
		
		
		//Click on the search food items
//		WebElement biryani = driver.findElement(By.xpath("//b[text()='Biryani']"));
//		biryani.click();
		
		//Get the text
		//String text = driver.findElement(By.xpath("//div[text()='Veg Biryani']")).getText();
		String text = driver.findElement(By.xpath("//div[text()='Mini Chicken Biryani']")).getText();
		System.out.println(text);
	}

}
