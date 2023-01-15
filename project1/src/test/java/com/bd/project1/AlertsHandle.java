package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsHandle extends BaseClass {
	
	static String formUrl = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(formUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 1)
	public void alertwork() throws InterruptedException {
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		Thread.sleep(3000);
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		String resultText = result.getText();
		if (resultText.contains("You successfully clicked an alert")) {
			
			System.out.println("Passed: "+resultText);
			
		}
		
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		if (resultText.contains("You clicked: Cancel")) {
			
			System.out.println("Passed "+resultText);
			
		}
		
		
		jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello Alert");
		driver.switchTo().alert().accept();
		
		if (resultText.contains("You entered: Hello Alert")) {
			
			System.out.println("Passed "+resultText);
			
		}
		
		Thread.sleep(2000);
		
		
	}
	

}
