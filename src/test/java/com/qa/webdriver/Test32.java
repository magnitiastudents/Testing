package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//way-1
		driver.findElement(By.id("email")).sendKeys("testing15122021@gmail.com");
		
		//way-2
		
//		By b = By.id("email");
//		driver.findElement(b).sendKeys("testing15122021@gmail.com");
		
		//way-3
		
//		WebElement e=driver.findElement(By.id("email"));
//		e.sendKeys("testing15122021@gmail.com");
		
		
	}

}
