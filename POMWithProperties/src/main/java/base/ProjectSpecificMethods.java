package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	public static Properties prop;
	
	@Parameters({"language"})
	@BeforeMethod
	public void startApp(String lang) throws IOException {
		
	    FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties"); 
		prop = new Properties();
		prop.load(fis);
		
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
