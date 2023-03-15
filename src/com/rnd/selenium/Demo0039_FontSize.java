package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0039_FontSize
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost");
		WebElement un = driver.findElement(By.id("username"));
		String f=un.getCssValue("font-Size");
		System.out.println(f);
		driver.close();
	}
}
