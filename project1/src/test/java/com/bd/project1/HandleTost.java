package com.bd.project1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleTost extends BaseClass {
	
	public static String darazUrl = "https://member.daraz.com.bd/user/login";
	
	
	@Test
	public void startOpen() throws InterruptedException {
		
		driver.get(darazUrl);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("0111111");
		driver.findElement(By.xpath("//input[@placeholder='Please enter your password']")).sendKeys("ffefacaf12");
		driver.findElement(By.xpath("//button[@class='next-btn next-btn-primary next-btn-large']")).click();
		Thread.sleep(3000);
		
		//WebElement ifram = driver.findElement(By.id("ssIFrame_google"));
		
		//driver.switchTo().frame("ssIFrame_google");
		WebElement tostMessage = driver.findElement(By.xpath("//div[@class='next-feedback-content']"));
		assertEquals(tostMessage.getText(),"Please enter a valid phone number.");
		
		
		
		
		
		
	}

}
