package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test26 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		System.out.println(x);
		
		if(x.startsWith("https"))
		{
			System.out.println("It is secured web site");
		}
		
		else
		{
			System.out.println("It is not secured web site");
		}
		
		
	}

}
