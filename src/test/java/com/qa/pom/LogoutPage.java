package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public RemoteWebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[contains(@aria-label,'Google Account:')]/img")
	public WebElement profilepic;

	@FindBy(how=How.XPATH, using="//div[text()='Sign out']")
	public WebElement signout;
	
	public LogoutPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickonprofilepic() throws Exception
	{
		profilepic.click();
		Thread.sleep(2000);
	}
	
	public void clickonsignout() throws Exception
	{
		driver.switchTo().frame("account");
		signout.click();
		Thread.sleep(5000);
		
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	
}
