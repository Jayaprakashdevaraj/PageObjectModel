package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import base.ProjectSpecificMethodsPageFactory;
import pages.LoginPage;
import pages.LoginPagePageFactory;

public class LoginAndLogoutPageFactory extends ProjectSpecificMethodsPageFactory{
	

	
	@Test
	public void loginAndLogout() throws InterruptedException {
		LoginPagePageFactory lp= new LoginPagePageFactory(driver);
		lp.enterUsername("demosalesmanager")
		.enterPassword("crmsfa")
		.clickLogin().clickLogout();
	}



}
