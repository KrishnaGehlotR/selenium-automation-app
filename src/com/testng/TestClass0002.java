package com.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass0002
{
	@BeforeClass
	public void openApp()
	{
		Reporter.log("OpenApp",true);
	}
	@AfterClass
	public void classApp()
	{
		Reporter.log("CloseApp",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	@Test(priority=-1,invocationCount=2)
	public void registerUser()
	{
		Reporter.log("RegisterUser",true);
	}
	@Test
	public void editUser()
	{
		Reporter.log("EditUser",true);
	}
	@Test(priority=1)
	public void deleteUser()
	{
		Reporter.log("DeleteUser",true);
	}
}
