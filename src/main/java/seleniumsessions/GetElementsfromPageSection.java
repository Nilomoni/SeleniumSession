package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsfromPageSection {
	
	static WebDriver driver;
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
		
	}
	
	public static List<String> getElementsTextList(By locator)
	{
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> menuLinks = getElements(locator);
		for(WebElement e :menuLinks)
		{
			String text = e.getText();
			eleTextList.add(text);
		}
		
		return eleTextList;
	}
	
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*
		 * List<WebElement> menuLinks =
		 * driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		 * System.out.println(menuLinks.size());
		 * 
		 * //capturing the link text using for loop for(WebElement e :menuLinks) {
		 * String text = e.getText(); System.out.println(text); }
		 */
		
		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
		 // By rightPanelLinks = By.xpath("//footer//a");
		
		
		List <String> eleList = getElementsTextList(rightPanelLinks);
		System.out.println(eleList);
		System.out.println("---------------------");
		if(eleList.contains("Login"))
		{
			System.out.println("Passed");
		}

	}
	


}
