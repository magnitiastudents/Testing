package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDOMAttributeAndgetDOMProperty {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(e.getDomAttribute("maxLength"));
		System.out.println(e.getDomProperty("clientHeight"));
		
		System.out.println(e.getAttribute("maxLength"));
		System.out.println(e.getAttribute("clientHeight"));
	}

}
