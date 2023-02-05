package com.qa.webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test52 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		Dimension d=	driver.manage().window().getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		Thread.sleep(5000);
		
		Dimension d1 = new Dimension(400,200);
		driver.manage().window().setSize(d1);
	}

}
