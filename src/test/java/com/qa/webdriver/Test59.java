package com.qa.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test59 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing15122021@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1512");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='To']/descendant::input")).sendKeys("lmerugu28@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("wishes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi \n How are you?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch35.txt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
	/*	String x=	driver.findElement(By.xpath("//span[text()='Message sent']")).getText();
		System.out.println(x);*/
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		
	
	}

}
