package com.qa.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		/*WebDriverManager obj=WebDriverManager.chromedriver();
		obj.setup();*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

}
