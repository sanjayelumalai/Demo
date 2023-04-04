package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {

	public static void main(String[] args) {

		// Key
		System.setProperty("webdriver.chrome.driver",
//Value ---> Path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
//		// 	BASIC XAPTH
//		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
//		user.sendKeys("Sanjay");
		
		
	    // xpath with TEXT
		
		WebElement first = driver.findElement(By.xpath("//div[text()='Last name']"));
		first.sendKeys("Samith");
		
		
		
		// XPATH WITH INDEX
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Steve");
		
		// Xpath With contains
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'whsOnd z')])[4]"));
		password.sendKeys("13424gfegkjf");
		
	
		
		

	}
}
