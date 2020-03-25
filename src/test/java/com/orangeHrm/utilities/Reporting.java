package com.orangeHrm.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.orangeHrm.testCase.BaseClass;

public class Reporting extends TestListenerAdapter 
{

	public void onStart(ITestResult tr)
	{ 
		System.out.println("Test Started");
	}
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test Passed");
	}
	public void onTestFailure(ITestResult tr, WebDriver wd)
	{
	    System.out.println("Test Failed");
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test Skipped");
	}
}
