package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.2
public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		
		Thread.sleep(5000);
		
//		//1. id: --I priority unique 
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("naveenanimation20@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("Test@12345");
//		
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@1234");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2.name locator: --II priority
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3.xpath: --III priority,dynamic ids
		
//		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("test@1234");
//		driver.findElement(By.id("loginBtn")).click();
		
		//4.CSS locator: -- III priority
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");	
		
		//5.class Name:-- IV priority
		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("test@1234");
		
		
//		form-control private-form__control form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
//		
		//6.link text : only used for links
		//to identify tha is link or not it will start with <a> will be there in html it is link
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7.partial link text
		
		//8.Tagname
		//driver.findElement(By.tagName(tagName));
		
		//Sign up
		//sign in
		//in the above if we give sign then it will confuse which link has to click
		driver.findElement(By.partialLinkText("Sign")).click();
		// If we have long link texts then we will prefer partial link text
		
		
		
		
		

	}

}
