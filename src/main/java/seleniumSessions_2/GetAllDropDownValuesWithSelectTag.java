package seleniumSessions_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//9.2
public class GetAllDropDownValuesWithSelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//drop down -- html tag --> select
		//Select class in selenium
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");	
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(country);
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size());
		if (countryList.size()-1 == 231) {
			System.out.println("country count is crct");
		}
		
		int count = 0;//for printing index no also 
		for(WebElement e : countryList) {
			String text = e.getText();
			System.out.println(count+"::"+text);
			count++;
		}
		
//		for (int i=0; i<countryList.size();i++){
//			String text = countryList.get(i).getText();
//			System.out.println(i+"::"+ text);
//		}
		
		
		
		
		
		
	}

}
