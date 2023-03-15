package com.rnd.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Demo0007_Chrome_Browser
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriverManager.getInstance().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
