package com.qa.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test79 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//input"));
		System.out.println(l.size());
		int textboxs=0;
		int radiobuttons=0;
		int checkboxes=0;
		int phonenumbers=0;
		int submit=0;
		int otherelements=0;
		
		for(WebElement e:l)
		{
			String x=e.getAttribute("type");
			if(x.equalsIgnoreCase("text"))
			{
				textboxs++;
			}
			else if(x.equalsIgnoreCase("radio"))
			{
				radiobuttons++;
			}
			else if(x.equalsIgnoreCase("check"))
			{
				checkboxes++;
			}
			else if(x.equalsIgnoreCase("phone"))
			{
				phonenumbers++;
			}
			else if(x.equalsIgnoreCase("submit"))
			{
				submit++;
			}
			else
			{
				otherelements++;
			}			
		}
		
		System.out.println("count of text boxes " + textboxs);
		System.out.println("count of radiobuttons " + radiobuttons);
		System.out.println("count of checkboxes boxes " + checkboxes);
		System.out.println("count of phone numbers " + phonenumbers);
		System.out.println("count of submit buttons " + submit);
		System.out.println("count of other elements " + otherelements);
		
	}

}
