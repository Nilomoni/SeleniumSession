package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
//		String placeholderValue = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(placeholderValue);
//		
//		String imgsrc = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String imgTitle = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(imgsrc + "---->>" + imgTitle);
		
		By fn = By.name("firstname");
		By logo = By.className("img-responsive");
		
		String placeholderValue = getelementAttribute(fn , "placeholder");
		String srcValue = getelementAttribute(logo , "src");
		String titleValue = getelementAttribute(logo , "title");
		
		System.out.println(placeholderValue);
		System.out.println(srcValue);
		System.out.println(titleValue);

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static String getelementAttribute(By locator , String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}

}
