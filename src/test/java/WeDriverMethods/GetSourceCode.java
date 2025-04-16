package WeDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSourceCode {

	public static void main(String[] args) {
		
		//Browser setup
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//Step2: navigate to URL
		driver.get("https://pistahouse.in/");
		
		//Fetch the source code
		String pagesource = driver.getPageSource();
		
		//print on console
		System.out.println(pagesource);
		
		//close the browser
		driver.quit();

	}

}
