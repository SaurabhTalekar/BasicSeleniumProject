package WeDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageSetPosition {

	public static void main(String[] args) {
		
		//Set up the browser
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		
		//Launch the browser
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		//set the position of browser
		//Point point = new Point(100,100); 
		//driver.manage().window().setPosition(point);
		
		//Optimize- set the position
		driver.manage().window().setPosition(new Point(500, 500));
		
		//step2: navigate to url
		driver.get("https://www.instagram.com/");
		

	}

}
