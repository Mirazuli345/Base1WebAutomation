package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverExample extends BaseClass {
	
	static String daraz = "https://www.daraz.com.bd/";
	
	@Test(priority = 0)
	public void startUrl() throws InterruptedException {
		
		
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 1)
	public void hoverTest() throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		WebElement latest = driver.findElement(By.xpath("//span[contains(text(),'Latest Mobile Accessories')]"));
		WebElement cable = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		
		action.moveToElement(electronic).perform();
		Thread.sleep(4000);
		
		action.moveToElement(latest).perform();
		Thread.sleep(3000);
		
		cable.click();
		Thread.sleep(4000);
		
	
		
		
	}
	
	

}
