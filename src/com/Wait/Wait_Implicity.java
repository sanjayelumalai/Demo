package com.Wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Implicity {
	// https://letcode.in/signin

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		/// implicity Wait;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/signin");

		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		user.sendKeys("Sanjay@1223gmail.com");

		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("Sanjayu!23");

		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		
		//Excepted
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement toast = driver.findElement(By.xpath("//div[@id='toast-container']"));
		
		
		wait.until(ExpectedConditions.visibilityOf(toast));
		
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up']"));
		
		sign.click();
		
		
		System.out.println("DONE");
		

	}
}
