package com.rameshsoft.functionInterface;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuncInterfaceWithSel 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.name("email"));
		
		
		Function<WebElement, Boolean> function = (ele) -> {
			boolean status = ele.isDisplayed() && ele.isEnabled();
			return status;
		};
		
		boolean stat = function.apply(element);
		System.out.println(stat);
		
		driver.quit();
	}

}
