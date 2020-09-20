package com.rameshsoft.supplierInterface;

import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpplierWithSelenium 
{
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Supplier<String> supplier = () -> {
			String title = driver.getTitle();
			return title;
		};
		
		String aTitle = supplier.get();
		System.out.println(aTitle);
		
		
		driver.quit();
	}

}
