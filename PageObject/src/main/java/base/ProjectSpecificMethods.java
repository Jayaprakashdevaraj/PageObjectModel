package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	public void startApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
	return ReadExcel.readData(excelFileName);	
	}
	
}
