package Locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Xpath_AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		
	    //Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Step2: Navigate to the url
		driver.navigate().to("https://www.amazon.in/");
		
		//Step3: Identify the element
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("iphone 15");
		Thread.sleep(2000);

		//Step4: Identify the Svg element and perform action
		WebElement element1 = driver.findElement(By.xpath("//input[@type='submit']"));
		element1.click();
		Thread.sleep(2000);
		System.out.println("Step4");
		
		//Step5: Click on the searched Iphone 15
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]"));
		element2.click();
		Thread.sleep(3000);
		System.out.println("Step5");
		
		//driver.navigate().to("https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_1_sspa?crid=TA07G2QPGWTJ&dib=eyJ2IjoiMSJ9.4Amcm6ymShwYf2cUNy6g8844b_EZsvdJ4sstoUQpQMe4nrBHk0q7-6xivRGXMniw1WokuXVTy6CEak1Vh-Nyya_7rrYABt_OyG384eilaUWKiCqG01cMQUI_szrU8zVYhGoGL9cmMc9c6A7NINmMqWG0tyedf95zG6P-h4OPIsFNJkmPaW3ipvVSbZnJnlvbRild0wo0cQfxkyaNoodbethoSI1XAgv04Vslb0pLsIQ.VfEdIyWRLH-QDGSymTK3A7YGSCYKaKzd2soFTtZV1bo&dib_tag=se&keywords=iphone+15&qid=1728971973&sprefix=iphone+15%2Caps%2C1494&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		Set<String> result = driver.getWindowHandles();
		
		for(String id:result)
		{
			driver.switchTo().window(id);
			
		}
		
		
		//Click on add to cart button
		WebElement element3 = driver.findElement(By.xpath("//input[@id='add-to-cart-button'][1]"));
		element3.click();
		Thread.sleep(2000);
		System.out.println("Step6");
		
		
		//Thread
		Thread.sleep(3000);
	     
		//Step4: Close the browser
		driver.close();   
		
	}
}

////Get the price of the Product
//WebElement element4 = driver.findElement(By.xpath("//span[@class = 'LAlF6k re6bBo']"));
//element4.getText();
//System.out.println("Step7");
