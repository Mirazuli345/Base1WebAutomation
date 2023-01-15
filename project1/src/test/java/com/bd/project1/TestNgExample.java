package com.bd.project1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Hello beforesuit");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("After Suuit");
	}
	
	@Test
	public void testSuit() {
		System.out.println("Hello test suit");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before Test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Hello before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		
	}
}
