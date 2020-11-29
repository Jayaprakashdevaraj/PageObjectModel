package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnToReadDataFromProperties {
	
	public static void main(String[] args) throws IOException {
		
		//set file path foe interaction
	    FileInputStream fis = new FileInputStream("./src/test/resources/config.properties"); 
		
		// create object for properties
		Properties prop = new Properties();
		
		
		//Load properties
		prop.load(fis);
		
		//method to get the data from properties file
		String uname = prop.getProperty("username");
		String pword = prop.getProperty("password");
		
		
		System.out.println(uname);
		System.out.println(pword);
		
	
	
	
	
	
	
	
	}

}
