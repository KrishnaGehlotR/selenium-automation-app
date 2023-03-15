package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo0028_Backspace
{
	public static void main(String[] args) throws InterruptedException
	{
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http:demo.vtiger.com");//works only if Internet connection is available
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Automation\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("username"));
		String s="User";
    	e.sendKeys(s);
    	for(int i=0;i<s.length();i++)
    	{
		e.sendKeys(Keys.BACK_SPACE);
    	}
		e.sendKeys("UserA");
		Thread.sleep(3000);
		String v = e.getAttribute("value");
		System.out.println(v);
		driver.close();
	}
}
