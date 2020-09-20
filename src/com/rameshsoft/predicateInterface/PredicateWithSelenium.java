package com.rameshsoft.predicateInterface;

import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredicateWithSelenium 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.name("email"));
		
		Predicate<WebElement> element1 = (ele) -> {
			boolean status = false;
			if(ele.isDisplayed() && ele.isEnabled())
			{
				System.out.println("Element is displayed and Enabled");
				status = true;
			}
			else
			{
				System.out.println("Element is not displayed");
			}
			return status;
		};
		
		//element1.test(element);
		System.out.println(element1.test(element));
		
		driver.quit();
}

}
