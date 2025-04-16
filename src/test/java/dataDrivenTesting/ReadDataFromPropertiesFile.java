package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		//Convert Property  file ino the java object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		//Create oject or property file
		Properties property = new Properties();
		
		//load the properties
		property.load(fis);
		
		//Fetch the data from properties object
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("username"));
		
		
	}
}
