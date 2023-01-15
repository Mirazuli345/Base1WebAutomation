package com.bd.project1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitSelenium extends BaseClass {
	
	public static String pracUrl = "https://qavbox.github.io/demo/delay";
	
	@Test
	public void seleniumWait() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get(pracUrl);
		
		//declaration
		By lateText = By.xpath("//h2[@id='two']");
		By delayText = By.xpath("//h2[@id='loaderdelay']");
		By secondBtnText = By.xpath("//h2[@id='delay']");
		
		
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(lateText, "I am here!"));
		
		
		WebElement lateTextElement = driver.findElement(lateText);
		System.out.println("passed: "+ lateTextElement.getText());
		
		
		driver.findElement(By.xpath(" //input[@id='loaderStart']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(delayText, "I appeared after 5 sec loading"));
		
		System.out.println(driver.findElement(delayText).getText());
		
		
		//second button
		driver.findElement(By.xpath("//input[@name='commit1']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(secondBtnText));
		System.out.println(driver.findElement(secondBtnText).getText());
		
		
		
		
		
	}
	
	

}
