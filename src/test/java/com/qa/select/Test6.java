package com.qa.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement e= driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(e);
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).click(s.getOptions().get(3))
								 .click(s.getOptions().get(2))
								 .click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
		
		List<WebElement> l=s.getAllSelectedOptions();
								 
		for(WebElement k:l)
		{
			System.out.println(k.getText());
		}
		
		
		WebElement t=s.getFirstSelectedOption();
		System.out.println(t.getText());
		
		s.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		s.deselectByValue("opel");
		Thread.sleep(5000);
		s.deselectByIndex(1);
		
	}

}
