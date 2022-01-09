package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writingdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("Student Details").getRow(1).getCell(4).setCellValue("pass");
        FileOutputStream fos=new FileOutputStream("./data/Testscript1.xlsx");
        wb.write(fos);
        wb.close();
	}

}
