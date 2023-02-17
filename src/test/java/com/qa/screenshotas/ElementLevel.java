package com.qa.screenshotas;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLevel {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		
		File desc= new File("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\workspace\\com.google.gmail\\src\\test\\resources\\elementlevel.png");
		WebElement e= driver.findElement(By.xpath("//input[@name='q']"));
		File src=e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, desc);

	}

}
