package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//8.3
public class VerifyElement {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		
		By formFields = By.className("text");
		int fieldsCount = driver.findElements(formFields).size();
		if (fieldsCount ==0){
			System.out.println("form fields are not available");
		}	
		else {
			System.out.println("form fields are available");	
			}
		
		//to verify the single element
		By contactSalesLink =By.linkText("CONTACT SALES");
		//driver.findElement(contactSalesLink).click();
		boolean flag = driver.findElement(contactSalesLink).isDisplayed();
		System.out.println(flag);
		
		if (driver.findElements(contactSalesLink).size() >=1) {
			System.out.println("contact sales link is present on the page");
		}
		
		System.out.println(isElementExist(contactSalesLink));
		
	}
	
	public static boolean isElementExist(By locator) {
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elemnts found  " + elementCount);
		if (elementCount >=1) {
			System.out.println("total elemnts found  " + locator);
			return true;	
		}
		else {
			System.out.println("element is not found..." + locator);
			return false;
		}	
	}
	
	
	
	
	
	
		
}	


