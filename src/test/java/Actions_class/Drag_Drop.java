package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).perform();
		
		Thread.sleep(1000);
		
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain = driver.findElement(By.id("box107"));
		
		act.dragAndDrop(madrid, spain).perform();
		Thread.sleep(1000);
		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement southKorea = driver.findElement(By.id("box105"));
		act.dragAndDrop(Seoul, southKorea).perform();
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
