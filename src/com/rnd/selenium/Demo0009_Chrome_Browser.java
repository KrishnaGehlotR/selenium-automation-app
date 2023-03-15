package com.rnd.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo0009_Chrome_Browser
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Automation\\exefiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost");
		Thread.sleep(3000);
		driver.close();
	}
}
