package pages;

import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;
import base.ProjectSpecificMethodsPageFactory;

public class LoginPagePageFactory extends ProjectSpecificMethodsPageFactory {

	public LoginPagePageFactory(ChromeDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);  // for pagefactory
	}
	
	@CacheLookup  //information store in cache memory
	@FindBy(how=How.ID , using="username") WebElement eleUsername;
	public LoginPagePageFactory enterUsername(String username) throws InterruptedException {
		eleUsername.sendKeys(username);
		return this;
	}

	
	@CacheLookup  //information store in cache memory
	@FindBy(how=How.ID , using="password") WebElement elePassword;
	public LoginPagePageFactory enterPassword(String password) {
		elePassword.sendKeys(password);
		return this;
	}

	
	@CacheLookup  //information store in cache memory
	@FindBy(how=How.CLASS_NAME , using="decorativeSubmit") WebElement eleLogin;
	public HomePagePageFactory clickLogin() {
		eleLogin.click();
		return new HomePagePageFactory(driver);
	}

}
