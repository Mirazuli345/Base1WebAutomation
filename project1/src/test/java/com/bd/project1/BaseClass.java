package com.bd.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static String baseUrl="https://www.daraz.com.bd/";
	
	static String yahoo = "https://login.yahoo.com/";
	
	
	
	WebDriver driver;
	
	@BeforeSuite
	public void start() {
		
		String browser = System.getProperty("browser","chrome");
		
		
		if (browser.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
	}
	
	@AfterSuite
	public void end() {
		
		driver.quit();
		
	}

}
