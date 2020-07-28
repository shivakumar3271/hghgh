package com.pom.rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.utilities.ExcelReader;

public class Parameterization_ExcelData {
	public static ExcelReader excel =null;
	
	@Test(dataProvider="getData")
	public void testData(String usn, String pwd, String is_correct) {
		System.out.println(usn +" "+ pwd+" "+is_correct);
		
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
	 Object[][] data = new Object[rows-1][cols];
	 
	 for(int rowNum=2; rowNum<=rows; rowNum++) {
		 
		 for(int colNum=0; colNum<cols; colNum++) {
			data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
		 }
	 }
	 
	
			return data;
	
	
}

}
