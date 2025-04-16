package WeDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get {
	
	public static void main(String[] args) {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: launch the browser chrome
		WebDriver driver = new ChromeDriver();	

		
		//step2: navigate to application via URL
		driver.get("https://www.jiomart.com/");
		
		//step3: close the browser
		driver.quit();
		
		//Execution completed
		System.out.println("Execution completed...");
		
		
	}

}
