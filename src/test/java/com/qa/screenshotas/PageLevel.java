package com.qa.screenshotas;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLevel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		Thread.sleep(3000);
		File desc= new File("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\workspace\\com.google.gmail\\src\\test\\resources\\pagelevel.png");
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, desc);

	}

}
