package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.driver.chromedriver", " ");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.get(" ");
		
		List<WebElement> links = driver.findElements(By.linkText(""));
		
		WebElement id =  driver.findElement(By.id(""));
		
		
		
		

	}

}
