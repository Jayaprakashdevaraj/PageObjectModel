package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage clickLogout() {
		driver.findElementByClassName(prop.getProperty("HomePage.Logout.ClassName")).click();
		return new LoginPage(driver);
	}

	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText(prop.getProperty("HomePage.Crmsfa.LinkText")).click();
		return new MyHomePage(driver);

	}

}
