package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//2.3
public class BrowserUtil {
	
	public WebDriver driver;
	/**
	 * This method is used to launch the browser on the basis of given browser name 
	 * @param browser
	 * @return
	 */
	
	
	public WebDriver launchBrowser(String browser) {
		
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
		
			return driver;
		}
		return driver;
	
	} 
	
	/**
	 * this method is used to enter url
	 * @param url
	 */
	
	public void enterUrl(String url) {
		if(url==null) {
			System.out.println("url is  null...");
			return;//blank return it will not return anything
		}
		if(url.indexOf("http")==-1) {
			System.out.println("http is missing in url");
			return;
		}
		driver.get(url);
		
	}
	/**
	 * this method will return current page url
	 * @return
	 */
	public String getAppCurrenturl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getCurrentUrl();
	}  
	
    public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	

}
