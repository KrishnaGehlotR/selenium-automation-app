package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0027_Control_SelectAll_Delete
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:demo.vtiger.com");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("username"));
		e.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		e.sendKeys("UserA");
		driver.close();
	}
}
