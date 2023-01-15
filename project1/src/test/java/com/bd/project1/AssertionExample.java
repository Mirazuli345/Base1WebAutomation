package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseClass {
	
	static String formUrl = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(formUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	/*
	 * Assertion 2 types: 1. Hard Assertion 2.Soft Assertion
	 * hard assertion->Execution stop
	 * Soft Assertion-> execution continue
	 */
	
	@Test(priority = 1)
	public void alertwork() throws InterruptedException {
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		//soft Assert
		SoftAssert softAssert = new SoftAssert();
		
		jsAlert.click();
		Thread.sleep(3000);
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		String resultText = result.getText();
		
		//hard assert
		softAssert.assertEquals(resultText, "You successfully clicked an aler");
		
		
		
		
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
		
		
		softAssert.assertAll();
		
		
	}
	

}
