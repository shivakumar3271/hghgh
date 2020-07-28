package com.pom.rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password) {
		System.out.println(username+"   "+password );
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]= "ganeshcom";
		data[0][1]= "sdlkfjsdlf";
		data[1][0]= "shiva";
		data[1][1]= "sdlkfjsdlf";
		data[2][0]= "kumar";
		data[2][1]= "sdlkfjsdlf";
		
		
		
		return data;
	}
}
