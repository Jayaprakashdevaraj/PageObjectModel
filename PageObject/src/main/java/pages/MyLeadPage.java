package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {

	public MyLeadPage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);
	}
}
