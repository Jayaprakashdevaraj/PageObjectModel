package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{

	
		@BeforeTest
		public void setFile() {
			excelFileName = "CreateLead";
		}
		
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String username , String password, String companyname ,String firstname, String lastname ) throws InterruptedException {
		LoginPage lp= new LoginPage(driver);
		
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyname(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLead()
		.verifyCompanyname();
		
	}
}
