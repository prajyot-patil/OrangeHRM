package com.orangeHrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		try
		{
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getApplicationUrl()
	{
		String Url = pro.getProperty("baseURL");
		return Url;
	}
	
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromepath()
	{
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}
	
	public String getFirefoxpath()
	{
		String firefoxPath = pro.getProperty("firefoxPath");
		return firefoxPath;
	}
	
	public String getExpectedTitle()
	{
		String expTitle = pro.getProperty("pageTitle");
		return expTitle;
	}
}
