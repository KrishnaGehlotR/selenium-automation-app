package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo0043_Scroll_SpecificElement
{
	public static void main(String[] args)
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in");
		RemoteWebDriver rwd=(RemoteWebDriver) driver;
		int y=driver.findElement(By.xpath("//span[@class='section-name']")).getLocation().getY();
		String code="window.scrollTo(0,"+y+")";
		rwd.executeScript(code);
		driver.close();
	}
}
