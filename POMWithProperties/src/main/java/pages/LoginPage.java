package pages;

import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(ChromeDriver driver) {
		this.driver =driver;

	}
	
	public LoginPage enterUsername(String username) throws InterruptedException {
		
		driver.findElementById(prop.getProperty("LoginPage.Username.Id")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById(prop.getProperty("LoginPage.Password.Id")).sendKeys(password);
		return this;

	}

	public HomePage clickLogin() {

		driver.findElementByClassName(prop.getProperty("LoginPage.Login.ClassName")).click();
		return new HomePage(driver);
	}

}
