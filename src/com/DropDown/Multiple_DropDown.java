package com.DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse\\Selenium_12PM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		
		
		WebElement multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
		
		Select s = new Select(multiple);
		
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		if (s.isMultiple()==true) {
			
		
		s.selectByVisibleText("Ant-Man");
		s.selectByValue("bw");
		s.selectByIndex(6);
		
		}else {
			System.out.println(" is Not Multiple DropDown");
		}
		//---> getOptions  --> using For Each loop
		List<WebElement> options = s.getOptions();
	
		for(WebElement w :options) {
			System.out.println(w.getText());
			
		}
		
		
		
		System.out.println("Iterator using in Getoptions ");
		List<WebElement> options2 = s.getOptions();
		
		Iterator<WebElement> iterator = options2.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next().getText());
			
		}
		
		
		System.out.println("*******Iterator using in GetALLSelectedoptions ****** ");
		
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		Iterator<WebElement> iterator2 = allSelectedOptions.iterator();
		
		
		while (iterator2.hasNext()) {
			
			System.out.println(iterator2.next().getText());
			
		}
		
		
		System.out.println("****firstSelectedOption****");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		
		
	s.deselectByVisibleText("Ant-Man");
	
		
	
	
	
	
	}

}
