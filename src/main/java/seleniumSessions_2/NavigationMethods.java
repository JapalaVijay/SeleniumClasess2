package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//4.1
public class NavigationMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//driver.get and driver .navigate.to both are same in navigate method internally calling to get menthod only
		//we go back from page to page by using navigate.to.back(); method only. 
		//With navigate we can refresh the page
		//with navigate we can do backward , forward, refresh and go to url

	}

}
