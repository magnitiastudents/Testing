package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

	public static void main(String[] args) {
		
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.operadriver().driverVersion("94.0.4606.61").browserVersion("94.0.4606.38").setup();
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.facebook.com");

	}

}
