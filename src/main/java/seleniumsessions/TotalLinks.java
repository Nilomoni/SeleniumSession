package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

         //Find all links on the page
		//Print the total links count
		//print the text of each link

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//1. Find all links on the page
		//need to use anchor tag or by tag name
		
		//
		//need to capture the arraylist to store all the link
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		//Find all links on the page
		
		//need to store it in dynamic array as link count is not fixed and print the total links count
		int linkcount = linkList.size();
		System.out.println("Total links are :"+linkcount );
		
		//2. print the text of each link but avoid the blank text using for loop
		//need traverse using for loop
		//assign --> get total blank list count
		
//		for(int i =0; i<linkcount; i++)
//		{
//			//gettext return string value so we store this in string
//			String text = linkList.get(i).getText();
//			if(text.length()>0)
//			{
//			System.out.println(i + " : " + text);
//			}
		
		//Using for each loop
		//print it with 1,2,3,.....
		int count = 0;
		for(WebElement e :linkList)
		{
			String text = e.getText();
			if(text.length()>0)
			{
			System.out.println(count + ": " + text);
			}
			count++;
		}
		
		}

	}


