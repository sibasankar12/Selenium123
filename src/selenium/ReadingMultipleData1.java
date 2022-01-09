package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       int rowcount = wb.getSheet("Student Details").getLastRowNum();
       int cellcount=wb.getSheet("Student Details").getRow(0).getLastCellNum();
       for(int i=1; i<=rowcount ; i++)
       {
    	 for(int j=0;j<=cellcount;j++)  
    	 {
    		 String data = wb.getSheet("Student Details").getRow(i).getCell(j).getStringCellValue();
    		 System.out.println(data);
    	 }
       }
       
	}

}
