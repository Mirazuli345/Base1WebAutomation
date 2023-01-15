package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExample extends BaseClass {
	
	static String formUrl = "https://qavbox.github.io/demo/signup/";
	
	@Test(priority = 0)
	public void openUrl() {
		
		driver.get(formUrl);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void dropDown() throws InterruptedException {
		
		WebElement dropDownBtn = driver.findElement(By.xpath("//select[@name='sgender']"));
		
		
		Select select = new Select(dropDownBtn);
		
//		select.selectByIndex(2);
//		select.selectByValue("female");
		select.selectByVisibleText("Not Applicable");
		
		
		Thread.sleep(3000);
		
		
	}

}
