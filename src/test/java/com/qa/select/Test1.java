package com.qa.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("It is a multi dropdown");
		}
		
		else
		{
			System.out.println("It is a single select dropdown");
		}

	}

}
