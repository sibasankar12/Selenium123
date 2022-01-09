package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandelingEx {
	
	public static void main(String[] args) throws  IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String data = wb.getSheet("Student Details").getRow(1).getCell(1).getStringCellValue();
        System.out.println(data);
	}

}

