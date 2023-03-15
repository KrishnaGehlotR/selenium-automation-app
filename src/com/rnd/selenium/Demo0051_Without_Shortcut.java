package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo0051_Without_Shortcut
{
	public static void main(String[] args) throws InterruptedException
	{
//		WebDriver driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Automation\\exefiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/Workspace/HTML/DemoC.html");
		
		WebElement t1 = driver.findElement(By.id("t1"));
		String value = t1.getAttribute("value");
//		t1.sendKeys(Keys.CONTROL+"ac");
		t1.clear();
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.sendKeys(value);
		Thread.sleep(2000);
		driver.close();
	}
}
