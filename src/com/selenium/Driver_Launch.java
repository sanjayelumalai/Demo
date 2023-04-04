package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Launch {
	
	
	
	public static void main(String[] args) {
		
		    ///             // -->key
		System.setProperty("webdriver.chrome.driver", 
				// -->path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");
		
		//object
		// interface            class            -->  upcasting
		WebDriver driver = new ChromeDriver();
		
		// parent               child
		
		driver.get("https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		System.out.println("DONE");
	}
	
	

	
	
	
	
	
	

}
