package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Handelingpropertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Commondata.property");
       Properties p =new Properties();
       p.load(fis);
       String Url=p.getProperty("url");
       String Un=p.getProperty("username");
       String Pw=p.getProperty("password");
       System.out.println(Url);
       System.out.println(Un);
       System.out.println(Pw);
	}

}
