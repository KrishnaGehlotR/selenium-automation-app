package com.rnd.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0021_Gmail_SendKeys
{
	public static void main(String[] args)
	{
		WebDriver driver=null;
		try
		{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gehlotrkrishna@gmail.com");
			driver.findElement(By.xpath("//input[@id='next']")).click();;
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("anitha2325gehlot");
			driver.findElement(By.xpath("//input[@value='Sign in']")).click();
			driver.findElement(By.xpath("//span[@class='gb_2a gbii']")).click();
			driver.findElement(By.id("gb_71")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			driver.close();
		}
	}
}