package com.qa.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement e= driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(e);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(s.getOptions().get(3))
								 .pause(5000)
								 .click(s.getOptions().get(2))
								 .pause(5000)
								 .click(s.getOptions().get(1))
		   .keyUp(Keys.CONTROL).build().perform();

	}

}
