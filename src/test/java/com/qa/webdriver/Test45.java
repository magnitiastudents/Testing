package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);

		try
		{
			driver.findElement(By.xpath("(//*[text()='Login'])[2]/preceding::button[1]")).click();
		}

		catch (Exception ex)
		{
			System.out.println("Banner is not available ");
		}

		driver.findElement(By.xpath("(//*[text()='Mobiles'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Shop Now'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(text(),'realme C30 (Lake Blue, 32 GB)')])[1]")).click();

		Set<String> x=driver.getWindowHandles();

		List<String> l= new ArrayList<String>(x);

		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.quit();
		


	}

}
