package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	// initialize the driver
	// mark it as private, as if no one can access it, as it's default value is null
	// So anyone can get nullreference exception
	private WebDriver driver;

	// On create utility class, we have to give the documentation /** and then press
	// enter

	/**
	 * This method is use to initialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return This return the specific browser name
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is :" + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
		
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url cannot be empty");

		}

		// as need to count it from 0th position
		// it'll check if at 0th position there is https or not
		if (url.indexOf("https") == 0) {
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		}
	}

	public String getPageTitle() {
		String title = driver.getTitle().toLowerCase();
		System.out.println("Page title is :" + title);
		return title;
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("The url is :" + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}

	}

}
