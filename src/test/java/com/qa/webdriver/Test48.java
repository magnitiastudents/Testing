package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test48 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1512");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='To']/descendant::input")).sendKeys("tummala.ramireddy234@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("wishes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi \n How are you?");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch35.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		Set<String> s =driver.getWindowHandles();

		List<String> l= new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("http://www.yahoomail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("tummala.ramireddy234@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(5000);


		/*try {
			WebElement e= driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
			driver.switchTo().frame(e);
			Thread.sleep(2000);
			//Way-2 locate element by using SWD-Java and operate element by using JavascriptExecutor
			WebElement e2 = driver.findElement(By.xpath("(//*[@id='recaptcha-anchor']/child::div)[4]"));
			driver.executeScript("arguments[0].click();",e2);
			//driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
			Thread.sleep(2000);

			WebElement e1=driver.findElement(By.xpath("(//button[text()='Continue']/preceding::iframe)[2]"));
			driver.switchTo().frame(e1);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
		}
		catch (Exception ex){
			System.out.println("RECAPTCHA is not displaying");
		}*/

		Screen sx = new Screen();
		sx.click("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\workspace\\com.google.gmail\\src\\test\\resources\\checkbox.png");
		Thread.sleep(5000);
		sx.click("C:\\Users\\Rami Reddy\\Desktop\\Batches\\Batch37\\workspace\\com.google.gmail\\src\\test\\resources\\continue.png");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("9000921856");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		
		String x=driver.findElement(By.xpath("(//*[@aria-label='Select message']/following::span)[3]")).getAttribute("title");
		if(x.contains("testing15122021"))
		{
			System.out.println("we have received mail from testing15122021@gmail.com");
		}
		else
		{
			System.out.println("we have not received mail from testing15122021@gmail.com");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(l.get(0));
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/img")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
