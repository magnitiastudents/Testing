package com.qa.select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30)); //maximum waiting time
		wait.pollingEvery(Duration.ofSeconds(1)); // Interval time
		//Step-1 locate element
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Gender'])[2]/following::div[5]")));
		//step-2 click on element
		e.click();
		
		e.findElement(By.xpath("child::div[2]/div[5]")).click();
		
		
		
	

	}

}
