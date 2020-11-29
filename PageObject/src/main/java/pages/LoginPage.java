package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	
	public LoginPage enterUsername(String username) throws InterruptedException {
		driver.findElementById("username").sendKeys(username);
		Thread.sleep(5000);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;

	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}

}
