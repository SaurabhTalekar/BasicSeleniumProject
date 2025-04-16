package WeDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiplesWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Sep2:Navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step3:Find the webElement
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		//Step4: Fetching the Text form each WebElement---Iterating using For Loop
//		for(int i=0; i<=links.size()-1;i++) {
//			String linktext = links.get(i).getText();
//			System.out.println(linktext);
//		}
		
		//Clicking on all the links
		for(int i=1; i<=links.size()-1;i++) {
			links.get(i).click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
	
		//System.out.println(links);
		
		//Step5: Close the browser
         driver.quit();
	}

}
