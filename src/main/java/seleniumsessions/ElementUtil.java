package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	//Private as currently the driver is pointing to null and
	//if we make it public and if anyone start using it then they can get null reference exception
	
	//const...
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
			
	}
	
	public void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	//we don't need static keyword in elementutil class
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public String doElementGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public String getelementAttribute(By locator , String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
	
	
	public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
		
	}
	
	
	public void getElementAttributes(By locator, String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList)
		{
			String attrval = e.getAttribute(attrName);
			System.out.println(attrval);
		}
	}
	
	public int getTotalElementsCount(By locator)
	{
		int eleCount = getElements(locator).size();
		System.out.println("total links: " +eleCount );
		return eleCount;
	}
	
	public List<String> getElementsTextList(By locator)
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
	
	//************************** select based dropdown utility method type 1
	
	public void doSelectByIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByVaue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue("India");
	}
	
	public void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	//************select based dropdown utility method type 2
	

	
	public List<WebElement> getDropDownOptionsList(By locator)
	{
		Select select = new Select(driver.findElement(locator));
		return select.getOptions();
	}
	
	//for capturing all the text in the dropdown
	public List<String> getDropDownOptionsTextList(By locator)
	{
		List <WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionTextList = new ArrayList <String>();
		for (WebElement e : optionsList)
		{
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}
	
	//for getting the total countr list count
	public int totalDropDownOption(By locator)
	
	{
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("Total options ==>>" +optionsCount);
		return optionsCount;
	}
	
	//select and click the value from the dropdown
	public void selectDropDownValue(By locator, String expValue)
	{
		//fetch all the values one by one in the optionsList
		List <WebElement> optionsList = getDropDownOptionsList(locator);
		
		//iterate the values
		for(WebElement e : optionsList)
		{
			//Capture the text of each and every option after iteration
			String text = e.getText();
			System.out.println(text);
			
			//keep comparing what are we looking for
			if(text.equals(expValue))
			{
				e.click();
				break;
			}
		}
	}
	
	//for printing the search result in google
	public void doSearch(By suggListLocator , String suggName)
	{
		List <WebElement> suggList = driver.findElements(suggListLocator);
		System.out.println(suggList.size());
		
		for(WebElement e : suggList)
		{
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains(suggName))
				e.click();
			break;
		}
	}

	


}
