package com.rameshsoft.functionInterface;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuncInterfaceWithSelenium 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.name("email"));
		
		Function<WebElement, String> function = (WebElement ele) -> {
			String idVal = ele.getAttribute("class");
			return idVal;
		} ;
		
		String idVal = function.apply(element);
		System.out.println("class value is: "+idVal);
		
		driver.quit();
	}

}
