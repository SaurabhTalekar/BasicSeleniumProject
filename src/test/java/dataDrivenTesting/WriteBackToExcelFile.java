package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackToExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Creating a java object
		FileInputStream fis = new FileInputStream("C:\\Users\\Saurabh\\OneDrive\\Desktop\\Properties.xlsx");
		
		//Create a Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Fetch the row
		//Row r = sh.getRow(4);
		
		//Create the new row
		Row r = sh.createRow(5);
		
		//Create the cell
		Cell c = r.createCell(6);
		
		//Pass the data
		c.setCellValue("Selenium");
		
		//Save the excel file
		FileOutputStream fos = new FileOutputStream("‪‪‪C:\\Users\\Saurabh\\OneDrive\\Desktop\\Properties.xlsx");
		wb.write(fos);
		
		//Close the workbook
		wb.close();
		
		System.out.println("Done");

		
	}


}
