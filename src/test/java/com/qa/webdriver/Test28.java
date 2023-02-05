package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test28 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		String x= driver.getPageSource();
		System.out.println(x);
		
		if(x.contains("html"))
		{
			System.out.println("Web pages developed by using html");
		}
		else
		{
			System.out.println("Web pages not developed by using html");
		}
		
		if(x.contains("svg"))
		{
			System.out.println("Web pages developed by using SVG");
		}
		else
		{
			System.out.println("Web pages not developed by using SVG");
		}
		
		if(x.contains("shadow-root"))
		{
			System.out.println("Web pages developed by using web components");
		}
		else
		{
			System.out.println("Web pages not developed by using  web components");
		}
		
	}

}
