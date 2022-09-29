package seleniumSessions_2;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//3.1
public class WebDriverCastings {

    
	public static void main(String[] args) {
		
		//TopCasting in selenium
		
		//1.WD - CD
		//WebDriver driver = new ChromeDriver();
		//driver.
		
		//2.ChromeDriver driver = new ChromeDriver();
		
		//3.RemoteWebDriver - ChromeDriver
		//RemoteWebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new SafariDriver();
		
		//4.WD - RWD = remote machine means server/cloud/vm/docker/cloud vendor
		//We will use in remote machines time
		//WebDriver driver = new RemoteWebDriver(new URL("192.45.1.10:45266"), capabilities);
		
		//5.Search Contexts - ChromeDriver:
		//SearchContext driver = new ChromeDriver();
		
		//6.SC - RWD
		//SearchContext driver = new RemoteWebDriver(new URL("192.45.1.10:45266"), capabilities);
		
		
		
	}

}
