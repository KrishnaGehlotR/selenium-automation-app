package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0025_Print_Value
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com");
		WebElement e=driver.findElement(By.id("username"));
		String v=e.getAttribute("value");
		System.out.println(v);
		driver.close();
	}
}
