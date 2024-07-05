package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageAttributeConcept {

	static WebDriver driver;
	
	
	public static void getElementAttributes(By locator, String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList)
		{
			String attrval = e.getAttribute(attrName);
			System.out.println(attrval);
		}
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
		
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.findElements(By.tagName("a"));
		
		By links = By.tagName("a");
		By img = By.tagName("img");
		
          //to get all the images		
//		List<WebElement> imageList =getElements(img);
//		System.out.println("total images:" + imageList.size());
//		
		//traversing
//		for(WebElement e : imageList)
//		{
//			String srcval = e.getAttribute("src");
//			System.out.println(srcval);
//		}
		
		getElementAttributes(img, "src");
		getElementAttributes(links, "href");

	}
	
	
	

}
