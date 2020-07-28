package com.pom.rough;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;




public class Multiple_dataProviders {
	
	
	@DataProvider(name="dp1")
		public static Object[][] getData(Method m){
		Object[][] data =null;
		if(m.getName().equals("testLogin")) {
			data= new Object[3][2];
			
			data[0][0]="ganesh";
			data[0][1]="ldkhgsdg";
			
			data[1][0]="shiva";
			data[1][1]="trgh";
			
			data[2][0]="sdlkfja";
			data[2][1]="hkj";
			
		}else if (m.getName().equals("testUserReg")) {
			 data = new Object[3][3];
				
				data[0][0]="ganesh";
				data[0][1]="ldkhgsdg";
				data[0][2]="ldkhgsdg";
				
				data[1][0]="shiva";
				data[1][1]="trgh";
				data[1][2]="ldkhgsdg";
				
				data[2][0]="sdlkfja";
				data[2][1]="hkj";
				data[2][2]="ldkhgsdg";
			
		}
		return data;
		 
		}
	/*@DataProvider(name="dp2")
	public static Object[][] getData1(){
	
	 data = new Object[3][3];
	
	data[0][0]="ganesh";
	data[0][1]="ldkhgsdg";
	data[0][2]="ldkhgsdg";
	
	data[1][0]="shiva";
	data[1][1]="trgh";
	data[1][2]="ldkhgsdg";
	
	data[2][0]="sdlkfja";
	data[2][1]="hkj";
	data[2][2]="ldkhgsdg";
	
	return data;
	}*/

	}


