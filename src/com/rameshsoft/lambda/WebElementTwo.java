package com.rameshsoft.lambda;

import org.openqa.selenium.WebElement;

@FunctionalInterface
public interface WebElementTwo 
{
  String getAttForElement(WebElement ele);
}
