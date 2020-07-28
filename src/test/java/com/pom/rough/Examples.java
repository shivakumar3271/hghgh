package com.pom.rough;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Examples {
	
	public static void main(String[] args) {
	
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.chrome.driver","F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
		//dr = new FirefoxDriver();
		dr = new ChromeDriver();
		dr.get("https://www.zoho.com");
	}

}
