package seleniumSessions_2;
//2.4
public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		
		br.launchBrowser("chrome");
		br.enterUrl("http://www.amazon.com");
		String title =br.getPageTitle();
		System.out.println(title);
		
		if(title.contains("Amazon")) {
			System.out.println("Correct title");
		}
		
		String url = br.getAppCurrenturl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		br.closeBrowser();

	}

}
