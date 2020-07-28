package com.pom.rough;

import org.testng.annotations.Test;


public class TestInvocation extends BaseTest{

	@Test(invocationCount=2)
	public void invocationCount() {
		dr = getDriver("chrome");
		dr.get("https://www.google.com");
		String title = dr.getTitle();
		System.out.println(title);
		dr.quit();
}
	
}