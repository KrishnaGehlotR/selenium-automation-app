package com.rnd.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo0041_Scroll_Bottom
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in");
		RemoteWebDriver rwd=(RemoteWebDriver) driver;
		String code="window.scrollTo(0,document.body.scrollHeight)";
		rwd.executeScript(code);
		driver.close();
	}
}
