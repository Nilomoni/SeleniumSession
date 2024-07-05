package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementnotPresent {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive");
		By search = By.name("search123");
		
		boolean b = driver.findElement(logo).isDisplayed();
		System.out.println(b);
		
		boolean c = driver.findElement(search).isDisplayed();
		System.out.println(c);
		

	}
	

}
