package com.bd.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ScrollAndJs extends BaseClass {
	
	public static String linkString = "https://rahulshettyacademy.com/AutomationPractice/";
	
	@Test
	public void ScrollJs() throws InterruptedException {
		
		driver.get(linkString);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(2000);
		
		WebElement mouseHover = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mousehover") ));
		
		//js.executeScript("arguments[0].scrollIntoView();", mouseHover);
		
		hoverMethod(mouseHover);
		Thread.sleep(3000);
		
		
	}
	
	public void hoverMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
