package com.pom.rough;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	@Parameters({"browser"})
	@Test
	public void parallelTest(String b) throws InterruptedException {
		Date d = new Date();
		System.out.println("browser name"+"  "+b+" "+"  "+d);
		Thread.sleep(3000);
	}

	}


