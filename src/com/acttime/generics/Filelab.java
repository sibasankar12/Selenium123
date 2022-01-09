package com.acttime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for Data driven Testing.
 * @author SibaSankar
 *
 */
public class Filelab {
/**
 * This is a generic method  to read the data from property file. 
 * @param key
 * @return
 * @throws IOException
 */
public String getpropertyData(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	System.out.println(data);
	return data;
}
/**
 * This is a  generic method to read the data from Excel file.
 * @param Sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String Sheetname, int row,int cell ) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
   String data = wb.getSheet("Student Details").getRow(row).getCell(cell).getStringCellValue();
   return data;
}
/**
 * This is a generic method to write the data to Excel file.
 * @param Sheetname
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String Sheetname, int row, int cell, String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/Testscript1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	 wb.getSheet("Student Details").getRow(row).getCell(cell).setCellValue(data);
	 FileOutputStream fos=new FileOutputStream("./data/Testscript1.xlsx");
	 wb.write(fos);
	 wb.close();
}


}
