package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplay {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
//		boolean b = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if(b==true)
//		{
//			System.out.println("Image is present");
//		}
//		else
//		{
//			System.out.println("Please check the image");
//		}
//		
//		boolean search = driver.findElement(By.name("search")).isDisplayed();
//		if(search==true)
//		{
//			System.out.println("Searchbox is displayed");
//			driver.findElement(By.name("search")).sendKeys("macBook");
//		}
//		else
//		{
//			System.out.println("Searchbox is not displayed");
//		}
		
		By logo = By.className("img-responsive");
		By search = By.name("search");
		By searchButton = By.xpath("//*[@id=\"search\"]/span/button");
		
		if(doElementisDisplayed(logo))
		{
			System.out.println("Image is displayed");
		}
		
		if(doElementisDisplayed(search))
		{
			System.out.println("SearchBox is displayed");
			doSendkeys(search, "macBook");
			doClick(searchButton);
			System.out.println("Results are getting displayed as oer the search text");
		}

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static boolean doElementisDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendkeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

}
