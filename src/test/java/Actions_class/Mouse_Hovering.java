package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men' and @class ]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(men).build().perform();
		Thread.sleep(3000);
		
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids' and @class ]"));
		Actions kidsact = new Actions(driver);
		kidsact.moveToElement(kids).build().perform();
	
		
		Thread.sleep(3000);
		WebElement kidsTshirts = driver.findElement(By.xpath("//a[text()='T-Shirts' and @data-reactid='345']"));
		kidsTshirts.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
