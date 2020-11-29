package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	
	
public CreateLeadPage enterCompanyname(String companyname) {
	driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
	return this;
	
}
public CreateLeadPage enterFirstName(String firstname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	return this;
}
public CreateLeadPage enterLastName(String lastname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	return this;
}
public ViewLeadPage clickCreateLead() {
	driver.findElementByName("submitButton").click();	
	return new ViewLeadPage(driver);
}
	
	
	
	


}
