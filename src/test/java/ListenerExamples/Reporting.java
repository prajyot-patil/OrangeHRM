package ListenerExamples;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Reporting extends TestListenerAdapter {
	
	public void onStart(ITestResult tr)
	{
		System.out.println("Test Started");
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test pass");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("test failure");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test Skipped");
	}

}
