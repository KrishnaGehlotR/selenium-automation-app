package com.rnd.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class Demo0011_FFGCIE {

	public static void main(String[] args) {
		System.out.println("Enter the FF/GC/IE ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();
		if (browser.equals("FF")) {
			FirefoxDriverManager.getInstance().setup();
			FirefoxDriver driver1 = new FirefoxDriver();
			testA(driver1);
		} else if (browser.equals("GC")) {
			ChromeDriverManager.getInstance().setup();
			ChromeDriver driver2 = new ChromeDriver();
			testA(driver2);
		} else if (browser.equals("IE")) {
			InternetExplorerDriverManager.getInstance().setup();
			InternetExplorerDriver driver3 = new InternetExplorerDriver();
			testA(driver3);
		} else {
			System.out.println("Browser Driver is not available");
		}
	}

	public static void testA(FirefoxDriver driver1) {
		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
	}

	public static void testA(ChromeDriver driver2) {
		driver2.get("http://www.google.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
	}

	public static void testA(InternetExplorerDriver driver3) {
		driver3.get("http://www.google.com");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.close();
	}
}
