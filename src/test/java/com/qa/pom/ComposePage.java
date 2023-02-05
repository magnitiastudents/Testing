package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {
	
	public static RemoteWebDriver driver;
	
	@FindBy(xpath="//div[@aria-label='To']/descendant::input")
	public WebElement to;
	
	@FindBy(xpath="//input[@aria-label='Subject']")
	public WebElement subject;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	public WebElement messagebody;
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement attachement;
	
	@FindBy(xpath="//div[text()='Send']")
	public WebElement send;
	

	public ComposePage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void enterDataInTo(String toaddress) throws Exception
	{
		to.sendKeys(toaddress);
		Thread.sleep(2000);
	}
	
	public void enterSubject(String subjectmessage) throws Exception
	{
		subject.sendKeys(subjectmessage);
		Thread.sleep(2000);
	}
	
	public void entermessagebody(String body) throws Exception
	{
		messagebody.sendKeys(body);
		Thread.sleep(2000);
	}
	
	public void doattachement(String attach) throws Exception
	{
		attachement.sendKeys(attach);
		Thread.sleep(5000);
	}
	
	public void clickonSend() throws Exception
	{
		send.click();
		Thread.sleep(5000);
	}
}
