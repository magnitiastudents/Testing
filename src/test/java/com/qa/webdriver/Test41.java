package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("testing15122021@gmail.com",Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("823456979",Keys.TAB,Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().click();
	}

}
