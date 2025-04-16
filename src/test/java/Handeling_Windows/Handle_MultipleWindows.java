package Handeling_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_MultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Set<String> wIds = driver.getWindowHandles();
		
		for (String id : wIds) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.contains("Forgotten")) {
				driver.findElement(By.id("identify_email")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(parent);	
		Thread.sleep(3000);
		driver.quit();
		
	}

}
