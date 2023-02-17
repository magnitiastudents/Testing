package com.qa.screenshotas;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPage {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		Thread.sleep(3000);*/
		
		File desc= new File("src\\test\\resources\\fullpage.png");
		AShot as =new AShot();
		ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
		Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
		ImageIO.write(ss.getImage(), "PNG", desc);
	}

}
