package com.alart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_1 {

	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("https://letcode.in/alert");
		
		
		// Simple Alart 
		WebElement Simple= driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		Simple.click();
		
		driver.switchTo().alert().accept();
		
		// Confirm Alart
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirm.click();
		
		driver.switchTo().alert().dismiss();
		
		
		//prompe
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		prompt.click();
		
		
		driver.switchTo().alert().sendKeys("Smith");
		
		driver.switchTo().alert().accept();
		prompt.getText();
		
		System.out.println("alart handled");
		
		
		
		
		

		
		
		
		
		
		
	
	
	
	
	}
}
