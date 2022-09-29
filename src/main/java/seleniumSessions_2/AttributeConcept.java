package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//8.1
public class AttributeConcept {
	
		static WebDriver driver;
		
		//you have to get the count of all the links/images on the page
		//then print the text of each link on the console
		//avoid blank text 		
		//html tag of links is <a>

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
//			driver.get("https://www.amazon.com");
//			String hrefval = driver.findElement(By.linkText("Amazon Science")).getAttribute("href");
//			System.out.println(hrefval);
			
			By amazonDevicesLink = By.linkText("Amazon Science");
			String hrefVal = getAttributeValue(amazonDevicesLink,"href");
			if(hrefVal.contains("footer_devices")) {
				System.out.println("this is correct href");
			}
	}

		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static String getAttributeValue(By locator , String attrName) {
			String attrVal = getElement(locator).getAttribute(attrName);
			System.out.println(attrVal);
			return attrVal;
			
		}
		
		
		
}
