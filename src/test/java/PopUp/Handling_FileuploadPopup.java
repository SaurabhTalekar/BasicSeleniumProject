package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_FileuploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//URL--https://the-internet.herokuapp.com/upload
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		
		WebElement CFBtn = driver.findElement(By.id("file-upload"));
		
		CFBtn.sendKeys("E:\\QSpider");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-submit")).click();
		
		driver.quit();

	}

	
}
