package com.testng;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClass0001
{
	@Test
	public void testA()
	{
		try {
			int i = 1/0;
		} catch (Exception e) {
			Assert.fail("Failed intentionally\n"+e.getLocalizedMessage());
		}
	}
	
	@AfterMethod
	public void afterMethod(ITestResult iTestResult) {
		if(iTestResult.getStatus()== ITestResult.FAILURE) {
			System.out.println(iTestResult.getThrowable());
		}
	}
}