package seleniumsessions;

public class GoogleTestwthBrowserUtil {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
		brutil.initDriver("edge");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String actTitle = brutil.getPageTitle();
		if(actTitle.contains("google"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		String URL = brutil.getPageUrl();
		if(URL.contains("https://naveenautomationlabs.com/opencart/index.php?route=account/register"))
		{
			System.out.println("URL is matched");
		}
		else
		{
			System.out.println("Enter the correct url");
		}
		
		brutil.quitBrowser();

	}

}
