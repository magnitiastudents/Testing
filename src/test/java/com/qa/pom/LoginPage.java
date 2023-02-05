package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static RemoteWebDriver driver ;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement emailaddress;
	
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextbutton;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement loginbutton;
	
	
	public LoginPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void enterEmailAddress(String email) throws Exception
	{
		emailaddress.sendKeys(email);
		Thread.sleep(2000);
	}
	
	public void clickOnNext() throws Exception
	{
		nextbutton.click();
		Thread.sleep(5000);
	}
	
	public void enterPassword(String pwd) throws Exception
	{
		password.sendKeys(pwd);
		Thread.sleep(2000);
	}
	
	public void clickOnLogin() throws Exception
	{
		loginbutton.click();
		Thread.sleep(5000);
	}
	
	
}
