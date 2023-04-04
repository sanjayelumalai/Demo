package com.Max;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	
	
	
public static void main(String[] args) throws IOException {
		
		                 // Key
		System.setProperty("webdriver.chrome.driver",
		//Value ---> Path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_10Am_Mar\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("!#&!*$&^");
		
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345676879");
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		
		boolean selected = login.isSelected();
		System.out.println(selected);
		
		
		String text = login.getText();
		System.out.println(text);
		
		String attribute = login.getAttribute("data-testid");
		System.out.println(attribute);
		
		login.click();
		

		
		System.out.println("**** Done ***");
		
		
		
		

}
}