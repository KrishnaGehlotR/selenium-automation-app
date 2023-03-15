package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass0003
{
	@Test
	public void registerUser()
	{
		Reporter.log("RegisterUser",true);
//		Assert.fail();
	}
	@Test(dependsOnMethods="registerUser")
	public void deleteUser()
	{
		Reporter.log("DeleteUser",true);
	}
	
}
