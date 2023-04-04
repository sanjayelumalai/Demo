package com.Screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {
	
	
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");

	TakesScreenshot  ts = (TakesScreenshot) driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Screen\\face.png");
	
	FileUtils.copyFile(screenshotAs, dest);
	
	
	
	
	
	
	
	System.out.println("Screen Done");
	
	
	
	
	}
}
