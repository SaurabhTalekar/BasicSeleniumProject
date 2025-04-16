 package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingFrames_snapdeal {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapdeal.com/");
		
		//mousehovering on signin
		
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
				
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
		Thread.sleep(1000);
		
		//click on login button
		
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		Thread.sleep(1000);
		
		//switching to frame
		WebElement loginTf = driver.findElement(By.id("loginIframe"));
		Thread.sleep(3000);
		
		driver.switchTo().frame(loginTf);
		Thread.sleep(3000);
		
		// pass the data to the username textfield
		
		driver.findElement(By.id("userName")).sendKeys("username");
		Thread.sleep(1000);
		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("shoes");
		
		driver.findElement(By.xpath("(//a[@class='subdiv unStructured searchKeyWord'])[2]")).click();
		WebElement text = driver.findElement(By.xpath("(//span[@class='nnn'])[1]"));
		if (text.isDisplayed()) {
			System.out.println("is displayed");
		} else {
			System.out.println("not displayed");
		}
		
		driver.quit();
	}

}
