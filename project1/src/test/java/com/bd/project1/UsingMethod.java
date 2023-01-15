package com.bd.project1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class UsingMethod extends BaseClass {
	
	static String alertUrl = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(alertUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//JS alert
		click(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		System.out.println(getText());
		acceptAlert();
		Thread.sleep(3000);
		
		//JS confirm
		click(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		acceptAlert();
		
		//JS prompt
		click(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		driver.switchTo().alert().sendKeys("Hello");
		acceptAlert();
		
		//new tab
		newTab();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		click(By.id("opentab"));
		Thread.sleep(3000);
		
		click(By.id("openwindow"));
		Thread.sleep(2000);
		
		List<String> windowControList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowControList.get(1));
		
		
//		
//		newTab();
//		driver.get("https://qavbox.github.io/demo/signup/");
//		getElement(By.xpath("//select[@name='sgender']"));
//		dropDown(null)
//		
		
		Thread.sleep(4000);
		
		
		
		
	}
	
	public WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public void click(By locator) {
		getElement(locator).click();
	}
	
	public String getText() {
		return driver.switchTo().alert().getText();
	}
	
	public void acceptAlert() {
		 driver.switchTo().alert().accept();;
	}
	
	public void newTab() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	}
	
	
	
	
	
	
	
	
	

}
