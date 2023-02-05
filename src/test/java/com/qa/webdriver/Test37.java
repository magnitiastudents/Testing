package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test37 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_attributes_value");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//*[@id='fname']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='lname']")).clear();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Batch37");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='lname']")).sendKeys("Test Automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
