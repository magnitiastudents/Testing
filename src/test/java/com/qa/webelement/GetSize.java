package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//button[@name='login']"));
		Dimension d=e.getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		
		
		Point p=e.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		
		
		Rectangle r=e.getRect();
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		System.out.println(r.getX());
		System.out.println(r.getY());

	}

}
