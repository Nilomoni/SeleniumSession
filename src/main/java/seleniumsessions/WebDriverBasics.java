package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		WebDriver driver = null;
		if(browser.equals("Chrome"))
		{
			//This will pointing to the browser
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please pass the right browser..." +browser);
		}

		// 1. Open the browser
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		

		// 2. Enter url
		driver.get("https://www.google.com");

		// 3. Get the title of the page
		// getTitle return type is string, that's why need to store it in string
		String actTitle = driver.getTitle();
		System.out.println("page title : " + actTitle);

		// 4. validaion point/checkpoint
		if (actTitle.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 5. Quit Driver
		driver.quit();


	}

}
