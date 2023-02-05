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

public class Test80 {

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
			
			switch(x)
			{
			case "text": textboxs++;
						break;
			case "radio": radiobuttons++;
						break;
			case "check": checkboxes++;
						break;
			case "phone": phonenumbers++;
						break;
			case "submit": submit++;
						break;	
						
			default:otherelements++;
					
						
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
