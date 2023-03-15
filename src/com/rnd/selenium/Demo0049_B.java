package com.rnd.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Demo0049_A
{
	@FindBy(id="username")
	private WebElement unTB;
	
	public Demo0049_A(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un)
	{
		unTB.sendKeys(un);
	}
}
public class Demo0049_B
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost");
		Demo0049_A a1=new Demo0049_A(driver);
		a1.login("abc");
		driver.navigate().refresh();
		Thread.sleep(3000);
		a1.login("admin");
		driver.close();
	}
}
