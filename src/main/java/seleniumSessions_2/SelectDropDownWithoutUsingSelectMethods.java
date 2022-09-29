package seleniumSessions_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//9.3
public class SelectDropDownWithoutUsingSelectMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(country);
		
		List<WebElement> countryList = select.getOptions();
		
		for(WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
	
		
	}
	
	
	
	

}
