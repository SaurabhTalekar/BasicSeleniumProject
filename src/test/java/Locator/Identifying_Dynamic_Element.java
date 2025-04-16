package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Identifying_Dynamic_Element {

	public static void main(String[] args) {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.selenium.dev/");
		
		//Identify the webelement
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		//Identify the Text Java and then transverse to the downlode link
		
		WebElement element = driver.findElement(By.xpath("//p[text()='Java']/../descendant::a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.25.0/selenium-java-4.25.0.zip']"));
		System.out.println(element.getText());  
		
		

	}

}
