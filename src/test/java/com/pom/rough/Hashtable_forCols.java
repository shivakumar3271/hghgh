package com.pom.rough;


	
	import java.util.Hashtable;

import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.pom.utilities.ExcelReader;

	 public class Hashtable_forCols {
		public static ExcelReader excel =null;
		
		@Test(dataProvider="getData")
		// we can't add if hundreds of cols so we use hashtable for this 
		public void testData(Hashtable<String, String> data) {
			System.out.println(data.get("usn"));
			
		}
	@DataProvider
	public Object[][] getData(){
		
		 if(excel==null) {
			// String Path ="F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\excel\\testdata.xlsx";
				 excel = new ExcelReader("F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\excel\\testdata.xlsx"); 
		 }
		 
		 String sheetName="login";
		 int rows = excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][1];
		 	Hashtable<String, String> table= null;
		
		 	for(int rowNum=2; rowNum<=rows; rowNum++) {
			 table= new Hashtable<String, String>();
			
			 	for(int colNum=0; colNum<cols; colNum++) {
				
				
				 //data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
			 		table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
			 		data[rowNum-2][0]=table;
			 	}
		 }
		 
		
				return data;
		
		
	}

	}



