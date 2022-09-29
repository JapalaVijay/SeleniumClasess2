package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/products/crm&hubs_signup-cta=homepage-nav-login");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("username")).sendKeys("test@g.com");
		driver.findElement(By.id("password")).sendKeys("test@g.com");
		driver.findElement(By.id("lginBtn")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("private"));
		

	}

}
