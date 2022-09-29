package seleniumSessions_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//8.2
public class NoSuchElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		//Correct element
//		WebElement firstName = driver.findElement(By.id("Form_getForm_FullName"));
//		firstName.sendKeys("vijay");
		
		//If locator value as wrong the we get NoSuchElementException 
//		WebElement firstName = driver.findElement(By.id("Form_getForm_FullName"));
//		firstName.sendKeys("vijay");
		
		//Correct element
//		List<WebElement> list = driver.findElements(By.className("text"));
//		System.out.println(list.size());
		
		//Wrong Element
		List<WebElement> list = driver.findElements(By.className("text11"));
		// no exception will be thrown her if element is not found/locator is wrong
		//it will return an empty list
		System.out.println(list.size());//here we get size as 0

	}

}
