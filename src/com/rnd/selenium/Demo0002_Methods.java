package com.rnd.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0002_Methods 
{
	public static void main(String[] args) throws InterruptedException
	{
//		Set driver file through git
		FirefoxDriverManager.getInstance().setup();
//		open the browser
		FirefoxDriver driver=new FirefoxDriver();
//		resize the browser
		Dimension d=new Dimension(320, 420);
		driver.manage().window().setSize(d);
//		wait for 2sec
		Thread.sleep(2000);
//		move the browser
		Point p=new Point(350,50);
		driver.manage().window().setPosition(p);
//		maximize the browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		close the browser
		driver.close();
	}
}
