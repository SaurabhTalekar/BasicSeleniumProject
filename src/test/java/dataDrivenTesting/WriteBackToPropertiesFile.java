package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Convert the property object to the java obj
		FileInputStream fes = new FileInputStream("./src/test/resources/data.properties");
		
		//Create the property object
		Properties property = new Properties();
		
		//Load the data to the obj
		property.load(fes);
		
		//write the data
		property.put("Duration", "6-Months");
		
		//Createing new obj for Updated property file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties"); 
		
		//Storing the changes
		property.store(fos,"updated successully");
		
		System.out.println("done");
		
		
	}
}
