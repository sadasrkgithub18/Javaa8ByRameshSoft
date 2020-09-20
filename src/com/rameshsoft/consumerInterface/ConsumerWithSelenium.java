package com.rameshsoft.consumerInterface;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsumerWithSelenium 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.name("email"));
		
		
		Consumer<WebElement> consumer  = (ele) -> {
			if(ele.isDisplayed() && ele.isEnabled())
			{
				ele.clear();
				ele.sendKeys("Welcome");
			}
		};
		
		consumer.accept(element);
		
		
		driver.quit();
	}

}
