package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0031_WithoutClick
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com");
		String xp = "//button[text()='SignIn']";
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		driver.close();
	}
}
