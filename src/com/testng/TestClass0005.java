package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class TestClass0005
{
	@BeforeMethod
	public void preCondition()
	{
		Reporter.log("Precondition",true);
	}
	@AfterMethod
	public void postCondition()
	{
		Reporter.log("Postconditon",true);
	}
	@Test
	public void verifyTitle()
	{
		SoftAssert s=new SoftAssert();
		FirefoxDriverManager.getInstance().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String aTitle=driver.getTitle();
		String eTitle = "Google";
		s.assertEquals(aTitle,eTitle);
		driver.close();
		s.assertAll();
	}
}
