package com.rnd.selenium;

import java.util.Scanner;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0005_Google_Contains
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("URL to enter in the addressbar? ");
		String url=sc.nextLine();
		System.out.println("Expected word in URL?");
		String eURL=sc.nextLine();
		sc.close();
		FirefoxDriverManager.getInstance().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(url);
		String aURL=driver.getCurrentUrl();
		System.out.println("Actual URL: "+aURL);
		if(aURL.contains(eURL))
		{
			System.out.println("Pass: URL has word: "+eURL);
		}
		else
		{
			System.out.println("Fail: URL does not has word: "+eURL);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
