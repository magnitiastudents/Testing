package com.qa.fulentclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Batch37");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("TestAutomation");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();		

	}

}
