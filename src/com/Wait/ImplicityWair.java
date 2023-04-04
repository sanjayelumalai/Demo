package com.Wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityWair {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	
	

	

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://letcode.in/signin");

	driver.findElement(By.name("email")).sendKeys("Sanjaykumar@123");

	driver.findElement(By.name("password")).sendKeys("1234556");

	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
    
	// Excepted Wait
	WebElement toast = driver.findElement(By.xpath("//div[@id='toast-container']"));
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(toast));
	System.out.println(toast.getText());
	wait.until(ExpectedConditions.invisibilityOf(toast));

	driver.findElement(By.xpath("(//a[text()='Sign up'])[1]")).click();
}

}
