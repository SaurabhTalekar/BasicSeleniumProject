package WeDriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
	
	public static void main(String[] ar) {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Step2:navigate to application via URL
		driver.get("https://www.jiomart.com/");
		driver.get("https://www.google.com/");
		driver.get("https://www.youtube.com/");
		driver.get("https://www.facebook.com/");
		
		//fetch the Title
		String title = driver.getTitle();
		String title1 = driver.getTitle();
		String title2 = driver.getTitle();
		
		//Print on console
		System.out.print(title);
		System.out.print(title1);
		System.out.print(title2);
	    
		
		
	}

}
