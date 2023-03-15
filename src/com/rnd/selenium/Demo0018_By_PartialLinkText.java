package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0018_By_PartialLinkText
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/KRISHNA%20GEHLOT%20R/Documents/DemoA.html");
		driver.findElement(By.partialLinkText("tiTi")).click();
		driver.close();
	}
}
