package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingGetMethods {

	public static void main(String[] args) {
		
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
        WebDriver driver = new ChromeDriver();
        
        //Maximize the browser
        driver.manage().window().maximize();
        
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        //Navigate to the URL
        driver.get("https://www.amazon.in/");
        
        //Identify the DropDown WebElement
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        
        //Create the object for the select class
        Select sel = new Select(dropdown);
        
       
        
        List<WebElement> list = sel.getOptions();
        System.out.println(list);
        
        for (WebElement ele : list) {
        	System.out.println(ele.getText());
        }
        
        System.out.println(sel.getFirstSelectedOption());
        System.out.println(sel.isMultiple());
	}

}
