package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0033_irctc
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.irctc.com/displayServlet");
		String xp = "//label[text()='Mumbai']/../label[2]";
		String ph = driver.findElement(By.xpath(xp)).getText();
		System.out.println(ph);
		driver.close();
	}
}
