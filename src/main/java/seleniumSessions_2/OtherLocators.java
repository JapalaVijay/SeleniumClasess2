package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//6.1
public class OtherLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		
		//1. id:(it's a unique attribute)-- I
		
		
		//2. name: --II
		
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		
//		By emailId = By.name("username");
     	ElementUtil elutil = new ElementUtil(driver);
//		elutil.doSendKeys(emailId, "naveen@gmail.com");
		
		//3.className:--III
		//its not unique.
		//we can have same class name for different elements
		//driver.findElement(By.className("form-control")).sendKeys("vijay");
		
		//4.xpath: its not an attribute
		//it is address of the element inside the HTML DOM
		//we have to use attributes to create xpath
		
		//*[@id="loginForm"]/div/input[1]-- relative xpath
		// /html/body/div[2]/div/div[3]/form/div/input[1] -- absolute xpath
		//we will never use absolute xpath
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[1]")).sendKeys("test@123");;
		
//		By emailId = By.xpath("//*[@id=\"loginForm\"]/div/input[1]");
//		elutil.doSendKeys(emailId, "test@gmail.com");
		
		//5.css selector:its not an attribute
		//We have to use attributes to create the css selector
		//driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("test@gmail.com");
		
		//6.linktext: only for links, but its not an attribute
		//text of the link
		//html tag = a
		//driver.findElement(By.linkText("\"https://classic.freecrm.com/customers.html\"")).click();
		
		//By registerLink = By.linkText("Register");
		//doClick(registerLink);
		
//		String register = "Register";
//		elutil.doClick("linktext", register);
		
		//7.partialLinkText :only for links, but its not an attribute
		//partial text of the link
		//html tag = a
		//when links will big then we select some words in that link
		//driver.findElement(By.partialLinkText("policy")).click();
		// this is app privacy policy 
		//privacy policy
		//user policy
		
		//8.tagName:
		//h1 is header in one webpage
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		if (header.contains("Love your software")) {
//			System.out.println("h1 header is correct");
//		}
     	
     	By header = By.tagName("h1");
     	if(doGetText(header).contains("Delight made easy")) {
     		System.out.println("h1 header is correct");
     	}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	} 
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	
}
