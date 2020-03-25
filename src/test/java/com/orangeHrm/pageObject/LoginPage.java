package com.orangeHrm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
	    ldriver=rdriver;
	    PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement txtusername;
	
	@FindBy(id="txtPassword")
	WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;
	
	@FindBy(linkText="Welcome Admin")
	WebElement lnkwelcome;
	
    @FindBy(linkText="Logout")
    WebElement lnklogout;
    
    public void setUsername(String username)
    {
    	txtusername.sendKeys(username);
    }
    
    public void setPassword(String password)
    {
    	txtpassword.sendKeys(password);
    }
    
    public void clickLogin()
    {
    	btnlogin.click();
    }
    
    public void clickWelcome()
    {
    	lnkwelcome.click();
    }
    
    public void clickLogout()
    {
    	lnklogout.click();
    }

}
