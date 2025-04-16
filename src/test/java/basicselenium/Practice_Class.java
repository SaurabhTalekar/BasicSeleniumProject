package basicselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Class {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Saurabh/eclipse-workspace/learninSelenium/src/main/resources/WebPage/webpage.html");
		
		 WebElement ele = driver.findElement(By.xpath("//legend[text()='RegisterForm']"));
		 
		 
		
		 
		System.out.println(ele.getText());
		
		if(ele.getText().contains("RegisterForm")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			
		}
	}
}











//driver.get("https://www.flipkart.com/redmi-buds-5a-earbuds-anc-upto-30-hrs-battery-life-google-fast-pair-tws-bluetooth/p/itmd6685f8c1275e?pid=ACCH5VUZC4HSANSD&lid=LSTACCH5VUZC4HSANSDQ6DX1A&marketplace=FLIPKART&store=0pm%2Ffcn&srno=b_1_1&otracker=browse&fm=organic&iid=en_0YkbKMeDZL69OXd_mK6j0HpDNiyOB6dlCWXsPeYstHIjdgQYPVeJGV5APLTzu0Q9xeUJcfBhhKTEJTP1LhEs604IsYyWu-Pj9cxFjFAoaLk%3D&ppt=hp&ppn=homepage&ssid=hhy5ap9exs0000001736414251047");
//
//String s = driver.findElement(By.xpath("//span[text()='Special price']/../../../div/div/div/div/div[1]")).getText();
//System.out.println(s);
//
//String[] s1 = s.split(s);
//System.out.println(s1);
