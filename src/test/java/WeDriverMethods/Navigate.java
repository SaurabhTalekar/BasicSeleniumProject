package WeDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		// setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the webPage
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://pistahouse.in/");
		
		driver.navigate().to("https://pistahouse.in/");
		
		driver.navigate().to(new URL("https://pistahouse.in/"));
		
		//backward navigation
		driver.navigate().back();
		
		//backward navigation
		driver.navigate().back();
		
		//forward navigation
		driver.navigate().forward();
		
		//forward navigation
		driver.navigate().forward();
		
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		//back
		driver.navigate().back();
			

	}

}
