package com.qa.webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test63 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1512");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		Cookie cc= new Cookie("magnitia","batch37");
		driver.manage().addCookie(cc);
		
		
		Cookie a=driver.manage().getCookieNamed("NID");
		System.out.println(a);
		
		Set<Cookie> s=driver.manage().getCookies();
		List<Cookie> l= new ArrayList<Cookie>(s);
		System.out.println(l.size());
		
		for(Cookie e:l)
		{
			System.out.println(e.getName() +" value is "+ e.getValue());
		}
		
		driver.manage().deleteCookieNamed("NID");
		
		driver.manage().deleteCookie(l.get(4));
		
		driver.manage().deleteAllCookies();

	}

}
