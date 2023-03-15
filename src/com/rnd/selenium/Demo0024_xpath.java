package com.rnd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0024_xpath
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/KRISHNA%20GEHLOT%20R/Documents/DemoB.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("A");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("B");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("C");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("D");
		driver.close();
	}
}
