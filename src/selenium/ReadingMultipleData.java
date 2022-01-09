package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {

	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        int rowcount=wb.getSheet("Student Details").getLastRowNum();
        System.out.println(rowcount);
        for(int i=1; i<=rowcount;i++)
        {
        	String name=wb.getSheet("Student Details").getRow(i).getCell(1).getStringCellValue();
        	 String cls = wb.getSheet("Student Details").getRow(i).getCell(2).getStringCellValue();
        	System.out.println(name+"  is studing in  "  + cls + "   class  " );
        }
	}

}
