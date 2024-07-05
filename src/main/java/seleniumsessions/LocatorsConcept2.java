package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Formula for automate any scenario
		//create a web-element + perform action (click, sendkeys, gettext, isDisplayed....)
		
		    
			//create a web-element : need a locator
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			 //By name
			//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
			//driver.findElement(By.name("password")).sendKeys("test@1234");
			
		    // By emailId = By.name("email");
		   //  By password = By.name("password");
			
			//By classname - can be duplicate most of the time
			//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
			
			//By xpath - it's not an attribute, it's the address of the element in the HTML dom
			//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@test.com");
			//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
			//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
			By emailId = By.xpath("//*[@id=\"input-email\"]");
			By password = By.xpath("//*[@id=\"input-password\"]");
			By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
			
			doSendKeys(emailId, "test@123.com");
			doSendKeys(password, "test@123");
			doClick(loginButton);
			

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}


}
