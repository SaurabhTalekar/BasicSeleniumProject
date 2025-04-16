package Screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_of_WebElement {

	public static void main(String[] args) throws Exception {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Mazimize the browser
		driver.manage().window().maximize();

		// Wait statement
//		driver.manage().timeOuts.impicitlyWait(Duration.ofSeconds(10));

		// Open the application
		driver.get("https://www.swiggy.com/");

		// Locate an webElement
		WebElement ele = driver.findElement(By.id(""));

		// Call the method
		File src = ele.getScreenshotAs(OutputType.FILE);

		// Create a new file to store the ss
		File test = new File("./Screens/Hss.png");

		// save the file
		FileUtils.copyFile(src, test);
	}

}
