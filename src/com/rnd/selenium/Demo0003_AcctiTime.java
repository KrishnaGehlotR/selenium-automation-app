package com.rnd.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0003_AcctiTime
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriverManager.getInstance().setup();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://localhost");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.close();
			
	}
}
