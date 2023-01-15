package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseClass {
	
static String testUrlString="https://demoqa.com/text-box";
	
	@Test(priority = 0)
	public void startWeb() {
		driver.get(testUrlString);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void copyPaste() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement cAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	
		
		name.sendKeys("Mirajul Islam");
		email.sendKeys("mirajul@gmail.com");
		cAddress.sendKeys("Kashimpur,Gazipur,Dhaka,Bangladesh");
		Thread.sleep(3000);
		
		
		//select Text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//paste
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(4000);
		
		
		
		
	}
	

}
