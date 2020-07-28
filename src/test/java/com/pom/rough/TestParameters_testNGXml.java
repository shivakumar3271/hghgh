package com.pom.rough;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters_testNGXml {
	@Parameters({"browser"})
	@Test
	public void getBrowser(String browser) {
	System.out.println(browser);	
	}

}
