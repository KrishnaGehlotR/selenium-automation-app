package com.rnd.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Demo0050_A
{
	@CacheLookup
	@FindBy(id="username")
	private WebElement unTB;
	
	public void login(String un)
	{
		unTB.sendKeys(un);
	}
}
public class Demo0050_B
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost");
		Demo0050_A a1=new Demo0050_A();
		PageFactory.initElements(driver, a1);
		a1.login("abc");
		driver.close();
	}
}
