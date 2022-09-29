package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://www.youtube.com/watch?v=LyN4Ttgc6X0");
		
		Thread.sleep(8000);
		driver.findElement(By.className("ytp-ad-skip-button-icon")).click();
		                                 //ytp-ad-skip-button-icon 	     
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[2]/div[2]/div/div/ytd-menu-renderer/yt-icon-button/button/yt-icon")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-menu-popup-renderer/tp-yt-paper-listbox/ytd-menu-service-item-renderer/tp-yt-paper-item/yt-formatted-string")).click();
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.className("style-scope ytd-menu-renderer")).click();
		
		
		String Words = driver.findElement(By.className("ytp-caption-segment")).getText();
		
		System.out.println(Words);
		
		
		
		
	}

}
