package com.Windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handle {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		Actions ac = new Actions(driver);

		driver.get("http://automationpractice.com/index.php");

		WebElement women = driver.findElement(By.xpath("//div[6]/ul/li/a"));

		String text = women.getText();
		System.out.println(text);

//		Actions ac= new Actions(driver);

		ac.moveToElement(women).build().perform();

		ac.contextClick(women).build().perform();

//		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

		String text2 = dress.getText();
		System.out.println(text2);

		ac.moveToElement(dress).build().perform();

		ac.contextClick(dress).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));

		String text3 = tshirts.getText();
		System.out.println(text3);

		ac.moveToElement(tshirts).build().perform();

		ac.contextClick(tshirts).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle(); // parent window

		Set<String> windows = driver.getWindowHandles();
//		
//		
//		for(String s : windowHandles) {
//			
//			String title = driver.switchTo().window(s).getTitle();
//			System.out.println(title);
//			
//			
//		}

		String s = "Dresses - My Store";

		for (String s1 : windows) {

			if (driver.switchTo().window(s1).getTitle().equals(s)) {

				break;

			}
		}

		System.out.println("DONE");

	}
}
