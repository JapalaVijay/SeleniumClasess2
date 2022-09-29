package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();	
		
		
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");//set driver configuration 
		
		//TopCasting
		//Parent interface reference var  =  child class Object
		
	// driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	    driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.quit();
		
		driver.getTitle();

		////Thread.sleep(3000);
		
		//////driver.navigate().to("https://www.amazon.com/");

		
	}

}
