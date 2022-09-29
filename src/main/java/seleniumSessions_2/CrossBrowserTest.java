package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//2.2
public class CrossBrowserTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String browser = "firefox";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
			driver = new ChromeDriver();//launch chrome
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Selinium\\Serverfiles\\geckodriver.exe");
			driver = new FirefoxDriver();//launch chrome	
		}
		
		else {
			System.out.println("Please pass the right browser......"+ browser);
		}
		
        driver.get("https://www.google.com");//2.enter the url
		
		String title = driver.getTitle();//3.get the page title
		System.out.println("Page title is: "+title);
		
		//4.validation point/checkpoint:(Actuals vs Expectation)
		if(title.equals("Google")) {
			System.out.println("PASS ---- correct title");
		}
		else {
			System.out.println("FAIL ----- in-correct title");
		}
		
		//Automation Steps + Validation point ==> Automation Testing
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(4000);
		
		//driver.quit();//close the browser
		driver.close();//close the browser
		

	}

}
