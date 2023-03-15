package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0038_Horizontal_Distance
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		int x1 = driver.findElement(By.id("Email")).getLocation().getX();
		int x2 = driver.findElement(By.id("Email")).getLocation().getX();
		System.out.println(x1);
		System.out.println(x2);
		driver.close();
	}
}
