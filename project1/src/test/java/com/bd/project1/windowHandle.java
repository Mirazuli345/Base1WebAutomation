package com.bd.project1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class windowHandle extends BaseClass {
	
	public static String url="https://rahulshettyacademy.com/AutomationPractice/";
	
	
	@Test
	public void handleWindow() throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		
		List<String> wHandleList = new ArrayList<String>(driver.getWindowHandles()) ;
		driver.switchTo().window(wHandleList.get(1));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		
		driver.switchTo().window(wHandleList.get(0));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(2000);
//		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(2000);
//		
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
		
	}

}
