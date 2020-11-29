package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;
import base.ProjectSpecificMethodsPageFactory;

public class HomePagePageFactory extends ProjectSpecificMethodsPageFactory {

	public HomePagePageFactory(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);  // for pagefactory
	}

	@CacheLookup  //information store in cache memory
	@FindBy(how=How.CLASS_NAME , using="decorativeSubmit") WebElement eleLogout;
	public LoginPagePageFactory clickLogout() {
		eleLogout.click();
		return new LoginPagePageFactory(driver);
	}

}
