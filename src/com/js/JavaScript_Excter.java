package com.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Excter {
	
	
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				// Value ---> Path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,3000)", "");
		
		
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView();", facebook);
		
		System.out.println("Done");
		
	}
}
