package com.qa.fulentclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30)); //to wait maximum waiting time
		wait.pollingEvery(Duration.ofSeconds(1));  // interval time
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))).sendKeys("batch37");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']"))).sendKeys("TestAutomation");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();

	}

}
