package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	public static void main(String[] args) {
		
		//Formula for automate any scenario
		//create a web-element + perform action (click, sendkeys, gettext, isDisplayed....)
		
		//1. create a web-element : need a locator
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id locator
		//id is static method as using by method by the class name
		
		//1st approach of writing the code
		//driver.findElement(By.id("input-email")).sendKeys("nilomoni@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Test@1234");
		
		//2nd approach of writing the code
		
		//as findelement return webelement, so we can store it inside webelement reference variable name as email or password
		
		//WebElement email = driver.findElement(By.id("input-email"));
	   //WebElement password = driver.findElement(By.id("input-password"));
		
		//email.sendKeys("nilomoni@gmail.com");
		//password.sendKeys("Test@1234");
		
		//3rd Approach
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		
		//driver.findElement(emailId).sendKeys("nilomoni@gmail.com");
		//driver.findElement(password).sendKeys("Test@1234");
		
		//4th Approach - by calling the method
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		//getElement(emailId).sendKeys("nilomoni@gmail.com");
		//getElement(password).sendKeys("Test@1234");
		
		//5th Approach - Bylocator + generic method for webelement and actions
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		//doSendKeys(emailId, "nilomoni@test.com");
		//doSendKeys(password, "Test@123");
		
		//6th approach - Bylocator + generic method for webelement and actions in a Elementutil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(emailId, "nilomoni@gmail.com");
		eutil.doSendKeys(password, "Test@123");

	}
	
	//4th approach - By creating a generic method
	//Need to declare the WebDriver at class level as
	//we creatre a separate method for findelement and
	//if we do not declare the webdriver at class leevel then we'll not be able to access all the method
	//as the driver is non-static, that's why we declare it as static
	static WebDriver driver;
	//this static driver should be written at before of main method as a global/class variable
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		//as driver.findelement always return a webelement that's why the method return type is WebElement
		
	}
	
	//5th approach
	//create a web-element + perform action (click, sendkeys, gettext, isDisplayed....)
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}

}
