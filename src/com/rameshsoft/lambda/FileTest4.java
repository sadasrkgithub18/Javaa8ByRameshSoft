package com.rameshsoft.lambda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileTest4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.name("email"));
	
		
		WebElementTwo webElementTwo = (ele) -> {
			String att = ele.getAttribute("id");
			return att;
		};
		
		// 1. Way
		String attt = webElementTwo.getAttForElement(element);
		System.out.println("Attribute value is: "+attt);
		
		
		//2. Way
		System.out.println(webElementTwo.getAttForElement(element));
		
		driver.quit();
	}

}
