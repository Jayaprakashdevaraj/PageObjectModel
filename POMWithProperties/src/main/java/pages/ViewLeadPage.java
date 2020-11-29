package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import junit.framework.Assert;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	public void verifyCompanyname() {
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		if(text.contains("Exela Technologies")) {
			System.out.println("Create lead pass");
		}else {
			System.out.println("Create lead fail");
		}
		
	}
	

}
