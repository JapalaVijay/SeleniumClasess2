package seleniumSessions_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//7.2
public class FindElementsConcept {
	
	static WebDriver driver;
	
	//you have to get the count of all the links/images on the page
	//then print the text of each link on the console
	//avoid blank text 		
	//html tag of links is <a>

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		
		 //List<WebElement> linklist = driver.findElements(By.tagName("a"));//through the tag name "a" is the links tag name in html 
		 //empty links also we did get 
		 
		By images = By.tagName("a");
		List <WebElement> linkList =getElements(images);
		
		
		
		 System.out.println("total links: "+linkList.size());
		 
		 //With for loop 
//		 for(int i=0; i<linklist.size();i++) {
//			 String text = linklist.get(i).getText();
//			 if(!text.isEmpty()) {
//				 System.out.println(text);
//			 }
		 //through this if condition we remove empty blank in links
		
			 
			 
		//with for each loop
		for(WebElement e:linkList) {
			String text =e.getText();
			if(!text.isEmpty()) {
				 System.out.println(text);
		    }
						 
		 }
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
