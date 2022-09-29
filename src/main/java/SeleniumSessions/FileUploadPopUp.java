package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//3.2
public class FileUploadPopUp {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.filemail.com/share/upload-file");
		
		driver.findElement(By.id("addBtn")).sendKeys("c://");
		//type="file"
		
		
		
		
		
		
		

	}

}
