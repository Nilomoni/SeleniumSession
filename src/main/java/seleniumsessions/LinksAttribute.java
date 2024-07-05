package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.findElements(By.tagName("a"));
		
		By links = By.tagName("a");
		By img = By.tagName("img");
		
		List<WebElement> linksList = getElements(links);
		//Storing all the links
		System.out.println("Total Links ====>" +linksList.size());
		
		System.out.println("------------------------------------");
		
		//traversing
		for(WebElement e : linksList)
		{
			String hrefval = e.getAttribute("href");
			String linktext = e.getText();
			System.out.println(hrefval + " ----> " + linktext );
		}
		

	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
		
	}
	

}
