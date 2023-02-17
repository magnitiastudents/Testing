package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCssValue_Gmail_Link {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		//before mouse hover
		WebElement e= driver.findElement(By.xpath("//a[text()='Gmail']"));
		String x=e.getCssValue("text-decoration");
		System.out.println(x);
		
		//move to element
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		
		//after mouse hover on element
		
		String y=e.getCssValue("text-decoration");
		System.out.println(y);
		
		if(y.contains("underline"))
		{
			System.out.println("Gmail is displaying as link");
		}
		else
		{
			System.out.println("Gmail is not displaying as link");
		}
				

	}

}
