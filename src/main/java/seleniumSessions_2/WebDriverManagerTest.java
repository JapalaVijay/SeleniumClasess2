package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//3.2
public class WebDriverManagerTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.get("https://www.google.com");//2.enter the url
		String title = driver.getTitle();//3.get the page title
		System.out.println("Page title is: "+ title);
		
		//4.validation point:
				if(title.equals("Google")) {
					System.out.println("correct title");
				}
				else {
					System.out.println("in-correct title");
				}
				//Automation Steps + validation point
				System.out.println(driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
				
				//driver.quit();//close the browser
				driver.close();//close the browser
				
				//System.out.println(driver.getTitle());//quit=Session ID is null. Using WebDriver after calling quit()?
				                                      //close = session id is invalid or expired

		

	}

}
