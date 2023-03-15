package com.rnd.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0030_NavigateMethod
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
