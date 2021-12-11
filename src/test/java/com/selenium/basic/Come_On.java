package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Come_On {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://rediff.com");
	//driver.findElement(By.className("signin")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	//driver.findElement(By.id("password")).sendKeys("Selenium@123");
	//driver.findElement(By.className("signinbtn")).click();
	//driver.findElement(By.className("rd_logout")).click();
	//driver.findElement(By.linkText("Rediff Home")).click();
	//driver.quit();
	//driver.findElement(By.partialLinkText("Create Acc")).click();
	
    
	}

}
