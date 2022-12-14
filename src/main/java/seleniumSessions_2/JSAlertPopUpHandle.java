package seleniumSessions_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//8.5
public class JSAlertPopUpHandle {

	public static void main(String[] args) throws Exception {
		//alert
		//confirmation pop up
		//warning/error pop up
		//submission pop up
		//modal dialog
		//JS pop up
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("please enter a valid user name")) {
			 System.out.println("correct validation mesg");
		}
		
		alert.accept();//click on ok button
		//alert.dismiss();//press esc/click on cancel/dismiss the alert
		
		
	
	}

}
