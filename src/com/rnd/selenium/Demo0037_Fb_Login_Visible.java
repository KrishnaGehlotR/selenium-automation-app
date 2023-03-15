package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0037_Fb_Login_Visible
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement loginbtn = driver.findElement(By.id("u_0_w"));
		System.out.println(loginbtn.isDisplayed());
		System.out.println(loginbtn.isEnabled());
		driver.close();
	}
}
