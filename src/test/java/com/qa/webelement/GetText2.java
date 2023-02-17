package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//div[text()='Gender'])[1]/following::div[2]"));
		String x=e.getText();
		System.out.println(x);
		
		
		String y=(String) driver.executeScript("return(arguments[0].textContent);", e);
		System.out.println(y);
	}
}
