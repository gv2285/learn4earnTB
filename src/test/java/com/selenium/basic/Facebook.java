package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	public static ChromeOptions options =  new ChromeOptions();
	
	

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preciding::a[1]")).click();
	driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("tom");
	driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("pon");
	driver.findElement(By.xpath(null))
	
	
	

	}

}
