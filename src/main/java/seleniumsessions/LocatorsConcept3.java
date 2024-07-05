package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept3 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Formula for automate any scenario
				//create a web-element + perform action (click, sendkeys, gettext, isDisplayed....)
				
				    
					//create a web-element : need a locator
					driver = new ChromeDriver();
					driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
					
					 //By cssselector - not an attribute
					//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
					//driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
					//driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
					
					//hw -- need to implement the rest of the thing same as xpath method creation
					
					//By linktext -- only for links --->>html tag - anchor tag that is a
					//driver.findElement(By.linkText("Register")).click();
					//By registerLink = By.linkText("Register");
					//doClick(registerLink);
					
					//By partiallinktext
					//driver.findElement(By.partialLinkText("Forgotten")).click();
					
					//By tagname
					//String text = driver.findElement(By.tagName("h2")).getText();
				    //System.out.println(text);
					
					//getText: links, headers, footers, paragraph, 
					//sendKeys: button, checkboxes, radiobutton, images, links
					//sendkeys : textbox/textfield, dropdown, fieluploads
					
					//fetch the text of recurring payment
					By payment = By.linkText("Recurring payments");
					String text2 = doElementGetText(payment);
					System.out.println(text2);
					
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	//generic method for get text
	public static String doElementGetText(By locator)
	{
		return getElement(locator).getText();
	}


}
