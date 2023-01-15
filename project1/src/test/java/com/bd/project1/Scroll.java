package com.bd.project1;

import org.testng.annotations.Test;

public class Scroll extends BaseClass {
	
	
	static String daraz = "https://www.daraz.com.bd/";
	
	
	@Test
	public void openUrl() throws InterruptedException {
		
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	

}
