package com.qa.webdriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name:");
		String bn=sc.nextLine();
		if(bn.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver = new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			RemoteWebDriver driver = new EdgeDriver();
		}
		
		else if (bn.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			RemoteWebDriver driver =new FirefoxDriver();
		}
		
		else if(bn.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver", "C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\operadriver_win64\\operadriver.exe");
			RemoteWebDriver driver = new OperaDriver();
		}
		else
		{
			System.out.println("Entered wrong browser name");
		}

		

	}

}
