package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//2.1
public class NavigationConcept {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
		//Through this line one server will be created 
		
		WebDriver driver = new ChromeDriver();// open the browser		//Through this we can open the browser
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

		
	}

}
