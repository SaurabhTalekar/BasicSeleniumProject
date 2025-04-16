package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		
		//SetUp the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.amazon.in/");
		
		//Find the WeElement
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		

		
		//SendKey
		searchfield.sendKeys("Tv");
		
		
		
		
		
		

	}

}
