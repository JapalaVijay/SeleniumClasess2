package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {
//2.1 class
	public static void main(String[] args) {
		
		//System.setProperties("webdriver.gecko.driver","D:\Selinium\Serverfiles\geckodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();// open the browser		//Through this we can open the browser
		
		//WebDriver is a interface
		//driver is a reference variable
		//new FirefoxDriver(); is object
		//FirefoxDriver(); is a class
		//Eclipse will not directly connected to the web applications
		
		driver.get("https://www.google.com");//2.enter the url
		
		String title = driver.getTitle();//3.get the page title
		System.out.println(title);	
		
		//4.validation point:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		driver.close();//close the browser
		
		System.out.println(driver.getTitle());//quit=Session ID is null. Using WebDriver after calling quit()?
		                                      //close = session id is invalid or expired
		
		
		
		
		
		
	}

}
