package com.rameshsoft.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterTest2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		
		Stream<WebElement> stream = elements.stream();
		
		List<WebElement> elemns1 = stream.filter(ele -> ele.isDisplayed() && ele.isEnabled()).collect(Collectors.toList());
		elemns1.forEach(System.out::println);
		
		driver.quit();
	}

}
