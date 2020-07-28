package com.pom.regeression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Vallidation_TestNG {
	
	
	@Test()
	public void validatingTitles() {
		SoftAssert sassert = new SoftAssert();
		System.out.println("Begining the test");
		String expected_title ="yahoo.com";
		String act_title = "gmail.com";
		System.out.println("validating title");
		sassert.assertEquals(act_title, expected_title);
	//	Assert.assertTrue(false, "element is not present");
		System.out.println("validate image");
		sassert.assertEquals(true, false,"image validating");
		//sassert.fail("Condition try to fail forcefully");
		System.out.println("end the test");
		sassert.assertAll();
	}

}
