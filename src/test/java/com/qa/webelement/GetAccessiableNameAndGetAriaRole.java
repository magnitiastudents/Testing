package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAccessiableNameAndGetAriaRole {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(e.getAccessibleName());
		System.out.println(e.getAriaRole());

	}

}
