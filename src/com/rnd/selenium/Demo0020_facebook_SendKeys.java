package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0020_facebook_SendKeys
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("gehlotrkrishna@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("anitha2325gehlot");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.tagName("span")).click();
		driver.close();
		System.out.println("Connection Successfull");
	}
}
