package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1512");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='To']/descendant::input")).sendKeys("lmerugu28@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("wishes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi \n How are you?");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch35.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
	/*	String x=	driver.findElement(By.xpath("//span[text()='Message sent']")).getText();
		System.out.println(x);*/
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/img")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
	
	}

}
