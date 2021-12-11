package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Self_Practice {
	public static WebDriver driver; 

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
	
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("gv2285@gmail.com");
		driver.findElement(By.id("password")).sendKeys("grv22");
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
	}

}
