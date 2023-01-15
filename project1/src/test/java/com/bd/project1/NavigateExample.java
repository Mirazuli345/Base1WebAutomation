package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateExample extends BaseClass {
	
	static String daraz = "https://www.daraz.com.bd/";
	
	
	@Test (priority = 0)
	public void urlStart() throws InterruptedException {
		
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 1)
	public void navigate() throws InterruptedException {
		
		WebElement logIn = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		logIn.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	

}
