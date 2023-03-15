package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Demo0048_A
{
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement lbtn;
	
	public Demo0048_A(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		lbtn=driver.findElement(By.id("loginButton"));
	}
	public void login(String un,String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		lbtn.click();
	}
}
public class Demo0048_B
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost");
		Demo0048_A a1=new Demo0048_A(driver);
		a1.login("admin", "manager");
		driver.close();
		
	}
}
