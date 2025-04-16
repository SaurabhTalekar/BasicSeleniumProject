package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Doubleclick {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//identify webelement
		WebElement ele = driver.findElement(By.xpath("//button[contains (text(),'Double-Click Me')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		
	driver.quit();
	}
	

}
