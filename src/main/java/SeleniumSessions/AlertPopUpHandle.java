package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//3rd class
public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//clicking on signup button
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("please enter valid user name")) {
			System.out.println("correct error msg....");
		}
		else {
			System.out.println("in correct error msg...");
		}

		alert.accept();//click on ok button
	
		//alert.dismiss();//cancel the alert
	
	}

}
