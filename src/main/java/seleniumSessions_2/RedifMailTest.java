package seleniumSessions_2;

public class RedifMailTest {
//2.5
	public static void main(String[] args) throws InterruptedException {
		

		BrowserUtil br = new BrowserUtil();
		
		br.launchBrowser("chrome");
		br.enterUrl("http://www.rediffmail.com");
		String title =br.getPageTitle();
		System.out.println(title);
		
		if(title.contains("rediff")) {
			System.out.println("Correct title");
		}
		
		String url = br.getAppCurrenturl();
		System.out.println(url);
		
		//Thread.sleep(3000);
		
		br.closeBrowser();


	}

}
