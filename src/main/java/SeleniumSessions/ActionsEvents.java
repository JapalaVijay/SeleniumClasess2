package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.Sample;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents extends Sample{

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement emailid = driver.findElement(By.id("username"));
		
		Actions act = new Actions(driver);
		act.sendKeys(emailid, "Vijay111@gmail.com").build().perform();
		 
		
	}

}
