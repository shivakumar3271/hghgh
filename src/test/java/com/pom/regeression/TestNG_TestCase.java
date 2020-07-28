package com.pom.regeression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_TestCase {
@BeforeTest
	public void dbConnecting() {
		System.out.println("connect to database");
	}
	@AfterTest
	public void dbConnClose() {
		System.out.println("db connection close");
	}
	@BeforeMethod
	public void launch() {
		System.out.println("browser launch before every method");
	}
	@org.testng.annotations.Test(priority=2)
	public void doLogin() {
		
		System.out.println("demo test execute first ");
		
	}
	@Test(priority=1)
	public void userReg() {
		System.out.println("second testcase");
	}
@AfterMethod
public void doLogut() {
	System.out.println("closing the browser");
}
	
}

