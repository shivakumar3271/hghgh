package com.pom.rough;

import org.testng.annotations.Test;


public class NewLoginTest {
	
	
	@Test(dataProviderClass=Multiple_dataProviders.class,dataProvider="dp1")
	public  void testLogin(String usn, String pwd) {
		System.out.println(usn+"  "+ pwd);
	}
	
	@Test(dataProviderClass=Multiple_dataProviders.class,dataProvider="dp1")
	public  void testUserReg(String fname, String lname, String email) {
		System.out.println(fname+"  "+ lname+"  "+email);
	}

}
