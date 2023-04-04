package com.DropDown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {

	
	public static void main(String[] args) {
		
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://letcode.in/dropdowns");
			
			
			WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
			
			Select s = new Select(fruits);
			
			s.selectByVisibleText("Orange");
			s.selectByValue("3");
		
			
			System.out.println("DONE");

			
			
			
			
			
			
	}
}
