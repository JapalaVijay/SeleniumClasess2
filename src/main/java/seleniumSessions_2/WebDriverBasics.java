package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1st class
public class WebDriverBasics {

	public static void main(String[] args) {
		
		//WebDriver is the Interface it means it have some methods it should be there in all classes like chrome,IE,firefox
		//Topcasting
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
		//Through this line one server will be created 
		
		
		WebDriver driver = new ChromeDriver();// open the browser		//Through this we can open the browser
		
		//WebDriver is a interface
		//driver is a reference variable
		//new ChromeDriver(); is object
		//ChromeDriver(); is a class
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
