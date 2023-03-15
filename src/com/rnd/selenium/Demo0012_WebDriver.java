package com.rnd.selenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo0012_WebDriver
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter the Browser FF/GC/IE: ");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		if(browser.equals("FF"))
		{
			FirefoxDriver driver1=new FirefoxDriver();
			testA(driver1);
		}
		else if(browser.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation\\Selenium_driver\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver2=new ChromeDriver();
			testA(driver2);
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Automation\\Automation\\Selenium_driver\\IEDriverServer_x64_2.52.2\\IEDriverServer.exe");
			InternetExplorerDriver driver3=new InternetExplorerDriver();
			testA(driver3);
		}
		else
		{
			System.out.println("Browser driver is not available");
		}
		sc.close();
	}
	public static void testA(WebDriver driver) throws InterruptedException
	{
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pSource = driver.getPageSource();
		System.out.println(pSource);
		Thread.sleep(3000);
		driver.close();
	}
}
