package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absulate_CXapth {
	

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("(/html/body/div/div/header/div[3]/div/div/div[6]/ul/li[1]/a)"));
		women.click();
		
	}

}
