package com.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {

	public static void main(String[] args) throws AWTException {

		// key
		System.setProperty("webdriver.chrome.driver",
				// --> value--> path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

		// Actions

		Actions ac = new Actions(driver);

		ac.moveToElement(women).build().perform();

		// right click

		ac.contextClick(women).build().perform();

		// Robot Class

		Robot r = new Robot();
// new tap
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// new Window

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		

//	
//		
//		
		System.out.println("Done");

	}

}
