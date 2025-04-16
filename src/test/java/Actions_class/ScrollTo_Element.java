package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTo_Element {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		
		WebElement ele = driver.findElement(By.xpath("//span[@class=\"navFooterBackToTopText\"]"));
		
		Actions act = new Actions(driver);	
		

		act.scrollToElement(ele).perform();
	}

}
