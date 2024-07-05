package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//maximize is for just to maximize the screen
		driver.manage().window().maximize();
		
		//Fullscreen is for fit the browser with compare to the screen
		//driver.manage().window().fullscreen();
		
		//this method will clear all the cookies/session id/reset the browser
		//driver.manage().deleteAllCookies();
		
		//to ctach the current url if we need to access different website in same browser
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.google.co.in/"))
		{
			System.out.println("Test is passed");
		}
		
		else
		{
			System.out.println("Check the url");
		}
		
		//get the source of the current page source
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		//
		driver.quit();
		
		//
		driver.close();

	}

}
