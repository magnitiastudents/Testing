package com.qa.select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(e);
		//add items to arraylist
		List<String> l1= new ArrayList<String>();
		List<String> l2= new ArrayList<String>();
		List<WebElement> items=s.getOptions();
		for(int i=1;i<items.size();i++)
		{
			l1.add(items.get(i).getText());
			l2.add(items.get(i).getText());
		}
		
		//2. sort the first arraylist (l1)
		Collections.sort(l1);
		
		//3.compare the both arraylists
		if(l1.equals(l2))
		{
			System.out.println("items are sorted order");
		}
		else
		{
			System.out.println("items are not sorted order");
		}
	}

}
