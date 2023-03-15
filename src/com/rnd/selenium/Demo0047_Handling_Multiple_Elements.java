package com.rnd.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0047_Handling_Multiple_Elements
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Workspace/HTML/DemoE.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		WebElement link = allLinks.get(0);
		String text = link.getText();
		System.out.println(text);
		driver.close();
	}
}
