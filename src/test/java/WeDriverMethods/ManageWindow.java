package WeDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageWindow {

	public static void main(String[] args) {
		
		// Browser Setup
		WebDriverManager.chromedriver().setup();
		
		//Step1: launch browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		
		//Options optionobj = driver.manage();
		//Window windowobj = optionobj.window();
		//windowobj.maximize();
		
		//optimize the code-Maximize the browser
		driver.manage().window().maximize();
		
		//optimize the code-Manimize the browser
		//driver.manage().window().minimize();
		
		//step2: navigate to url
		driver.get("https://www.instagram.com/");
		driver.get("https://www.google.com/");
		

	}

}
