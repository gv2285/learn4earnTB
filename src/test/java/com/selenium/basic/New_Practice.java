package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Practice {
public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	//syntaxes of xpath
	//1. //html[@attribute='value']
	//2.  //html[@attribute='value' and @attribute='value']
	//3.  //html[text()='value'] 
	//4.  //html[contains(text(),'value')]
	//5.   //html[contains(@attribute,'value')]
	//6.   //html[starts-with(@attribute,'value')]
	//7.    //html[ends-with(@attribute,'value')]
	
	driver.findElement(By.cssSelector("a[class=signin]"));
	//driver.findElement(By.cssSelector("input[id))
	
	

	}

}
