package com.pom.rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver dr; 
		dr  = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.com");
	
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		//List<WebElement> list = dr.findElements(By.xpath("//ul[@role='listbox']//li[3]"));
		List<WebElement> suggestions = dr.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(suggestions.size());
		
		for (int i=0; i<suggestions.size(); i++)
		{
			System.out.println(suggestions.get(i).getText());
			if (suggestions.get(i).getText().contains("testing tools"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		
	}
	
	
}



