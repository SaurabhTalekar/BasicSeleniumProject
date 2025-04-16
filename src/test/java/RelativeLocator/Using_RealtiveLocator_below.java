package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_RealtiveLocator_below {

	public static void main(String[] args) {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.facebook.com/login/");
		
		
		//************Using the below()*************
		//Identifying the Username field
		WebElement username = driver.findElement(By.id("email"));
		
		//Identify the WebURL using the relative locator----below
		WebElement pass =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
		
		
		
		//****************************Using the toRightOf()**********
		//Identify the ForgotPassword link
		WebElement forgetpasslink = driver.findElement(By.xpath("//a[@class='_97w4']"));
		
		//Identify the WebURL using the relative locator----toRightOf()
		WebElement  signup = driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(forgetpasslink));
		signup.click();
		
		//****************************Using the toRightOf()**********
		//Identify the SignUPLink
		WebElement signuplink = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		
		//Identify the WebURL using the relative locator----toLeftOf()
		WebElement forgetpass = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(signuplink));
		forgetpass.click();

	}

}
