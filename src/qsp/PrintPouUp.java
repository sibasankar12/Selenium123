package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPouUp 
{
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_3);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.close();
	
	
	

	}

}
