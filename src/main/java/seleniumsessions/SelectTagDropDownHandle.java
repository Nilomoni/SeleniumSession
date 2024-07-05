package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//type 1
public class SelectTagDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		//calling the doSelectByIndex method
		//passing parameter value
		doSelectByIndex(country, 5);
		Thread.sleep(2000);
		
		//calling doSelectByVaue method
		doSelectByVaue(country, "India");
		Thread.sleep(2000);
		
		//calling doSelectByVisibleText method
		doSelectByVisibleText(country, "Belgium");
		
		
		//dropdown ---> html tag - <select>
		//use Select class in selenium
		//need to pass the webelement in select class as an arguement which is as per the rule
		//Need to create a web element
		//WebElement country_ele = driver.findElement(country);
		//Select select = new Select(country_ele);
		
		//select.selectByIndex(5);
		//selectByIndex always take int value/index value
		//We can use this when the value is constant like
		//need to select for month,day,week....dropdown
		
		//select.selectByValue("India");
		//selectByValue always take String value
		//it is more appropriate
		
		//select.selectByVisibleText("India");
		//selectByVisibleText always take String value
		//more appropriate than selectByValue
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByVaue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue("India");
	}
	
	public static void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}


}
