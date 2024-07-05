package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		int imageCount = imageList.size();
		System.out.println("Total images are :"+imageCount );
		
		//assign ---->>count and rpint the etxtfields number in registration page
		
		//FE   vs    FES
		//WE         List<WebElement>
		//NSE        Emptylist --> size = 0
		//Action     No action
		

	}

}
