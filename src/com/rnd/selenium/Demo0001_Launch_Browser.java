package com.rnd.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0001_Launch_Browser
{
	public static void main(String[] args)
	{
		FirefoxDriverManager.getInstance().setup();
		FirefoxDriver f=new FirefoxDriver();
		f.close();
	}
}
