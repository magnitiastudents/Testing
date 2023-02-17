package com.qa.select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30)); //maximum waiting time
		wait.pollingEvery(Duration.ofSeconds(1)); // Interval time
		//Step-1 locate element
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='multiple-selection']/following-sibling::div")));
		
		//step -2 : click on dropdown
		
		e.click();
		
		//step-3 
		List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
		//step-4 select items one by one
		Thread.sleep(2000);
		for(WebElement item:l)
		{
			item.click();
			Thread.sleep(2000);
		}
		
	

	}

}
