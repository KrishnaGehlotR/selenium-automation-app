package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0013_By_TagName
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/KRISHNA%20GEHLOT%20R/Documents/DemoA.html");
		By b=By.tagName("a");
		WebElement e=driver.findElement(b);
		e.click();
		driver.close();
		
	}
}
