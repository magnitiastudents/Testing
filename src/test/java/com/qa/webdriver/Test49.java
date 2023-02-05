package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test49 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Long st=	System.currentTimeMillis();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		Long et=	System.currentTimeMillis();
		System.out.println(et-st);
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.navigate().back();  // facebook
		Thread.sleep(5000);
		driver.navigate().forward(); //gmail
		Thread.sleep(5000);
		driver.navigate().refresh(); //gmail
		Thread.sleep(5000);
		driver.close();
		
	}

}
