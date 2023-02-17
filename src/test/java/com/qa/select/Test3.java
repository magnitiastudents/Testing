package com.qa.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(e);
		s.selectByVisibleText("Amazon Fresh");

	}

}
