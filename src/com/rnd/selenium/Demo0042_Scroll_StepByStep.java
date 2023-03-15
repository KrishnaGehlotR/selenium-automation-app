package com.rnd.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo0042_Scroll_StepByStep
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in");
		driver.manage().window().maximize();
		RemoteWebDriver rwd=(RemoteWebDriver) driver;
		for(int i=1;i<=50;i++)
		{
		String code="window.scrollBy(0,100)";
		rwd.executeScript(code);
		}
		driver.close();
	}
}
