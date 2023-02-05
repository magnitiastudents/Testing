package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static RemoteWebDriver driver; 
	
	@FindBy(xpath="//div[text()='Compose']")
	public WebElement compose;
	
	
	public HomePage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	public void composeButtonIsDispalyed()
	{
		if(compose.isDisplayed())
		{
			System.out.println("Compose button is displayed");
		}
		else
		{
			System.out.println("Compose button is not displayed");
		}
	}
	
	
	public void clickOnCompose() throws Exception
	{
		compose.click();
		Thread.sleep(2000);
	}
	
	
}
