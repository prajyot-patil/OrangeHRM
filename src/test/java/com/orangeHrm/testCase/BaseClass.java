package com.orangeHrm.testCase;

import org.testng.annotations.BeforeClass;

import com.orangeHrm.utilities.ReadConfig;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class BaseClass {
  ReadConfig con = new ReadConfig();
  public String url = con.getApplicationUrl();
  public String username = con.getUsername();
  public String password = con.getPassword();
  public String pageTitle = con.getExpectedTitle();
  public static WebDriver driver;	 
  @BeforeClass
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver",con.getChromepath());
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void tearDown() 
  {
	  driver.quit();
  }
  
  public void captureScreen(String testname)throws Exception
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File target = new File(System.getProperty("user.dir")+"/Screenshot/"+testname+".png");
	  FileHandler.copy(src, target);
	  System.out.println("Screenshot taken");
  }

}
