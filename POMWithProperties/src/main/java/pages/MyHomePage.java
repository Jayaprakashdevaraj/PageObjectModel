package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	public MyLeadPage clickLead() {
		System.out.println(driver.findElementByLinkText(prop.getProperty("MyHomePage.Leads.LinkText")));
		driver.findElementByLinkText(prop.getProperty("MyHomePage.Leads.LinkText")).click();
		return new MyLeadPage(driver);
	}
	
}
