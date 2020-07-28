package com.pom.rough;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestFailure {
	
	@Test
	public void login() {
		Assert.fail("login failed ");
		System.out.println("capture the screenshot");
	}

}
