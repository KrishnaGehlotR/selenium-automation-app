package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0032_Submit
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com");
		String xp = "//button[text()='SignIn']";
		driver.findElement(By.xpath(xp)).submit();
		driver.close();
	}
}
