package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

     public static void main(String[] arg) throws IOException {
    	 
    	 //Converting the Excel file to a java object
    	 FileInputStream fis = new FileInputStream(".C:\\Users\\Saurabh\\OneDrive\\Desktop\\Properties.xlsx");
    	 
    	 
    	 //Create the workbook (Fetch the excel file)
    	 Workbook wb = WorkbookFactory.create(fis);
    	 
    	 //Fetching the Sheet
    	 Sheet sh = wb.getSheet("Sheet1");
    	 
    	 for(int i=0; i<sh.getLastRowNum(); i++) {
    		 
    		 System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
    	 }
		
    	 wb.close();
	 }
}


	

