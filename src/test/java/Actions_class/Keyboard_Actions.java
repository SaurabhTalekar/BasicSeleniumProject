package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTF =  driver.findElement(By.id("small-searchterms"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(searchTF).click().keyDown(Keys.SHIFT).sendKeys("mobiles").
		keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
//		driver.quit();
		
		
		
		
	}

}
