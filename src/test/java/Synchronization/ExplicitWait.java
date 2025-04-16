package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Explicit Wait
		
		//******Version--4
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//******Version--3
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Navigate to the url
		driver.get("https://www.swiggy.com/");		
		
		//Offer web element
		WebElement offer = driver.findElement(By.xpath("//a[@href='/offers-near-me']"));
		
		wait.until(ExpectedConditions.visibilityOf(offer));
		
		offer.click();
		
		//driver.close();		

	}

}
