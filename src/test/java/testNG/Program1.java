package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public static void begin() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	
	}
	
	@Test
	public static void signinLinkClik() {
		WebElement signinlink = driver.findElement(By.className("signin"));
		if(signinlink.isEnabled() == true) {
			signinlink.click();
		}
		else {
			System.out.println("This link is not working");
		}	
		}
		
		@AfterMethod
		public static void tearDown() {
			driver.quit();
		}
		
	}
