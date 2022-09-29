package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]")).click();
//		driver.findElement(By.name("field-keywords")).sendKeys("moto G 60");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).click();
		driver.findElement(By.name("search_query")).sendKeys("Oh Sita Hey Rama Video Song - Sita Ramam (Telugu) | Dulquer | Vishal | Hanu Raghavapudi by Sony Music South 12 days ago 3 minutes, 46 seconds 8,156,829 views");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
//		driver.get("https://classic.freecrm.com/register/");
//		driver.findElement(By.id("editionText")).isDisplayed();
//		boolean flag = driver.findElement(By.id("editionText")).isDisplayed();
//		System.out.println(flag);
		
		//driver.findElement(By.className("style-scope ytd-rich-grid-media")).click();
		
		
		
		
		
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("moto g 60");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]")).sendKeys("Moto G 60");
//		driver.findElement(By.id("id=\"twotabsearchtextbox\"")).sendKeys("Moto G 60");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
//		Sample br = new Sample();
//		br.launchbrowser();
//		
//		br.driver.findElement(By.xpath(//*[@id="nav-search-bar-form"]))	
		
		//br.doClick(//*[@id="twotabsearchtextbox"]);
				
		//br.doClick(By.xpath(//*[@id="twotabsearchtextbox"]);
		//br.doSendKeys(By.id("twotabsearchtextbox"), "Moto G60");
		//br.doSendKeys("twotabsearchtextbox","Moto G60");
		
			
		
		
								
		

	}

}
