package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0023_By_xpath
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Automation/HTML/DemoA.html");
		driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Krishna");
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("Gehlot");
		driver.close();
	}
}
