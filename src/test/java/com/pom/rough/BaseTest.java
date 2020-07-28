package com.pom.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public  WebDriver dr;
	
	public WebDriver  getDriver(String browser) {
		if(browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", " F:\\Maven_project\\POM_Project\\PageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			dr= new ChromeDriver();
					
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr= new FirefoxDriver();
	}
			return dr;
}
}