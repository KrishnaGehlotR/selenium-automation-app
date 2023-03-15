package com.rnd.selenium;

import java.util.Scanner;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Demo0004_Google_Equals
{
	public static void main(String[] args)
	{
		System.out.println("URL?");
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		System.out.println(url);
		System.out.println("Expected Title: ");
		String eTitle=sc.nextLine();
		System.out.println("eTitle "+eTitle);
		sc.close();
		FirefoxDriverManager.getInstance().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(url);
		String aTitle = driver.getTitle();
		System.out.println("aTitle "+aTitle);
		if(aTitle.equals(eTitle))
		{
			System.out.println("Pass: Title is the same");
		}
		else
		{
			System.out.println("Fail: Title is not same");
		}
		driver.close();
	}
}
