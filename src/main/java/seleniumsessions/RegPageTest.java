package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "Chrome";
		
		BrowserUtil brutil = new BrowserUtil();
		
		WebDriver driver = brutil.initDriver(browserName);
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brutil.getPageTitle();
		System.out.println(title);
		
		//by locators : 
		By firstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By eMail = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		//to perform the sendkeys operation we need to call the ElementUtil class
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Nilomoni");
		eleUtil.doSendKeys(LastName, "Bhattacherjee");
		eleUtil.doSendKeys(eMail, "nilomoni@gmail.com");
		eleUtil.doSendKeys(telephone, "9876543210");
		eleUtil.doSendKeys(password, "Test@1234");
		eleUtil.doSendKeys(confirmPassword, "Test@1234");

	}

}
