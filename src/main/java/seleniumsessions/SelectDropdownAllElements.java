package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//type 2
public class SelectDropdownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		//without using SelectTagDropDownHandle class method how to select a value from dropdown
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		
		
//		Select select = new Select(driver.findElement(country));
//		
//		//getOptions method will capture all the values available under dropdown which are in select class
//		List <WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size());
//		
//		//iterate the list
//		//comparing if text = argentina select argentina and break the loop
//		for(WebElement e:countryList)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Argentina"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		By country = By.id("Form_getForm_Country");
		//calling totalDropDownOption method
		if(totalDropDownOption(country)==233)
		{
			System.out.println("Country drop down count is correct");
		}
		
		if(getDropDownOptionsTextList(country).contains("India"))
		{
			System.out.println("Country is present in the list");
		}
		
		List <String> extractedCountryList = Arrays.asList("India" , "Brazil", "Argentina");
		if(getDropDownOptionsTextList(country).containsAll(extractedCountryList))
		{
			System.out.println("Pass");
		}
		
		//Calling selectDropDownValue method to select value and click the country
		selectDropDownValue(country, "North Korea");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator)
	{
		Select select = new Select(driver.findElement(locator));
		return select.getOptions();
	}
	
	//for capturing all the text in the dropdown
	public static List<String> getDropDownOptionsTextList(By locator)
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
	public static int totalDropDownOption(By locator)
	
	{
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("Total options ==>>" +optionsCount);
		return optionsCount;
	}
	
	//select and click the value from the dropdown
	public static void selectDropDownValue(By locator, String expValue)
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

}
