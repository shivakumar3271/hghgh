package com.pom.rough;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dependencies_TestCase {
	@Test(priority=2, dependsOnMethods="userReg",groups= {"functional","smoke"})
public void doLogin() {
		
		System.out.println("Login succesfully ");
		
	}
	@Test(priority=1,groups="smokeTest")
	public void userReg() {
		System.out.println("register before login testcase");
		Assert.fail("user not registerd to login");
	}
	@Test(priority=3,dependsOnMethods= {"doLogin","userReg"},alwaysRun=true,groups="smoketest")
	public void createUser() {
		System.out.println("After login u can create new users");
		
	}
}
