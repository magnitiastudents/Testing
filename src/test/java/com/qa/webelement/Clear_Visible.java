package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear_Visible {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("batch37");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
	}

}
