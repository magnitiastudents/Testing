package com.qa.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test67 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		int vis=0;
		int hid=0;
		int enabled =0;
		int disabled =0;
		
		if(l.size()==0)
		{
			System.out.println("No elemenets found in page");
		}
		else
		{
			for(WebElement e:l)
			{
				if(e.isDisplayed())
				{
					vis++;
					if(e.isEnabled())
					{
						enabled++;
					}
					else
					{
						disabled++;
					}
				}
				else
				{
					hid++;
				}
			}
		}
		
		System.out.println("Total visible elements " +vis);
		System.out.println("Total hidden elements " +hid);
		System.out.println("Total enabled elements " +enabled);
		System.out.println("Total disabled elements " +disabled);
	}

}
