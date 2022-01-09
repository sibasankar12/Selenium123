package selenium;

import java.io.IOException;

import com.acttime.generics.Filelab;

public class Demo {

	public static void main(String[] args) throws IOException {
	Filelab f=new Filelab();
	String url=f.getpropertyData("url");
	System.out.println(url);
	f.setExcelData("Student Details", 1, 4, "skipped");
	System.out.println(f.getExcelData("Student Details", 1, 4));

	}

}
