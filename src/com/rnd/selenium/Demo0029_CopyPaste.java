package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0029_CopyPaste
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Workspace/HTML/DemoC.html");
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.sendKeys(Keys.CONTROL+"ac");
		t1.clear();
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.sendKeys(Keys.CONTROL+"v");
		driver.close();
	}
}
