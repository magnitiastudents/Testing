package com.qa.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test76 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("table"));
		System.out.println(l.size());
	}

}
