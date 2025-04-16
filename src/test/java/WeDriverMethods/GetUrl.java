package WeDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrl {

	public static void main(String[] args) {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: launch the browser
		WebDriver driver = new ChromeDriver();
		 
		//Step2: Navigate to URL
		driver.get("https://pistahouse.in/");
		
		//fetch the Title
		String url = driver.getCurrentUrl();
				
		//Print on console
		System.out.print("The Title is: "+url);
		
		
	

	}

}
