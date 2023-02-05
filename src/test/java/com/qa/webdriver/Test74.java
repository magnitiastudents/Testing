package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test74 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);	
		List<WebElement> l=	driver.findElements(By.xpath("(//a)|(//href)|(//link)|(//base)|(//area)|(//img)|(//div)"));
		System.out.println(l.size());
		
		List<WebElement> l1= new ArrayList<WebElement>();
		
		List<WebElement> l2= new ArrayList<WebElement>();
		for(WebElement e:l)
		{
			if(e.getAttribute("href")!=null)
			{
				l1.add(e);
			}
			else
			{
				l2.add(e);
			}
		}
		
		System.out.println(l1.size());
		System.out.println(l2.size());
		
	}

}
