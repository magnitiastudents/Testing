package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip_Way2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//div[contains(text(),'Top')]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).clickAndHold(e).build().perform();
		String y=e.findElement(By.xpath("child::span")).getText();
		System.out.println(y);
		act.release(e).build().perform();
	}

}
