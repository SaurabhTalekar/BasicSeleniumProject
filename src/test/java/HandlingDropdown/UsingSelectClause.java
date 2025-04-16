package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSelectClause {

	public static void main(String[] args) throws InterruptedException  {
	
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to the URL
		driver.get("https://www.amazon.in/");
		
		//Find the DropDown WebElement
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		//To handle the DropDown by using the select class we have to create the class for the select
		Select sel = new Select(dropdown);
		
		//select the DropDown element by reference variable************
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Apps & Games");
		Thread.sleep(3000);
		
		sel.selectByValue("search-alias=appliances");
		Thread.sleep(3000);
		
		driver.close();

	}

}
