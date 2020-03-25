package com.orangeHrm.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.orangeHrm.testCase.BaseClass;

public class Reporting1 extends BaseClass implements ITestListener{
	
   public void onTestStart(ITestResult tr)
   {
	   System.out.println("Test Started");
   }
   
   public void onTestSuccess(ITestResult tr)
   {
	   System.out.println("Test Passed");
   }
   public void onTestFailure(ITestResult tr)
   {
	   System.out.println("Test Failed");
	   try {
		captureScreen(tr.getMethod().getMethodName());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   public  void onTestSkipped(ITestResult tr)
   {
	   System.out.println("Test Skipped");
   }
}
