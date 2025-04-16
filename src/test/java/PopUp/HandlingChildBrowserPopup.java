package PopUp;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) throws IOException {
		
		//Confiure the owser
		WebDriverManager.chromedriver().setup();
		
		//Setup the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://www.flipkart.com/");
		String id = driver.getWindowHandle();
		
		//Find the we element
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		
		//Enter the text or pass the text to the identified TextField
		search.sendKeys("Mobiles"+Keys.ENTER);
		
		//Fetching another element on another page
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).click();
		
		//Get the Id of the windows
		  Set<String> id1 = driver.getWindowHandles();
		
		for (String s : id1) {
			
			driver.switchTo().window(s);
			
			if (driver.getTitle().contains("Apple iPhone 15 (Pink, 128 GB)")) {
				System.out.println("done");
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshot/ss.png");
				FileUtils.copyFile(src, dest);
			}
		}
		
		driver.switchTo().window(id);
		
	}

}
