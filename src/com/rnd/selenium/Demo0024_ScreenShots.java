package com.rnd.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.apache.commons.io.FileUtils;

public class Demo0024_ScreenShots
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.irctc.co.in");
		driver.get("http://localhost");
		driver.manage().window().maximize();
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File srcFile = e.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:/Automation/ScreenShots/actiTime_maximize.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}
