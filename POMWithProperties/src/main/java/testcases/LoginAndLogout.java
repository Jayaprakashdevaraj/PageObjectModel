package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods{
	
	/*
	 * @Test public void loginAndLogout(String username , String password) throws
	 * InterruptedException { LoginPage lp= new LoginPage(driver);
	 * lp.enterUsername(username) .enterPassword(password)
	 * .clickLogin().clickCRMSFA().clickLead(); }
	 */
	
	@Test
	public void loginAndLogout() throws InterruptedException {
		LoginPage lp= new LoginPage(driver);
		lp.enterUsername("DemoCSR2")
		.enterPassword("crmsfa")
		.clickLogin().clickCRMSFA().clickLead();
	}



}
