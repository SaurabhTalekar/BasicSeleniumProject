package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/");

		WebElement drp = driver.findElement(By.id("cars"));

		Select s = new Select(drp);
		s.selectByIndex(2);
		s.selectByValue("500");
		s.selectByVisibleText("INR 300 - INR 399 ( 1 )");

		Thread.sleep(3000);

		// GetFirstSelectedOption
		String firstSel = s.getFirstSelectedOption().getText();
		System.out.println(firstSel);

		s.deselectByValue("500");

		// getOptios
		List<WebElement> list = s.getOptions();

		for (WebElement ele : list) {
			System.out.println("the first selected element is " + ele.getText());
		}
		
		//GetAllSelectedOptios
		List<WebElement> selectedlist = s.getAllSelectedOptions();
		
		for (WebElement ssele : selectedlist) {
			System.out.println("Selected elemment : " + ssele.getText());
		}
		driver.quit();

	}

}
