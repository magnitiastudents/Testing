package com.qa.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test78 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		int alllinks=0;
		int workinglinks=0;
		int brokenlinks=0;

		for(WebElement e:l)
		{
			try {
				
				if(e.getAttribute("href")!=null)
				{
				String x=e.getAttribute("href");

				if(x.startsWith("http")| x.startsWith("https"))
				{
					alllinks++;

					URL u=new URL(x);
					HttpURLConnection k=(HttpURLConnection) u.openConnection();
					k.connect();
					if(k.getResponseCode()==200)
					{
						workinglinks++;
					}
					else
					{
						brokenlinks++;
					}
				}			
			}	
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			}
			
			System.out.println("all links " + alllinks );
			System.out.println("all workinglinks " + workinglinks );
			System.out.println("all brokenlinks " + brokenlinks );
	}

}
