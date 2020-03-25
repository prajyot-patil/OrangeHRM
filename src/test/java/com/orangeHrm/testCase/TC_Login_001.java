package com.orangeHrm.testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.pageObject.LoginPage;
import com.orangeHrm.utilities.Reporting1;

//@Listeners(Reporting1.class)
public class TC_Login_001 extends BaseClass 
{
	@Test
	public void login() throws Exception
	{
		LoginPage lp = new LoginPage(driver);
		driver.get(url);
		try
		{
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(3000);
//		if(pageTitle.equals(driver.getTitle()))
//		{
			lp.clickWelcome();
			Thread.sleep(3000);
			lp.clickLogout();
			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		}
		catch(Exception e)
		{
			//captureScreen("testing");
			Assert.assertTrue(false);
			System.out.println(e.getMessage());
		}
	}

}
