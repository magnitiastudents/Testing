package com.qa.webelement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submit {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("batch37",Keys.TAB,"Test Automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		

	}

}
