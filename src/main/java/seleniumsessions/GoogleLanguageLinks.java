package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//capture the count of the text link
		List<WebElement> langLinks= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langLinks.size());
		
		for(WebElement e : langLinks)
		{
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("বাংলা"))
			{
				e.click();
				break;
			}
		}
		
		//1. click on specific languge with a method
		//2. return the list of lang links with a method
		//3. capture the footer link with a method

	}

}
