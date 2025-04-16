package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup the browse
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the application via URL
		driver.navigate().to("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/register.html");
		
		//Step3: Identify the WeElement using Name Locator
		WebElement element = driver.findElement(By.name("phone-text"));
		WebElement element1 = driver.findElement(By.name("emailtext"));
		WebElement element2 = driver.findElement(By.name("password-text"));
		
		//Step4: Validate the element
		boolean result = element.isDisplayed();
		if (result==true) {
			System.out.println("Phone text field is Presrent ");
		}else {
			System.out.println("Phone text field is not present");
		}
		
		boolean result1 = element1.isDisplayed();
		if(result1) {
			System.out.println("Email text field is Presrent ");
		}else {
			System.out.println("Email text field is not present");
		}
		
		boolean result2 = element2.isDisplayed();
		if(result2) {
			System.out.println("Password text field is Presrent ");
		}else {
			System.out.println("Password text field is not present");
		}
		
		//Enter the data
		element.sendKeys("8669023680");
		element1.sendKeys("Saurabh@gmail.com");
		element2.sendKeys("Saurabh123");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
