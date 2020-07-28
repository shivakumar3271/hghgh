package com.pom.rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver dr; 
		dr  = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.get("https://classic.crmpro.com/index.html");
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("ganesh_t");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("Ganesh@1234");
		dr.findElement(By.xpath("//input[@class='btn btn-small']")).submit();
		dr.switchTo().frame("mainpanel");
		dr.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		List<WebElement> contacts = dr.findElements(By.xpath(""));
		//a[contains(text(),'adsjkkAS KASDJ')]
	}

}
