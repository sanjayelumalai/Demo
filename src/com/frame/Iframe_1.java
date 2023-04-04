package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_1 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement single_frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(single_frame);
		
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("hello");
		
		System.out.println(" Single frame Done");
		
		
		
		driver.switchTo().defaultContent();
		
		WebElement multiple = driver.findElement(By.xpath("(//a[@class= 'analystic'])[2]"));
		multiple.click();
		
		
		WebElement multiple_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		
		driver.switchTo().frame(multiple_frame);
		
		
		WebElement single_frame1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(single_frame1);
		
		WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text1.sendKeys("Multiple Frame");
		
		System.out.println("multiple frame Done");
		
		
		
		

	}
}
