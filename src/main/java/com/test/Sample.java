package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static WebDriver driver;
	
	public static WebDriver launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String Url = driver.getCurrentUrl();
		
		System.out.println(Url);
		
		return driver;
	}
	
	public static void doClick(By locator) {
		driver.findElement(locator).click();
	}
	public static void doSendKeys(By locator,String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
