package com.qa.webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		Point p=driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		Thread.sleep(5000);
		
		Point p1= new Point(150,150);
		driver.manage().window().setPosition(p1);
		
		
	}

}
