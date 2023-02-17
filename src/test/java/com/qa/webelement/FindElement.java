package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

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
		WebElement e= driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]/td[4]/div[1]"));
		String x=e.getText();
		System.out.println(x);		
		String y=(String) driver.executeScript("return(arguments[0].textContent);", e);
		System.out.println(y);
		
		//way-2 RemoteWebElement
		
		WebElement a= driver.findElement(By.xpath("(//table)[6]/tbody"));
		WebElement b=a.findElement(By.xpath("child::tr[1]"));
		WebElement c=b.findElement(By.xpath("child::td[4]"));
		WebElement d=c.findElement(By.xpath("child::div[1]"));
		String[] k=(String[]) driver.executeScript("return(arguments[0].textContent);", d);
		System.out.println(k);
		System.out.println(k[0].trim());
		System.out.println(k[1].trim());
		System.out.println(k[2].trim());
		System.out.println(k[3].trim());
		System.out.println(k[4].trim());
		System.out.println(k[5].trim());
	}

}
