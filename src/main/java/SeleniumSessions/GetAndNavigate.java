package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//2nd class
public class GetAndNavigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//Through driver.get we can enter in the page and current url will be given after completion of loading only
		//it will wait untill page is loaded or not
		
		driver.navigate().to("https://www.amazon.in/");
		//Through driver.navigate().to() we can enter in the page and current url will get without loading also means it will give immediatley
		//it will not wait
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
