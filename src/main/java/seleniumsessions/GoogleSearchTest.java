package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;
	
	
	public static void doSearch(By suggListLocator , String suggName)
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

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Nilomoni");
		
		Thread.sleep(3000);
		
		
		By googlesuggListLocator = By.xpath("//li[@role='presentation']//div[@class='eIPGRd']");
		doSearch(googlesuggListLocator , "Nilmani Phookan Jr — Indian poet");
		//32:39
		
		//capture the listcount of the suggestion
//		List <WebElement> suggList = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='eIPGRd']"));
//		System.out.println(suggList.size());
//		
//		for(WebElement e : suggList)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.contains("Nilmani Phookan Jr — Indian poet"))
//				e.click();
//			break;
//		}


	}


}
