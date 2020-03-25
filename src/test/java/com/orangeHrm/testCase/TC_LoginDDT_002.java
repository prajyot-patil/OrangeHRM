package com.orangeHrm.testCase;

import org.testng.annotations.Test;

import com.orangeHrm.pageObject.LoginPage;
import com.orangeHrm.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
  
  @Test
  public void loginDDT() throws Exception 
  {
	  driver.get(url);
	  String path = System.getProperty("user.dir")+"/TestData/orangeHrmDataDriven1.xlsx";
	  int rownum = XLUtils.getRowCount(path, "Sheet1");
	  
	  
	  for(int i=1; i<=rownum; i++)
	  {
		 String username = XLUtils.getCellData(path, "Sheet1" , i, 0).toString();
		 String password = XLUtils.getCellData(path, "Sheet1", i, 1).toString();
		 System.out.println(username+ " "+ password);
		 LoginPage lp = new LoginPage(driver);
		 try
		 {
		 lp.setUsername(username);
		 lp.setPassword(password);
		 lp.clickLogin();
		 Thread.sleep(3000);
		 lp.clickWelcome();
		 Thread.sleep(3000);
		 lp.clickLogout();
		 XLUtils.setCellData(path, "Sheet1", i, 2, "Pass");
		 System.out.println("Passed");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Failed");
			 XLUtils.setCellData(path, "Sheet1", i, 2, "Fail");
		 }
	  }
  }
}
