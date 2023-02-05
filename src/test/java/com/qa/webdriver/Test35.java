package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
		e.sendKeys("Ratan Tata",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("TCS",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		WebElement e2 = driver.findElement(By.xpath("//input[@name='q']"));
		e2.sendKeys("Maginitia",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();

	}

}
