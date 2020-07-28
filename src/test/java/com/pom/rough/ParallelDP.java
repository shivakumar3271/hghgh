package com.pom.rough;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDP {
	
	@Test(dataProvider="getData")
	public void parallelTest(String b) throws InterruptedException {
		Date d = new Date();
		System.out.println("browser name"+"  "+b+" "+"  "+d);
		Thread.sleep(3000);
	}
@DataProvider(parallel=true)
public Object[][] getData(){
	Object[][] browser = new Object[2][1];
	browser[0][0]="chrome";
	browser[1][0]="firefox";
	return browser;
}

}
