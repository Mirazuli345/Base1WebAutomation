package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class firstAutomation extends BaseClass {
	
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
		
		driver.get(yahoo);
		Thread.sleep(4000);
	}
	
	@Test (priority = 1)
//	public void login() throws InterruptedException {
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String actual = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
//		
//		if (title.contains(actual)) {
//			
//			System.out.println("Verified");
//			
//		}
//		
//		WebElement logintext = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
//		logintext.click();
//		Thread.sleep(3000);
//		
//		
//	}
	
	
	public void testlocate() throws InterruptedException {
		
		//id
		WebElement id = driver.findElement(By.id("login-username"));
		id.sendKeys("test@yahoo.com");
		Thread.sleep(5000);
		id.clear();
		Thread.sleep(2000);
		
		//class
		WebElement classname = driver.findElement(By.className("phone-no"));
		classname.sendKeys("Test2@yahoo.com");
		Thread.sleep(3000);
		classname.clear();
		Thread.sleep(3000);
		
		//css
		WebElement cssId = driver.findElement(By.cssSelector("#login-username"));
		cssId.sendKeys("test3@yahoo.com");
		Thread.sleep(3000);
		cssId.clear();Thread.sleep(3000);
		//xpath
		WebElement xpath = driver.findElement(By.xpath("//input[@type='text']"));
		xpath.sendKeys("test4@yahoo.com");
		Thread.sleep(2000);
		xpath.clear();
		Thread.sleep(3000);
		
		WebElement andOr = driver.findElement(By.xpath("//input[@name='username' or @id='login-username']"));
		andOr.sendKeys("test5@yahoo.com");
		Thread.sleep(3000);
		
		//linktext
		WebElement fotgetBtn = driver.findElement(By.linkText("Forgot username?"));
		fotgetBtn.click();
		Thread.sleep(4000);
		
		
//		//name
//		WebElement nameNextBtnElement = driver.findElement(By.name("signin"));
//		nameNextBtnElement.click();
//		Thread.sleep(3000);
		
	}
}
