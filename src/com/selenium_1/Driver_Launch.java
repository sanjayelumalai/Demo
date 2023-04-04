package com.selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Launch {

	public static void main(String[] args) {
		
		                   // key
		System.setProperty("webdriver.chrome.driver",
				//--> value--> path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");
		
		
		// Webdriver Object
		
		// Interface           //class          ---> upcasting
		WebDriver driver = new ChromeDriver();
		// parent               child          --->  
		
		driver.manage().window().maximize();
		
		
		// Navigate Methods
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("12354");
		
//		
//		
//		driver.navigate().back();
//		
//		driver.navigate().refresh();
//		
//		driver.navigate().forward();
//		
//		
//		
//		// Webdriver Methods
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl+"(URL)");
//		
//		
//		
//		String title = driver.getTitle();
//		System.out.println(title+"(TITLE)");
//		
//		
//		
//		
//		
//		
//		
//	
//		
//		
//		System.out.println();
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
