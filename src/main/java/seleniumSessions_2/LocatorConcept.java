package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//4.3,5.1 & 5.3
public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create the webelement + actions (clicks,sendkeys,gettext,isdiplayed,isenabled)
		
		//1.id  
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@1234");
		
		//2nd
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("test@gmail.com");
		//password.sendKeys("test@123");
		//logout
		//emailId.sendKeys("naveen@gmail.com");
		
		//3rd: By locator
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		
//		emailId.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");	
		
		
		//4th: By locator with generic method
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(username).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5th By locator with generic method (getElement () with action methods)
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		doSendKeys(username,"test@gmail.com");
//		doSendKeys(password,"test@123");
		
		//6th: ElementUtil class with generic methods 
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(username,"test@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		//7th: String locator values:
		String userNameId = "input-email";
		String passwordId = "input-password";
		
		doSendKeys("id", userNameId,"naveen@gmail.com");
		doSendKeys("id", passwordId,"naveen@123");
		
		
		
		
	}
	
	public static By getBy(String locatorType,String locatorValue) {
		By locator = null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			 locator = By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator type and value");
			break;
		}
		
		return locator;
	}
	
	//for 7th approach
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	////for 6th approach
    public static WebElement getElement(String locatorType, String locatorValue) {
		
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
    //for 6th approach
	public static void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	//for 7th approach
    public static void doSendKeys(String locatorType , String locatorValue, String value) {
		
		getElement(locatorType, locatorValue).sendKeys(value);
	}
	
	

}
