package com.qa.runnerclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.pom.ComposePage;
import com.qa.pom.HomePage;
import com.qa.pom.LoginPage;
import com.qa.pom.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClassForGmail {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://www.gmail.com");
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailAddress("Testing15122021@gmail.com");
		lp.clickOnNext();
		lp.enterPassword("Testing1512");
		lp.clickOnLogin();
		
		
		HomePage hp=new HomePage(driver);
		hp.composeButtonIsDispalyed();
		hp.clickOnCompose();
		
		
		ComposePage cp= new ComposePage(driver);
		cp.enterDataInTo("sarithadara07@gmail.com");
		cp.enterSubject("wishes");
		cp.entermessagebody("Hi");
		cp.doattachement("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch35.txt");
		cp.clickonSend();
		
		
		LogoutPage logout = new LogoutPage(driver);
		logout.clickonprofilepic();
		logout.clickonsignout();
		logout.closebrowser();
		
		
	}

}
