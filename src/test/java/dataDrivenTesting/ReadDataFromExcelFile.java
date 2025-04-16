package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//****dependancies--Apache poi add to access the Excel file	
	
		//Converting Excel file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Properties.xlsx");
		
		//Downlode apache poi dependancies from the Mevan repository to excess desktop standlone file.
        //Fetching the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the sheets
		Sheet sh = wb.getSheet("Data");
		
		//Fetch the row
		Row r = sh.getRow(2);
		
		//fetch the Cell
		Cell c = r.getCell(1);
		
		//Fetchig the string value
		//String data = c.getStringCellValue();
		
		//Fetching the Integer value
		double num = c.getNumericCellValue();
		
		//If we want to read all type of data into String
		String d = c.toString();
		//String d1 = sh.getRow(2).getCell(1).toString();
		
		//System.out.println(data);
		System.out.println(num);
		System.out.println(d);
		
		//Close the workbook
		wb.close();
		
	
	
	}

}





