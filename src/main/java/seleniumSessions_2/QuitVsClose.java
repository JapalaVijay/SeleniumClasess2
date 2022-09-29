package seleniumSessions_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
//3.1.1
	public static void main(String[] args) {
		
		//Session Id
		
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\Serverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.get("https://www.google.com");//2.enter the url
		String title = driver.getTitle();//3.get the page title
		System.out.println("Page title is: "+ title);
		
		driver.close();//Seesion id will be there
		//through this chrome browser will close but session will there but it will expired 
		//After line no 18 next line no 21 new session id will be generated
		
		//driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		
		//System.out.println(driver.getTitle());//NoSuchSessionException: invalid session id
		//Session id will be there but it will expired
		
		driver.quit();//Through this session id will be null
		System.out.println(driver.getTitle());//NoSuchSessionException: session id is null Using WebDriver after calling quit()?
		
		
		
		
		

	}

}
