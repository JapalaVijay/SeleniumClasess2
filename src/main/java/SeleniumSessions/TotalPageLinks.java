package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//4.0th class
public class TotalPageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total No Of Links : "+ linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
			
			
			
		}

	}

}
