package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {

		// key
		System.setProperty("webdriver.chrome.driver",
				// --> value--> path
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/drop.html");

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(drag, drop).build().perform();

		System.out.println("Dropped");
	}
}
