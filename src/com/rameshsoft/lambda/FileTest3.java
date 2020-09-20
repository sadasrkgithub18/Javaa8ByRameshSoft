package com.rameshsoft.lambda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileTest3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.id("email"));
		
		WebElementOne eleone = (ele) -> {
			boolean status = ele.isDisplayed() && ele.isEnabled();
			return status;
		};
		
		// 1 Way
		boolean vis = eleone.isVisible(element);
		System.out.println(vis);
		
		// 2 Way
		System.out.println(eleone.isVisible(element));
		
		driver.quit();
	}

}
