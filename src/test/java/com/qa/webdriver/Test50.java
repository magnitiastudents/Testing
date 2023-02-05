package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test50 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Long st=	System.currentTimeMillis();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		Long et=	System.currentTimeMillis();
		System.out.println(et-st);

	}

}
