package com.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass0004
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] d=new Object[2][2];
		d[0][0]="admin";
		d[0][1]=123;
		d[1][0]="UserA";
		d[1][1]=456;
		return d;
	}
	@Test(dataProvider="getData")
	public void registerUser(String un,int pw)
	{
		Reporter.log("un: "+un,true);
		Reporter.log("pw: "+pw,true);
	}
}
