package seleniumSessions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//5.3
public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver  = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Sharma");
		eleUtil.doSendKeys(lastName, "Rao");
		eleUtil.doSendKeys(email, "Sharma125@gmail.com");
		
		Thread.sleep(4000);
		
		brUtil.closeBrowser();
		
		

	}

}
