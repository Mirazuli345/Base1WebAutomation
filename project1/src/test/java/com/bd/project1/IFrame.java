package com.bd.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrame extends BaseClass {
	
	public static String linkAdd = "https://jqueryui.com/checkboxradio";
	
	@Test
	public void startUrl() throws InterruptedException {
		
		driver.get(linkAdd);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//iframe
		WebElement iframee = getElement(By.className("demo-frame"));
		driver.switchTo().frame(iframee);
		
//		WebElement paris = driver.findElement(By.xpath("//label[@for='radio-2']"));
//		paris.click();
		
		parisClick(By.xpath("//label[@for='radio-2']"));
		
		Thread.sleep(2000);
		
		//close iframe
		driver.switchTo().defaultContent();
		
		//WebElement text = driver.findElement(By.xpath("//p[@class='desc']"));
		System.out.println(getTextElement(By.xpath("//p[@class='desc']")));
		
		
		
		
	}
	public WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	public void parisClick(By locator) {
		
		getElement(locator).click();
	}
	
	public String getTextElement(By locator) {
		return getElement(locator).getText();
	}
	
	
	
}
