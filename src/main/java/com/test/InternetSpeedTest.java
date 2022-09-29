package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetSpeedTest extends Sample{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=internet+speed+test&rlz=1C1PNBB_enIN1000IN1001&sxsrf=ALiCzsby1tpHDPWwbQnAuyAZAWxobk_ZVQ%3A1664168609173&ei=oTIxY-qQCpOdseMPmpueyAw&ved=0ahUKEwiq5a6W17H6AhWTTmwGHZqNB8kQ4dUDCA4&uact=5&oq=internet+speed+test&gs_lp=Egdnd3Mtd2l6uAEDMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgoQABhHGNYEGLADMgcQABiwAxhDMgcQABiwAxhDkAYKSLMLUABYAHABeAHIAQCQAQCYAQCgAQCqAQDiAwQgQRgA4gMEIEYYAIgGAQ&sclient=gws-wiz");
		
		Thread.sleep(3000);
		driver.findElement(By.className("fSXkBc")).click();
		

		

	}

	

}
