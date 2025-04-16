package WeDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageSetSize {

	public static void main(String[] args) {
		
		//browser Setup
		WebDriverManager.chromedriver().setup();
		
	    //Step1: LAunch the browser
		WebDriver driver = new ChromeDriver();
		
		//Set the Size of browser
		
		//Dimension size = new Dimension(500,500);
		//driver.manage().window().setSize(size);
		 
		//optimize the code-set the size of browser
		driver.manage().window().setSize(new Dimension(500,500));
				
		//step2: navigate to url
		driver.get("https://www.instagram.com/");
				

	}

}
