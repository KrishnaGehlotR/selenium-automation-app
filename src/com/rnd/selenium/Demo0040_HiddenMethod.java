package com.rnd.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo0040_HiddenMethod
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Workspace/HTML/DemoD.html");
		RemoteWebDriver rwd=(RemoteWebDriver) driver;
		String code="document.getElementById('t1').value='Hi'";
		rwd.executeScript(code);
	}
}
