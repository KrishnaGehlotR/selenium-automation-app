package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0035_Fb_RadioButton
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement radiobtn = driver.findElement(By.id("u_0_f"));
		radiobtn.click();
		if(radiobtn.isSelected())
		{
			System.out.println("Male");
		}
		else
		{
			System.out.println("Female");
		}
		driver.close();
		
		
		
	}
}
