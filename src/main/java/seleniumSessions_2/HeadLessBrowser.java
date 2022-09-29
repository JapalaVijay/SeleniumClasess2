package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//4.2
public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//headless:
		//no browser launch(not visible)/hidden browser
		//testing is happening behind the scene
		//faster 
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();//ChromeOptions is a class
		co.addArguments("--headless");// Through this we can run program in backend
		co.addArguments("--incogntio");
		
		
		WebDriver driver = new ChromeDriver(co);
		
    //**************************************
//		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		
		//WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
		

	}

}
