package com.rnd.selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo0008_Internet_Explorer
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","D:\\Automation\\Automation\\Selenium_driver\\IEDriverServer_x64_2.52.2\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
