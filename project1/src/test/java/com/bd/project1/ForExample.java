package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForExample extends BaseClass {
	
	static String testUrlString="https://demoqa.com/automation-practice-form";
	
	@Test(priority = 0)
	public void startWeb() {
		driver.get(testUrlString);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void testform() throws InterruptedException {
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Mirajul");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Islam");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("mirajulislam880@gmail.com");
		Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subject.sendKeys("Hello Im from ....hello...");
		Thread.sleep(3000);
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Kashimpur,Gazipur,dHAKA<Bangladesh");
		Thread.sleep(3000);
		
		WebElement maleBtn = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		maleBtn.click();
		Thread.sleep(1000);
		
		WebElement readingCheck = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
		readingCheck.click();
		
		
		
		
	}

}
