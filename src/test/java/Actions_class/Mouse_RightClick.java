package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// identify webelement

		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		// right click on web element
		Actions act = new Actions(driver);

		act.contextClick(rightclick).perform();

		Thread.sleep(3000);

		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		act.doubleClick(doubleClick).build().perform();
		Thread.sleep(3000);

//		driver.quit();

	}

}
