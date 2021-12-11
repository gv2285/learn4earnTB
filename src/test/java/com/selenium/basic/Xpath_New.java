package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_New {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		//driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		//driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		//driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		
		
		//driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[1]")).click();
		//driver.findElement(By.xpath("//span[@id = 'username']/following-sibling::p/child::a[1]")).click();
		//driver.findElement(By.xpath("//div[@class = 'table']/child::div[3]/descendant::a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following-sibling::div[2]/child::div[1]/descendant::a[contains(@class, 'signin')]")).click();
		//driver.findElement(By.xpath("//div[@class = 'srchcontainer']/parent::div[1]/preceding::a[@class = 'signin']")).click();
		
		
		
		
		
	}

}
