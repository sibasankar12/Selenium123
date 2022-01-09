package qsp;

import java.awt.AWTException;
import java.io.IOException;


public class Robototics {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException, AWTException
	{
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();
	
	
	

	}

}
