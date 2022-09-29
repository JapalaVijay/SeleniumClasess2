package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//8.4
public class WrongLocatorSyntax {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By firstName = By.xpath("//*[@id=\"Form_getForm_FullName\"]");
		
		driver.findElement(firstName).sendKeys("Vijay");
		
		//*[@id=\"Form_getForm_FullName\"] -- Yes
		//*[id=\"Form_getForm_FullName\"] -- No
		//testing -- no if we give xpath is given as "testing"
		//InvalidSelectorException

	}

}
