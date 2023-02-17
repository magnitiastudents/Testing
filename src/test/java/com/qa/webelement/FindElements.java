package com.qa.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1512");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(15000);
		
		//way-1 RemoteWebDriver
		List<WebElement> e= driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
		System.out.println(e.size());
		
		//way-2 RemoteWebElement
		List<WebElement> a= driver.findElement(By.xpath("(//table)[6]/tbody")).findElements(By.xpath("child::tr"));
		System.out.println(a.size());
	
	}

}
