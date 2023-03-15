package com.rnd.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0006_PageSource
{
	public static void main(String[] args)
	{
		FirefoxDriverManager.getInstance().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String src = driver.getPageSource();
		System.out.println(src);
		driver.close();
	}
}
